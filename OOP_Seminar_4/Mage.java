public class Mage extends Warrior<Staff, Heater> {
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon, Integer range, Integer mana, Heater shield) {
        super(name, healthPoint, weapon, shield);
        this.mana = mana;
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Mage - %srange: %d; mana: %d; ", super.toString(), range, mana);
    }

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }
}
