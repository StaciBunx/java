
/**
 * В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1+2
3
+4
7
Отмена
3
*3
9
 */

import java.util.logging.*;
import java.util.Scanner;
import java.io.IOException;

public class S4Task03 {
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
            default:
                break;

        }
        return result;

    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Создаем логгер
        Logger logger = Logger.getLogger(S4Task03.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("logger4.txt");
        logger.addHandler(fh);
        SimpleFormatter sform = new SimpleFormatter();
        fh.setFormatter(sform);

        // Запускаем программу калькулятора
        Scanner iScanner = new Scanner(System.in);

        // Вычисляем
        while (true) {
            System.out.printf("Введите первое рациональное число: ");
            int x = iScanner.nextInt();
            logger.log(Level.INFO, "Пользовательно ввел " + x);

            System.out.printf("Введите второе рациональное число: ");
            int y = iScanner.nextInt();
            logger.log(Level.INFO, "Пользовательно ввел " + y);

            System.out.printf("Введите операцию с числами (+,-,*, /): ");
            char operation = iScanner.next().charAt(0);
            logger.log(Level.INFO, "Пользовательно выбрал операцию " + operation);
            iScanner.close();

            int answer = calc(x, y, operation);
            logger.log(Level.INFO, "Ответ: " + x + operation + y + "=" + answer);
            System.out.printf("%d %s %d = %d", x, operation, y, answer);
            System.out.println();
            // Спрашиваем о дальнейших действиях
            System.out.println(
                    "Для отмены последнего действия введите 'c'\n Для выхода введите'q'\n Для продолжения введите 'o'");
            String choice = iScanner.next();
            // Отмена
            if (choice.equals("c")) {
                logger.log(Level.INFO, "Пользователь отменил операцию");
                System.out.println("Первое число равно " + x);
                System.out.printf("Введите операцию с числами (+,-,*, /): ");
                operation = iScanner.next().charAt(0);
                logger.log(Level.INFO, "Пользовательно выбрал операцию " + operation);
                System.out.printf("Введите второе рациональное число: ");
                y = iScanner.nextInt();
                logger.log(Level.INFO, "Пользователь ввел " + y);
                answer = calc(x, y, operation);
                logger.log(Level.INFO, "Ответ: " + x + operation + y + "=" + answer);
                System.out.printf("%d %s %d = %d", x, operation, y, answer);
            }
            // Продолжение
            if (choice.equals("o")) {
                logger.log(Level.INFO, "Пользователь продолжает вычисления");
                x = answer;
                System.out.println("Первое число равно " + x);
                System.out.printf("Введите операцию с числами (+,-,*, /): ");
                operation = iScanner.next().charAt(0);
                logger.log(Level.INFO, "Пользовательно выбрал операцию " + operation);
                System.out.printf("Введите второе рациональное число: ");
                y = iScanner.nextInt();
                logger.log(Level.INFO, "Пользователь ввел " + y);
                answer = calc(x, y, operation);
                logger.log(Level.INFO, "Ответ: " + x + operation + y + "=" + answer);
                System.out.printf("%d %s %d = %d", x, operation, y, answer);
            }
            // Выход
            if (choice.equals("q")) {
                logger.log(Level.INFO, "Пользователь завершил программу");
                System.out.println("Программа завершена");
                iScanner.close();
                break;
            }
        }

    }
}
