// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

// 2) Написать метод, который принимает массив элементов, помещает их в linkedList и затем выводит его.

import java.util.*;

public class Example03 {
    public static void AddStack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void AddLinkedList(int[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }
        System.out.println(ll);
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 10, 4, 6, 9, 99 };
        AddStack(arr);
        AddLinkedList(arr);
    }
}
