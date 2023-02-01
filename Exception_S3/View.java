import java.util.Scanner;

public class View {

    public void run() throws Exception {
        ViewCommands com = ViewCommands.NONE;
        Check check = new Check();

        while (true) {
            String command = prompt("Type the command (C - create, E - exit): ");
            try {
                com = ViewCommands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Command doesn't exist");
            }
            if (com == ViewCommands.E)
                return;
            if (com == ViewCommands.C) {
                String userInfo = prompt("Type information separated by spaces:\nFamily name\nName\nFarther name\nBirthday(dd.mm.yyyy)\nPhone\nSex(f/m)");
                check.CheckLength(userInfo);
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
