// 4*. К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class S2_Task04 {

    public static int calc(int x, int y, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        // Создаем логгер
        try {
            Logger logger = Logger.getLogger(S2_Task04.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fh = new FileHandler("logger4.txt");
            logger.addHandler(fh);
            SimpleFormatter sform = new SimpleFormatter();
            fh.setFormatter(sform);
            // Запускаем программу калькулятора
            Scanner iScanner = new Scanner(System.in);

            System.out.printf("Введите первое рациональное число: ");
            int x = iScanner.nextInt();
            logger.log(Level.INFO, "Пользовательно ввел" + x);

            System.out.printf("Введите второе рациональное число: ");
            int y = iScanner.nextInt();
            logger.log(Level.INFO, "Пользовательно ввел " + y);

            System.out.printf("Введите операцию с числами (+,-,*, /): ");
            char operation = iScanner.next().charAt(0);
            logger.log(Level.INFO, "Пользовательно ввел " + operation);
            iScanner.close();

            int answer = calc(x, y, operation);
            logger.log(Level.INFO, "Ответ: " + x + operation + y + "=" + answer);
            System.out.printf("%d %s %d = %d", x, operation, y, answer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
