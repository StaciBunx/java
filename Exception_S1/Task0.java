/**
 * Task0
 */
public class Task0 {

    public static void main(String[] args) {
        int[] array = { 1, 5, 32, 8, 84 };
        System.out.println(getArrLength(array));
    }

    private static int getArrLength(int[] array) {
        int min = 10;
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}