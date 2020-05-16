package pl.gadzinski.factory;

public class Archer extends BaseMonster implements Monster {
    public Archer(Integer attack, Integer defend) {
        super(attack, defend);
    }

    public void attack() {
        System.out.println("Attack with bow");
    }

    public void defend() {
        System.out.println("Defend with bow");

    }

    public void walk() {
        System.out.println("Walking");

    }
}
