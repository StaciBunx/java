
public abstract class Warrior {
    private String name;
    private Integer healthPoint;
    private Weapon weapon;

    public Warrior(String name, Integer healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
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

    @Override
    public String toString() {
        return String.format("weapon: %s; name: %s; health: %d; ", weapon, name, healthPoint);
    }
}