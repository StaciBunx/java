public class Kite implements Shield {

    @Override
    public Integer protect() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Kite %d", protect());
    }

}
