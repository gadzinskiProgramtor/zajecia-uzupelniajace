package pl.gadzinski.hexagonal.domain;

import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FakeProductRepository implements ProductRepository {
    @Override
    public Product save(Product product) {
        return new Product(1L,product.getName(),product.getDescription(),product.getCategory(),product.getWeight());
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> findByCategory(ProductCategory category) {
        return Arrays.asList(
                new Product(1L,"product-1","product-description",category,1.8),
                new Product(2L,"product-4","product-description",category,2.2),
                new Product(3L,"product-6","product-description",category,1.1),
                new Product(4L,"product-8","product-description",category,1.6)
        );
    }
}
