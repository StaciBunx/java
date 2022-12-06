public class Archer extends Warrior<Bow, Kite> {
    private Integer range;

    public Archer(String name, Integer healthPoint, Bow weapon, Integer range, Kite shield) {
        super(name, healthPoint, weapon, shield);
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
