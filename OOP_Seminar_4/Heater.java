public class Heater implements Shield{

    @Override
    public Integer protect() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Heater %d", protect());
    }

}
