import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 *
 * Написать программу, которая найдет и выведет повторяющиеся имена с
 * количеством повторений. Отсортировать по убыванию популярности Имени.
 *
 *
 *
 *
 *
 */

public class S5Task02 {

    public static Map namesCount(String[] arr) {
        // Проходим по массиву,ищем повторения и записываем имя в ключ, а количество
        // повторений в значение
        Map<String, Integer> db = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].split(" ")[0].equals(arr[j].split(" ")[0])) {
                    count++;
                }
            }
            db.putIfAbsent(arr[i].split(" ")[0], count);
            count = 0;
        }
        return db;
    }

    public static void showSortedCount(Map<String, Integer> dataMap) {
        // Сортируем и выводим в консоль
        List<Integer> mapValues = new ArrayList<>(dataMap.values());
        Collections.sort(mapValues);
        System.out.println(mapValues);
        dataMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        String[] names = new String[] {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов",
        };

        showSortedCount(namesCount(names));

    }
}
