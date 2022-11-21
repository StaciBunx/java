import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
 * цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью
 * Set вычислите процент уникальных значений в данном массиве и верните его в
 * виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее
 * количество чисел в массиве.
 *
 */
public class Example02 {

    public static Integer[] fillArray() {
        Random rand = new Random();
        Integer[] arr = new Integer[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0, 25);
        }
        return arr;
    }

    public static void countElements(Integer[] arr, Set<Integer> set) {
        System.out.print((((double)set.size())*100/((double)arr.length) + "%"));
    }

    public static void main(String[] args) {
        Integer[] arr = fillArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(set1);
        countElements(arr, set1);

    }
}
