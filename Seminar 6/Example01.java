import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
 */

public class Example01 {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<Integer>(); // не хранит очередность
        set1.add(9);
        set1.add(2);
        set1.add(1);
        set1.add(4);
        System.out.println(set1);

        Set <Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set2); // хранит очередность

        Set <Integer> set3 = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set3); //сортирует
    }
}
