package Homework;

// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
import java.util.ArrayList;
import java.util.Random;

public class S3Task03 {

    public static void main(String[] args) {
        // создаем список
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(0, 101));
        }
        System.out.printf("Исходный список: " + list + "\n");

        // ищем максимальный элемент
        int max = list.get(0);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > max) {
                max = list.get(i);
                i++;
            } else {
                i++;
            }
        }
        System.out.printf("Максимальный элемент: " + max + "\n");

        // ищем минимальный элемент

        int min = list.get(0);
        i = 0;
        while (i < list.size()) {
            if (list.get(i) < min) {
                min = list.get(i);
                i++;
            } else {
                i++;
            }
        }
        System.out.printf("Минимальный элемент: " + min + "\n");

        // ищем среднее арифметическое

        int averageSum = 0;
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        averageSum = sum / list.size();
        System.out.printf("Среднее арифметическое всех элементов списка: " + averageSum + "\n");
    }

}
