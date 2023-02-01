import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Check {

    private String[] CreateArray(String line) {
        String[] lines = line.split(" ");
        return lines;
    }

    public void CheckLength(String line) throws Exception {
        String[] lines = CreateArray(line);
        int lengthInfo = 6;
        if (lines.length > lengthInfo) {
            throw new Exception("Too many info. Type only what is needed.");
        }
        if (lines.length > lengthInfo) {
            throw new Exception("Not enough info. Type what is needed.");
        }
    }

    // public void CheckFIOisAlpha(String line) {
    //     String[] lines = CreateArray(line);
    //     int flag = -1;
    //     for (int i=0; i<3; i++) {
    //         Integer.parseInt(lines[i]);
    //     }
    //     System.out.println("Name, Surname or Father Name has incorrect symbols");

    //     }


    // }

    public void CheckTelefonisNumeric(String line) {
        String[] lines = CreateArray(line);
        try {
            Integer.parseInt(lines[4].trim());
        } catch (NumberFormatException e) {
            System.out.println("Phone number is incorrect");
        }

    }

    public void CheckDateFormat(String line) {
        String[] lines = CreateArray(line);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.mm.yyyy");
        try {
            LocalDate date = LocalDate.parse(lines[3]);
        } catch (DateTimeParseException e) {
            System.out.println("Wrong format of date birth.");
        }

    }

    public void CheckSexF(String line) throws Exception {
        String[] lines = CreateArray(line);
        if ((lines[5] != "f") && (lines[5] != "m")) {
            throw new Exception("Sex is wrong");
        }
    }

}
