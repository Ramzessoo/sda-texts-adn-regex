import java.util.Scanner;

//Szyfr cezara
public class Problem022 {

    //metoda zawracająca zaszyfrowaną wiadomość
    private static String encrypt(String text, int key) {
        //tekst usera przypisany do zmienneh
        text = text.toUpperCase();
        //deklaracja zmiennej do przechowywania zaszyforwanego tekstu
        String encrypted = "";

        //pętla przechodząca po tekście
        for (int i = 0; i < text.length(); i++) {
            //zmienna pomocnicza przechowywująca po kolei każdy znak o indeksie i
            char currentCharacter = text.charAt(i);

            //wywołanie metody .usUpperCase - sprawdzając czy znak jest dużą literą sprawdzamy czy nie jest spacją bądź cyfrą - mądre
            if (Character.isUpperCase(currentCharacter)) {
                int characterIndex = currentCharacter - (char) ('A'); //
                int characterShifted = (characterIndex + key) % 26 + (char) ('A');
                encrypted += ((char) (characterShifted));
            } else {
                encrypted += currentCharacter;
            }
        }
        return encrypted;
    }

    public static void main(String[] args) {

        //pobranie tekstu od usera
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst i przesunięcie");
        //pobranie wartości przeusnięcia kodu
        String tekst = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(encrypt(tekst, n));

    }
}
