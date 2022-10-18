
/**
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!", name);
        iScanner.close();

    }
}