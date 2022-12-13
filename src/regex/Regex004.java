package regex;

public class Regex004 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]+([ \\-][A-Z][a-z]*)?");
        tester.validate("Otwock");
        tester.validate("Nowy Sacz");
        tester.validate("Wars43");
        tester.validate("Bielsko-Biala");

    }
}
