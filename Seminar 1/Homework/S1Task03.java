// 3. Реализовать простой калькулятор с рациональными числами

import java.util.Scanner;

public class S1Task03 {
    public static void main(String[] args) {
        int result = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое рациональное число: ");
        int x = iScanner.nextInt();
        System.out.printf("Введите второе рациональное число: ");
        int y = iScanner.nextInt();
        System.out.printf("Введите операцию с числами (+,-,*, /): ");
        char operation = iScanner.next().charAt(0);
        iScanner.close();

        switch (operation) {
            case '+':
                result = x + y;
                // System.out.printf("Result: %d",res);
                break;
            case '-':
                result = x - y;
                // System.out.printf("Result: %d",res);
                break;
            case '*':
                result = x * y;
                ;
                // System.out.printf("Result: %d",res);
                break;
            case '/':
                result = x / y;
                ;
                // System.out.printf("Result: %d",res);
                break;
        }
        System.out.printf("%d %s %d = %d", x, operation, y, result);

    }
}