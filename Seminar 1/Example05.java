
// Даны два числа, проверить является ли одно квадратом другого
// 5 25 Да
// 25 5 Да
// 2 3 Нет
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter a number A: ");
        int a = iScanner.nextInt();
        System.out.println("Enter a number B: ");
        int b = iScanner.nextInt();
        if ((a == b * b) || (b == a * a)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
        iScanner.close();
    }

}
