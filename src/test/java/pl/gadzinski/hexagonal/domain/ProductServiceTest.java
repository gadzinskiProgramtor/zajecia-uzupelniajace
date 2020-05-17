package pl.gadzinski.hexagonal.domain;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import pl.gadzinski.hexagonal.domain.port.ProductNotifier;
import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import java.util.Arrays;

public class ProductServiceTest {

    @Test
    public void shouldCreateProduct() throws ProductAlreadyExistException {
        //given
         String name = "product-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight =1.5;


        ProductRepository mock = Mockito.mock(ProductRepository.class);
        Mockito.when(mock.findByCategory(ProductCategory.PHONE))
                .then(invocationOnMock -> Arrays.asList(
                        new Product(1L,"product-1","product-description",ProductCategory.PHONE,1.8),
                        new Product(2L,"product-4","product-description",ProductCategory.PHONE,2.2),
                        new Product(3L,"product-6","product-description",ProductCategory.PHONE,1.1),
                        new Product(4L,"product-8","product-description",ProductCategory.PHONE,1.6)
                ));
        Mockito.when(mock.save(Mockito.any()))
                .then(invocationOnMock -> new Product(1L,name,description,category,weight));

        ProductNotifier productNotifier=Mockito.mock(ProductNotifier.class);
        ProductService productService1 = new ProductService(mock, productNotifier);
        //when

        Product actualProduct = productService1.addProduct(name,description,category,weight);

        //then
        Product expectedProduct = new Product(1L,name, description, category, weight);

        Assert.assertEquals("Product is different", expectedProduct,actualProduct);
        Mockito.verify(productNotifier,Mockito.times(1))
                .notifyAboutNewProduct(expectedProduct.getId());
    }
    @Test(expected = ProductAlreadyExistException.class)
    public void shouldThrowProductAlreadyExistExceptionWhileTryingToCreateProductWithSameName() throws ProductAlreadyExistException {
        //given
        ProductRepository mock = Mockito.mock(ProductRepository.class);
        Mockito.when(mock.findByCategory(Mockito.any())).then(invocationOnMock -> Arrays.asList(new Product(1L,"duplicated-name", null,null,null)));

        String name = "duplicated-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight =1.5;


        ProductService productService = new ProductService(mock, Mockito.mock(ProductNotifier.class));
                //when

        productService.addProduct(name,description,category,weight);

    }

    @Test
    public void shouldNotNotifyAboutCreationWhileTryingToCreateProductWithSameName()  {
        //given
        ProductRepository mock = Mockito.mock(ProductRepository.class);
        Mockito.when(mock.findByCategory(Mockito.any())).then(invocationOnMock -> Arrays.asList(new Product(1L,"duplicated-name", null,null,null)));

        String name = "duplicated-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight =1.5;


        ProductNotifier classToMock = Mockito.mock(ProductNotifier.class);
        ProductService productService = new ProductService(mock, classToMock);
        //when
try {

    productService.addProduct(name,description,category,weight);
}catch (ProductAlreadyExistException e){
    //ignored
}
        Mockito.verify(classToMock,Mockito.never()).notifyAboutNewProduct(Mockito.any());
    }

}