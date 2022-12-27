public class Task1 {
    public static void main(String[] args) {

        int[] array = { 1, 5, 32, 8, 84, 3 };
        int element = 3;
        findElement(array, element);

    }

    private static int findElement(int[] array, int element) {
        int min = 5;
        if (array == null) {
            return -3;
        }

        if (array.length < min) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(i);
                break;
            }
        }
        return -2;

    }

}
