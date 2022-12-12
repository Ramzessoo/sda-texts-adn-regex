import java.util.Locale;
import java.util.Scanner;
//Szyfr cezara
public class Problem022 {
    private static String encrypt(String text, int key) {
        text = text.toUpperCase();
        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                int characterIndex = currentCharacter - (char) ('A');
                int characterShifted = (characterIndex + key) % 26 + (char) ('A');
                encrypted += ((char) (characterShifted));
            } else {
                encrypted += currentCharacter;
            }
        }
        return encrypted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst i przesunięcie");
        String tekst = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(encrypt(tekst, n));

    }
}
