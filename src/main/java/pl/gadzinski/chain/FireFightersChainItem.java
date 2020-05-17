package pl.gadzinski.chain;

public class FireFightersChainItem implements ChainItem {
    @Override
    public boolean test(String value) {
        return value.contains("fireFighters")||value.contains("fire fighter");
    }

    @Override
    public void action(String value) {
        System.out.println("Calling to nearest fire fighters");
    }
}
