/**
 * Вывести все простые числа от 1 до 1000
 */

public class S1Task02 {

    static void SimpleNumber(int numb) {
        boolean flag = true;
        for (int i = 2; i <= numb; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    continue;
                }
            }
            if (flag)
                System.out.print(i + " ");
            else
                flag = true;
        }
    }

    public static void main(String[] args) {
        int n = 100;
        SimpleNumber(n);

    }
}
