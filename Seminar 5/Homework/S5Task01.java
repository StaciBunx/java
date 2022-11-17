import java.util.HashMap;
import java.util.List;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 */
public class S5Task01 {

    public static void main(String[] args) {

        HashMap<String, List<String>> phonebookHashMap = new HashMap<>();
        phonebookHashMap.put("Anastasia", List.of("89254568975"));
        phonebookHashMap.put("Iliya", List.of("89055462353", "89037566225"));
        phonebookHashMap.put("Maria", List.of("89254574975"));
        phonebookHashMap.put("Tatiana", List.of("89055783353", "89037561125"));

        for (var item : phonebookHashMap.entrySet()) {
            System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());

        }
    }
}