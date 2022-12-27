package Homework;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. */

public class S2_Task2 {

    public static int[] substractionArr(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Length is not valid");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array2[i] - array1[i];
        }
        return result;
    }

    public static int[] divisionArr(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Length is not valid");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array2[i] / array1[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 0, 33, 15, 25, 56, 26 };
        int[] array2 = { 2, 14, 6, 11, 8 };
        printArray(substractionArr(array1, array2));
        printArray(divisionArr(array1, array2));

    }

}
