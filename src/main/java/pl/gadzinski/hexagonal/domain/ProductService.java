package pl.gadzinski.hexagonal.domain;

import pl.gadzinski.hexagonal.domain.port.ProductNotifier;
import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;
    private ProductNotifier productNotifier;

    public ProductService(ProductRepository productRepository, ProductNotifier productNotifier) {
        this.productRepository = productRepository;
        this.productNotifier = productNotifier;
    }

    public Product addProduct(String name, String description, ProductCategory category, Double weight) throws ProductAlreadyExistException {
        List<Product> productFromCategory = productRepository.findByCategory(category);
        boolean productWithSameNameExistInCategory=productFromCategory.stream()
                .filter(product->product.getName().equals(name))
                .findAny()
                .isPresent();

        if (productWithSameNameExistInCategory){throw new ProductAlreadyExistException("Product with name "+name+" exist in category "+category);}

        Product product = productRepository.save(new Product(name, description, category, weight));
        productNotifier.notifyAboutNewProduct(product.getId());
        return product;
    }
}
