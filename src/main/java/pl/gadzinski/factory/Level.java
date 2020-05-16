package pl.gadzinski.factory;

public enum Level {
    NORMAL (1), NIGHTMARE (15), HEROIC (30);

    private Integer value;

    Level(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
