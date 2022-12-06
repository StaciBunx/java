
public abstract class Warrior<T extends Weapon, E extends Shield> {
    private String name;
    private Integer healthPoint;
    private T weapon;
    private E shield;

    public Warrior(String name, Integer healthPoint, T weapon, E shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;

    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public E getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return String.format("weapon: %s; shield: % s; name: %s; health: %d; ", weapon, shield, name, healthPoint);
    }

}