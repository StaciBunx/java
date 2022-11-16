// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.Scanner;
import java.util.LinkedList;

public class Example02 {

    static LinkedList<String> addElement(LinkedList<String> temp_list, String[] temp) {
        return temp_list.add(Integer.parseInt(temp[1]), temp[0]);
    }

    static LinkedList<String> deleteElement(LinkedList<String> temp_list, int i) {
        System.out.println(temp_list.get(i));
        temp_list.remove(i);
        return temp_list;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        String elem = new String();

        while (true) {
            System.out.print("Введите текст: ");
            elem = input.next();
            if (elem.equals("stop")) {
                break;
            }
            String[] split_elem = elem.split("~");
            if (split_elem[0].equals("print")) {
                int index = Integer.parseInt(split_elem[1]);
                deleteElement(ll, index);
            } else {
                addElement(ll, split_elem);
            }
            input.close();
            System.out.println(ll);
        }

    }
}
