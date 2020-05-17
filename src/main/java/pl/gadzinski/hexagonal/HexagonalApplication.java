package pl.gadzinski.hexagonal;

import pl.gadzinski.hexagonal.domain.ProductAlreadyExistException;
import pl.gadzinski.hexagonal.domain.ProductService;
import pl.gadzinski.hexagonal.domain.port.ProductNotifier;
import pl.gadzinski.hexagonal.infrastructure.textfile.ProductFromTextFileRepository;

public class HexagonalApplication {
    public static void main(String[] args) throws ProductAlreadyExistException {
        ProductNotifier productNotifier = null;
        ProductService productService = new ProductService(new ProductFromTextFileRepository(), productNotifier);
        productService.addProduct(null,null,null,null);
    }
}
