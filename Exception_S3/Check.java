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
            throw new Exception("Вы ввели лишние данные.");
        }
        if (lines.length < lengthInfo) {
            throw new Exception("Вы ввели мало данных.");
        }
    }

    public void CheckTelefonisNumeric(String line) {
        String[] lines = CreateArray(line);
        try {
            Integer.parseInt(lines[4].trim());
        } catch (NumberFormatException e) {
            System.out.println("Номер телефона неверный.");
        }

    }

    public void CheckDateFormat(String line) {
        String[] lines = CreateArray(line);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.mm.yyyy");
        try {
            LocalDate date = LocalDate.parse(lines[3], formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Вы ввели дату рождения в неверном формате.");
        }

    }

    public void CheckSex(String line) throws Exception {
        String[] lines = CreateArray(line);
        if (!lines[5].equals("f") && !lines[5].equals("m")) {
            throw new Exception("Вы ввели неверный пол.");
        }
    }

}
