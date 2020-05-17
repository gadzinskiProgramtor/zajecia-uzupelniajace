package pl.gadzinski.hexagonal.domain.port;

public interface ProductNotifier {
    void notifyAboutNewProduct(Long id);
}
