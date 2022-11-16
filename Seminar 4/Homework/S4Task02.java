
/**
 *Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 *
*/

import java.util.LinkedList;
import java.util.Scanner;

public class S4Task02 {

    public static void enqueue(LinkedList<String> ll) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент, чтобы добавить его: ");
        String element = scanner.nextLine();
        ll.addLast(element);
        System.out.println("Новый список:" +ll);
    }

    public static void dequeue(LinkedList<String> ll) {
        System.out.println("Первый элемент со значением " + ll.removeFirst()+ " удален.");

    }

    public static void first(LinkedList<String> ll) {
        System.out.println("Первый элемент: " + ll.peekFirst());

    }

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("G");
        ll.add("D");
        ll.add("12");
        ll.add("X");
        ll.add("3");
        System.out.println("Ваш список:" +ll);
        enqueue(ll);
        dequeue(ll);
        first(ll);

    }
}
