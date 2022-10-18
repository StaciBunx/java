public class Example04 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] words = str.split(" ");

        for (int i =0; i<words.length;i++){
            System.out.println(words[i] + " ");
        }
    }
}
