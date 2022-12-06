public class Hero extends Warrior {

    public Hero(String name, Integer healthPoint, Weapon weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Hero - %s", super.toString());
    }

}
