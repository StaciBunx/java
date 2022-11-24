public class Milk extends Product {
    private Integer fatness;

    public Milk(String name, Double price) {
        super(name, price);
    }

    public Milk(String name) {
        super(name);
    }

    public Milk(String name, Double price, Integer fatness) {
        super(name, price);
        this.fatness = fatness;
    }

    public Integer getFatness() {
        return this.fatness;
    }

    // @Override
    // public String toString() {
    // return String.format("%s %d: %,.1f\n", super.getName(), this.getFatness(),
    // super.getPrice());
    // }

    @Override
    public String toString() {
        return String.format("%s с жирностью %d\n", super.toString(), fatness);
    }
}
