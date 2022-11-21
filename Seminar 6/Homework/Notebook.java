import java.util.*;

public class Notebook {
    String brand;
    String memory;
    String color;
    String os;

    public Notebook(
            String brand,
            String memory,
            String color,
            String os) {
        this.brand = brand;
        this.memory = memory;
        this.color = color;
        this.os = os;
    }


    public static void filterByBrand(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.brand.contains(input)) {
                result.put(String.format("Search result № %d", count), notebook);
                count++;
            }
        }
    }

    public static void filterByMemory(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.memory.contains(input)) {
                result.put(String.format("Search result № %d", count), notebook);
                count++;
            }
        }
    }

    public static void filterByColor(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.color.contains(input)) {
                result.put(String.format("Search result № %d", count), notebook);
                count++;
            }
        }
    }

    public static void filterByOs(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.os.contains(input)) {
                result.put(String.format("Search result № %d", count), notebook);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Brand: %s\nMemory: %s\nColor: %s\nOs: %s", this.brand, this.memory,
                this.color, this.os);
    }

}
