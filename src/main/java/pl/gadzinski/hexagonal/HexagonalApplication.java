package pl.gadzinski.hexagonal;

import pl.gadzinski.hexagonal.domain.ProductAlreadyExistException;
import pl.gadzinski.hexagonal.domain.ProductService;
import pl.gadzinski.hexagonal.infrastructure.textfile.ProductFromTextFileRepository;

public class HexagonalApplication {
    public static void main(String[] args) throws ProductAlreadyExistException {
        ProductService productService = new ProductService(new ProductFromTextFileRepository());
        productService.addProduct(null,null,null,null);
    }
}
