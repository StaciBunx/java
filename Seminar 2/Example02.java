// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Ответ: результат - a4b3cd2 для примера

public class Example02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String origin = "aaaabbbcdddddddd ";
        StringBuilder rle = new StringBuilder();
        int count = 1;
        for (int i = 0; i < origin.length() - 1; i++) {
            if (origin.charAt(i) == origin.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    rle.append(origin.charAt(i));
                    count = 1;
                } else {
                    rle.append(origin.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        System.out.println(rle.toString());

    }
}
