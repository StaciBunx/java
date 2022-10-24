// 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class S2_Task01 {

    public static int[] sortBubble(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(S2_Task01.class.getName());
        FileHandler fh = new FileHandler("logger1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = (len - 1); j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    logger.log(Level.INFO, "Поменяли местами значение " + array[j - 1] + " и значение " + array[j]);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] myArray = { 11, 5, 17, 1, 109, 2 };
        System.out.println("Исходный массив:\n" + Arrays.toString(myArray));
        System.out.println("Отсортированный массив:\n" + Arrays.toString(sortBubble(myArray)));
    }
}
