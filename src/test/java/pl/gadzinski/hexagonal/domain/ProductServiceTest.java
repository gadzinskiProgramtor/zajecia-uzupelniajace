package pl.gadzinski.hexagonal.domain;

import org.junit.Assert;
import org.junit.Test;
import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    public void shouldCreateProduct() throws ProductAlreadyExistException {
        //given
        ProductService productService = new ProductService(new FakeProductRepository());
        String name = "product-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight =1.5;
        //when

        Product actualProduct = productService.addProduct(name,description,category,weight);

        //then
        Product expectedProduct = new Product(1L,name, description, category, weight);
        Assert.assertEquals("Product is different", expectedProduct,actualProduct);
    }

}