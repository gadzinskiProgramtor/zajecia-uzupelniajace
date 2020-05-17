package pl.gadzinski.chain;

public interface ChainItem {
    boolean test(String value);

    void action(String value);
}
