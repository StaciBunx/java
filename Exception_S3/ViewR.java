import java.util.Scanner;

public class ViewR {

    public void run() throws Exception {
        ViewCommands com = ViewCommands.NONE;
        Check check = new Check();

        while (true) {
            String command = prompt("Type the command (C - create, E - exit): ");
            try {
                com = ViewCommands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Такой команды не существует");
            }
            if (com == ViewCommands.E)
                return;
            if (com == ViewCommands.C) {
                String userInfo = prompt("Введите следующие данные через пробел:\nФамилия\nИмя\nОтчество\nДата рождения(dd.mm.yyyy)\nТелефон\nПол(f/m)\n");
                check.CheckLength(userInfo);
                check.CheckDateFormat(userInfo);

            }
        }
    }

    private String prompt(String message) {
        System.out.print(message);
        String input = "";
        Scanner in = new Scanner(System.in);
        try {
            input = in.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            in.close();
        }
        return input;
    }

}
