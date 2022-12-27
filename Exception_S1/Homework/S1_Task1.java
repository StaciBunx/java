package Homework;

/**
 * /*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class S1_Task1 {

    public static void printArrayIndex(int[] array, int i) {
        System.out.println(array[i]);
    }

    public static int[] createArray(int size) {
        int array[] = new int[size];
        return array;
    }

    public static String makeString(Object object) {
        return (String) object;
    }

    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        int array[] = { 1, 2, 3 };
        int i = 4;
        printArrayIndex(array, i);

        // java.lang.NegativeArraySizeException
        int size = -5;
        createArray(size);

        // java.lang.ClassCastException
        Object object = Integer.valueOf(55);
        makeString(object);

    }
}