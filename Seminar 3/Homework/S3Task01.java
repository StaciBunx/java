package Homework;

// 1) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class S3Task01 {

    public static void mergeSort(int[] myArray, int leftPart, int rigthPart) {
        if (rigthPart <= leftPart)
            return;
        int mid = (leftPart + rigthPart) / 2;
        mergeSort(myArray, leftPart, mid);
        mergeSort(myArray, mid + 1, rigthPart);
        merge(myArray, leftPart, mid, rigthPart);
    }

    public static void merge(int[] myArray, int leftPart, int mid, int rightPart) {

        int leftLength = mid - leftPart + 1;
        int rightLength = rightPart - mid;

        int leftArray[] = new int[leftLength];
        int rightArray[] = new int[rightLength];

        for (int i = 0; i < leftLength; i++)
            leftArray[i] = myArray[leftPart + i];
        for (int i = 0; i < rightLength; i++)
            rightArray[i] = myArray[mid + i + 1];

        int i = 0;
        int j = 0;

        for (int idx = leftPart; idx < rightPart + 1; idx++) {
            if (i < leftLength && j < rightLength) {
                if (leftArray[i] < rightArray[j]) {
                    myArray[idx] = leftArray[i];
                    i++;
                } else {
                    myArray[idx] = rightArray[j];
                    j++;
                }
            } else if (i < leftLength) {
                myArray[idx] = leftArray[i];
                i++;
            } else if (j < rightLength) {
                myArray[idx] = rightArray[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 15, 45, 3, -15, 10, 24, 0, -1, 12 };
        System.out.printf("Исходный массив: " + Arrays.toString(arr) + "\n");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr) + "\n");

    }
}
