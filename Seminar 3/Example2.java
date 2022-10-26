import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран.
 */
public class Example2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(1, 11));
        }
        // list.sort(null);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

    }
}