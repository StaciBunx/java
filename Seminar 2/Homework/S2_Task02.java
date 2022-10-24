// Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.FileReader;
import java.io.IOException;

public class S2_Task02 {

    public static String readFile(String pathFile) {
        try (FileReader reader = new FileReader(pathFile)) {
            int item;
            StringBuilder sb1 = new StringBuilder();
            while ((item = reader.read()) != -1) {
                sb1.append((char) item);
            }
            String scores = sb1.toString();
            return scores;

        } catch (IOException e) {
            return null;
        }
    }

    public static void printScoreList(String scores) {
        StringBuilder sb = new StringBuilder();
        for (char ch : scores.toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        scores = sb.toString();
        scores = scores.replace("оценка", " получил ");
        scores = scores.replace("предмет", " по предмету ");
        scores = scores.replace("фамилия", "\nСтудент ");
        System.out.println(scores);
    }

    public static void main(String[] args) {
        String pathFile = "data2.json";
        String scores = readFile(pathFile);
        printScoreList(scores);
    }
}
