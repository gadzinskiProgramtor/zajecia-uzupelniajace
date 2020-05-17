package pl.gadzinski.hexagonal.infrastructure.textfile;

import pl.gadzinski.hexagonal.domain.Product;
import pl.gadzinski.hexagonal.domain.ProductCategory;
import pl.gadzinski.hexagonal.domain.port.ProductRepository;

import java.util.List;

public class ProductFromTextFileRepository implements ProductRepository {
    public Product save(Product product) {
        return null;
    }

    public List<Product> findAll() {
        return null;
    }

    public List<Product> findByCategory(ProductCategory category) {
        return null;
    }
}
