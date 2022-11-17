import java.util.HashMap;
import java.util.Scanner;

/**
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются
 * изоморфными и false,
 * если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
 * некоторую букву во втором слове, при этом
 * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
 * порядка следования. (Например, add - egg изоморфны)
 * буква может не меняться, а остаться такой же. (Например, note - code)
 * Пример 1:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Пример 2:
 * Input: s = "paper", t = "title"
 * Output: true
 */

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        HashMap<Character, Character> db = new HashMap<>();
        if (st1.length() == st2.length()) {
            for (int i = 0; i < st2.length(); i++) {
                if (db.containsKey(st1.charAt(i))) {
                    char k = db.get(st1.charAt(i));
                    System.out.println(k);
                    if (k != st2.charAt(i)) {
                        System.out.println("Слова не изоморфны");
                        break;
                    }
                }
                else {
                    db.put(st1.charAt(i),st2.charAt(i));
                }
            }
        }
        else {
            System.out.println("Длины строк не равны");
        }

    }
}
