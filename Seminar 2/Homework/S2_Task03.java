
//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;

public class S2_Task03 {
    public static boolean isPalindrome(String text) {
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertText = strBuilder.toString();
        return text.equalsIgnoreCase(invertText);
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String text = iScanner.nextLine();
        System.out.println(isPalindrome(text));
        iScanner.close();
    }
}
