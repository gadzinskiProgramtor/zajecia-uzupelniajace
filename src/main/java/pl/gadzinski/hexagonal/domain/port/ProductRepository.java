package pl.gadzinski.hexagonal.domain.port;

import pl.gadzinski.hexagonal.domain.Product;
import pl.gadzinski.hexagonal.domain.ProductCategory;

import java.util.List;

public interface ProductRepository {
Product save(Product product);
List<Product> findAll();
List<Product> findByCategory(ProductCategory category);
}
