public class Task3 {
    public static void main(String[] args) {
        // Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
        // целочисленный одномерный массив.
        // Метод должен пройтись по каждому элементу и проверить что он не равен null.
        // А теперь реализуйте следующую логику:
        // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
        // пользователя
        // Если null’ы встретились в нескольких ячейках, то идеально было бы все их
        // “подсветить”
        Integer[] arr = { 2, null, null };
        // int[] arr2 = new int[5];
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("По индексу " + i + " элемент null");
            }
        }
    }

}