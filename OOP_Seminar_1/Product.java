/**
 * Product
 */
public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double value) {
        if (value <= 0) {
            return;
        }
        this.price = value;

    }

    @Override
    public String toString() {
        return String.format("%s: %,.1f", this.getName(), this.getPrice());
    }

}