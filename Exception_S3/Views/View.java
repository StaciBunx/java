package Views;

import Controllers.*;
import Model.Record;

import java.util.Scanner;
import java.util.List;

public class View {
    private RecordController recordController;

    public View(Controllers.RecordController recordController) {
        this.recordController = recordController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Type the command: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Command doesn't exist");
            }
            if (com == Commands.EXIT)
                return;
            if (com == Commands.CREATE) {
                String input = getInfo();

            }
        }
    }



    private String getInfo() {
        System.out.println(
                "Type information separated by spaces:\n FamilyName Name FartherName Birthday(dd.mm.yyyy) Phone Sex(f/m)");
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

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private String[] validateInfoLength (String input) {
        int infoLength = 4;
        String[] result = input.split(" ")
    }

}
