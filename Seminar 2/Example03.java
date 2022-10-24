// Напишите метод, который составит строку, состоящую из 10 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example03 {

    public static String stAppend(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(myString + " ");
        }
        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    public static void writeFile(String inputString) {
        try {
            FileWriter fw = new FileWriter("file.txt", false);
            fw.append(inputString);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {

        String test = "TEST";
        File f = new File("file.txt");
        String writestring = stAppend(test);
        writeFile(writestring);

    }
}
