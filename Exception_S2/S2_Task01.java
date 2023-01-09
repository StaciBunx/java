/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class S2_Task01 {

    public static float getFloat() {
        float input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input float number: ");
        if (sc.hasNextFloat() | sc.hasNextInt() ) {
            input = sc.nextFloat();
            return input;
        } else {
            System.out.println("Invalid input!");
            return getFloat();
        }

    }

    public static void main(String[] args) {
        System.out.println(getFloat());
    }
}
