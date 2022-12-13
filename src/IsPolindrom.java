import java.util.Scanner;

public class IsPolindrom {
    private static boolean isPolindrom(String text) {
        text.toLowerCase();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz słowo");
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase()+" jest Polindromem? - "+isPolindrom(text));

    }
}
