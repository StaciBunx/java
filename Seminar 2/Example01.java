
/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1
 */

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter 1st symbol: ");
        String c1 = iScanner.nextLine();
        System.out.printf("Enter 2nd symbol: ");
        String c2 = iScanner.nextLine();
        System.out.printf("Enter length: ");
        int n = iScanner.nextInt();
        iScanner.close();
        StringBuilder mystring = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                mystring.append(c1);
            } else
                mystring.append(c2);
        }

        System.out.println(mystring.toString());
    }
}