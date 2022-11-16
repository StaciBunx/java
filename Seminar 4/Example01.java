import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 *
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим.
 */
public class Example01 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long starttime = System.currentTimeMillis();
        for (int i=0; i<10_000; i++) {
            al.add(i);
        }
        System.out.println(System.currentTimeMillis()-starttime);

        long starttime2 = System.currentTimeMillis();
        for (int i=0; i<10_000; i++) {
            ll.add(i);
        }
        System.out.println(System.currentTimeMillis()-starttime);
    }
}
