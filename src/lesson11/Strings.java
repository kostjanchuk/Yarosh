package lesson11;

public class Strings {
    public static void main(String[] args) {
        String s = "Одесса мой город родной";
        for (int i = 0; i < s.length(); i++) {

            if ('о' == s.charAt(i) || 'О' == s.charAt(i)) {
                System.out.println("Индекс в строке буквы  " + s.charAt(i) + " = " + (i));
            }

        }
    }
}
