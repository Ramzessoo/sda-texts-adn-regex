package regex;

public class Regex005 {
    public static void main(String[] args) {


        String surname = "[a-zA-Z]+([ '\\-][a-zA-Z]+)*";
        String name = "[A-Z][a-z]+";

        RegexTester tester = new RegexTester(name+" "+surname);
        tester.validate("Jan Kowalski");
        tester.validate("Justyn von der Layen");
    }
}