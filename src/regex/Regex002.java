package regex;

public class Regex002 {
    public static void main(String[] args) {


        RegexTester tester1 = new RegexTester("[A-Z][a-z]+");

        tester1.validate("Paoaoaoa");
        tester1.validate("P");

        tester1.validate("Pahgfd");
        tester1.validate("PaoaoaDoa");



    }
}