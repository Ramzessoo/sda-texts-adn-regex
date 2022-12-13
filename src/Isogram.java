import java.util.Scanner;

public class Isogram {
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz słowo");
        String str = scanner.nextLine();
        if (isIsogram(str)) {
            System.out.println("Podane słowo jest izogramem");
        } else {
            System.out.println("podane słowo nie jest izogramem");
        }
    }
}
