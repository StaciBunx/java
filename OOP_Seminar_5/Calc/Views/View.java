package Views;

import java.util.Scanner;

import Controllers.UserController;
import Model.Complex;
import Model.Log;

public class View {

    private UserController userController;
    private Log log;

    public View(UserController userController, Log log) {
        this.userController = userController;
        this.log = log;
    }

    public void run() {

        Commands com = Commands.NONE;
        while (true) {
            String command = askForString("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case SUM:
                        Complex complex1 = setComplex("Действительная часть первого числа: ",
                                "Воображаемая часть первого числа: ");
                        Complex complex2 = setComplex("Действительная часть второго числа: ",
                                "Воображаемая часть второго числа: ");
                        Complex result1 = userController.sum(complex1, complex2);
                        System.out.printf("Результат: %s\n", result1);
                        log.WriteLog().info(String.format("(%s) + (%s) = %s", complex1, complex2, result1));
                        break;
                    case MINUS:
                        Complex complex3 = setComplex("Действительная часть первого числа: ",
                                "Воображаемая часть первого числа: ");
                        Complex complex4 = setComplex("Действительная часть второго числа: ",
                                "Воображаемая часть второго числа: ");
                        Complex result2 = userController.minus(complex3, complex4);
                        System.out.printf("Результат: %s\n", result2);
                        log.WriteLog().info(String.format("(%s) - (%s) = %s", complex3, complex4, result2));
                        break;
                    case MULT:
                        Complex complex5 = setComplex("Действительная часть первого числа: ",
                                "Воображаемая часть первого числа: ");
                        Complex complex6 = setComplex("Действительная часть второго числа: ",
                                "Воображаемая часть второго числа: ");
                        Complex result3 = userController.multi(complex5, complex6);
                        System.out.printf("Результат: %s\n", result3);
                        log.WriteLog().info(String.format("(%s) * (%s) = %s", complex5, complex6, result3));
                        break;
                    case DIV:
                        Complex complex7 = setComplex("Действительная часть первого числа: ",
                                "Воображаемая часть первого числа: ");
                        Complex complex8 = setComplex("Действительная часть второго числа: ",
                                "Воображаемая часть второго числа: ");
                        Complex result4 = userController.multi(complex7, complex8);
                        System.out.printf("Результат: %s\n", result4);
                        log.WriteLog().info(String.format("(%s) / (%s) = %s", complex7, complex8, result4));
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Double askForDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }

    private String askForString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Complex setComplex(String messageRe, String messageIm) {
        double re = askForDouble(messageRe);
        double im = askForDouble(messageIm);
        return new Complex(re, im);
    }
}