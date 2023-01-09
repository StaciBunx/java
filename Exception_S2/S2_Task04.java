
/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
import java.util.Scanner;

public class S2_Task04 {

    public static void getMessage() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input message: ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            throw new Exception("Empty strings are not allowed!");
        }
    }

    public static void main(String[] args) throws Exception {
        getMessage();

    }
}
