package pl.gadzinski.factory;

public abstract class BaseMonster implements Monster {
    private Integer attack;
    private Integer defend;

    public BaseMonster(Integer attack, Integer defend) {
        this.attack = attack;
        this.defend = defend;
    }

    public void attack() {

    }

    public void defend() {

    }

    public void walk() {

    }
}
