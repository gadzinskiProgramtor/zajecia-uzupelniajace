package pl.gadzinski.hexagonal;

import pl.gadzinski.hexagonal.domain.ProductService;
import pl.gadzinski.hexagonal.infrastructure.textfile.ProductFromTextFileRepository;

public class HexagonalApplication {
    public static void main(String[] args) {
        ProductService productService = new ProductService(new ProductFromTextFileRepository());
        productService.addProduct(null,null,null,null);
    }
}
