
/**
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.LinkedList;

public class S4Task01 {

    public static LinkedList<String> reverseLL(LinkedList<String> ll) {
        LinkedList<String> reverseLL = new LinkedList<String>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reverseLL.add(ll.get(i));
        }
        return reverseLL;
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("G");
        ll.add("D");
        ll.add("12");
        ll.add("X");
        ll.add("3");

        System.out.println(ll);
        System.out.println(reverseLL(ll));
    }
}