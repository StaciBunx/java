
/**
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class S1Task01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите N: ");
        int n = iScanner.nextInt();
        // вычисление треугольного числа
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Треугольное число при n = %d, равно: %d.\n", n, sum);
        // вычисление факториала
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Факториал числа n = %d, равно: %d.", n, fact);

        iScanner.close();

    }
}