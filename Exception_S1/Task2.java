/*
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Task2 {

    public static int sumArray(int[][] array) {
        int sum = 0;
        if (!isQuadro(array)) {
            throw new RuntimeException("Массив не квадратный");
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Значение элемента массива должно быть равно 0 или 1");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static boolean isQuadro(int[][] array) {
        int rows = array.length;
        for (int i = 0; i < array.length; i++) {
            if (rows != array[i].length) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] array = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };
        System.out.println(sumArray(array));

    }

}
