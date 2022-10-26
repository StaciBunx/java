package Homework;
//2) Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class S3Task02 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(1, 11));
        }
        System.out.printf("Исходный список: " + list + "\n");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;

            }
        }

        System.out.printf("Список без четных чисел: " + list + "\n");

    }

}
