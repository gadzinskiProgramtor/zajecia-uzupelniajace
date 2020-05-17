package pl.gadzinski.hexagonal.domain;

import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(String name, String description, ProductCategory category, Double weight) throws ProductAlreadyExistException {
        List<Product> productFromCategory = productRepository.findByCategory(category);
        boolean productWithSameNameExistInCategory=productFromCategory.stream()
                .filter(product->product.getName().equals(name))
                .findAny()
                .isPresent();

        if (productWithSameNameExistInCategory){throw new ProductAlreadyExistException("Product with name "+name+" exist in category "+category);}

        return productRepository.save(new Product(name,description,category,weight));
    }
}
