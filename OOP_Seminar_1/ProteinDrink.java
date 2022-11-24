public class ProteinDrink extends Product {
    Integer energy;
    Integer protein;


    public ProteinDrink(String name, Double price) {
        super(name, price);
    }

    public ProteinDrink(String name) {
        super(name);
    }

    public ProteinDrink(String name, Double price, Integer energy, Integer protein) {
        super(name, price);
        this.energy = energy;
        this.protein = protein;
    }

 @Override
 public String toString() {
    return String.format("%s Ккал: %d Белок: %d", super.toString(), energy, protein);
 }

}
