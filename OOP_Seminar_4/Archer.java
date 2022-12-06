public class Archer extends Warrior {
    private Integer range;

    public Archer(String name, Integer healthPoint, Bow weapon, Integer range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer - %srange: %d; ", super.toString(), range);
    }

    public Integer getRange() {
        return range;
    }

}
