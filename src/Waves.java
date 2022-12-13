import java.util.Scanner;

public class Waves {

    //ustawienie linijek jako stałych String
    private static final String FIRST_ROW_ELEMENT = "*      *";
    private static final String SECOND_ROW_ELEMENT = " *    * ";
    private static final String THIRD_ROW_ELEMENT = "  *  *  ";
    private static final String FOURTH_ROW_ELEMENT = "   **   ";


    public static void main(String[] args) {

        //pobranie ilości powtórzeń od Usera
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();

        //wywołanie metody ilość powtórzeń, konkretne piętro
        printRow(waveLength, FIRST_ROW_ELEMENT);
        printRow(waveLength, SECOND_ROW_ELEMENT);
        printRow(waveLength, THIRD_ROW_ELEMENT);
        printRow(waveLength, FOURTH_ROW_ELEMENT);

    }

    //metoda rysująca każde piętro fali tyle razy ile jej powiemy
    private static void printRow(int waveLength, String rowElement) {
        for (int i = 0; i < waveLength; i++) {
            System.out.print(rowElement);
        }
        System.out.println();
    }


}

