import java.util.Scanner;

public class IsPolindrom {

    //utworzenie metody zwracającą boolean, czy słowo jest Polidronem, argumentem jest text
    private static boolean isPolindrom(String text) {
        text.toLowerCase(); //tekst ujednolicamy - na małe litery
        int length = text.length(); //do zmiennej przypisujemy długość tekstu
        for (int i = 0; i < length / 2; i++) {  //przechodzimy po znakach do połowy tekstu
            if (text.charAt(i) != text.charAt(length - 1 - i)) { //jesli znak o indeksie i nie jest równy znakowi o indeksie długość słowa minus 1 (bo jest 0, 1, 2...), minus i(które jest również od zera do połowy więc zmniejsze index z długość minus 1- do połowy długości -1)
                return false;       //to zwracamy fałsz bo to znaczy że znaki się nie powtarzają
            }
        }
        return true;  //wychodzimy z pętli i zwracamy true w każdym przeciwnym razie
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz słowo");
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase()+" jest Polindromem? - "+isPolindrom(text));

    }
}
