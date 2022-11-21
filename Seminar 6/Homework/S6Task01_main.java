import java.util.*;

public class S6Task01_main {

    public static Integer enterFilter() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter for search:\n1 - brand\n2 - memory\n3 - color\n4 - os\n");
        return sc.nextInt();
    }

    public static void showResult(Map<String, Notebook> result) {
        for (var notebook : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", notebook.getKey(), notebook.getValue().toString());
        }
    }

    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Victus", "12", "blue",
                "Gigabyte");
        Notebook notebook2 = new Notebook("Apple", "8", "silver",
                "MSI");
        Notebook notebook3 = new Notebook("Asus", "8", "black",
                "Gigabyte");
        Notebook notebook4 = new Notebook("Asus", "16", "black",
                "Gigabyte");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "brand");
        filter.put(2, "memory");
        filter.put(3, "color");
        filter.put(4, "os");

        Map<String, Notebook> result = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);
        Integer select = enterFilter();

        if (filter.containsKey(select)) {
            switch (select) {
                case 1: {
                    System.out.printf("Enter %s name: \n", filter.get(1));
                    String input = sc.next();
                    Notebook.filterByBrand(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 2: {
                    System.out.printf("Enter memory %s size: \n", filter.get(2));
                    String input = sc.next();
                    Notebook.filterByMemory(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 3: {
                    System.out.printf("Enter %s : \n", filter.get(3));
                    String input = sc.next();
                    Notebook.filterByColor(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 4: {
                    System.out.printf("Enter %s : \n", filter.get(4));
                    String input = sc.next();
                    Notebook.filterByOs(notebooks, input, result);
                    showResult(result);
                    break;
                }

            }
        }

        sc.close();

    }

}
