
//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;

public class S2_Task03 {
    public static boolean isPalindrome(String numb) {
        StringBuilder strBuilder = new StringBuilder(numb);
        strBuilder.reverse();
        String invertNumb = strBuilder.toString();
        return numb.equalsIgnoreCase(invertNumb);
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String numb = iScanner.nextLine();
        System.out.println(isPalindrome(numb));
        iScanner.close();
    }
}
