package regex;

public class Regex001 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("p.*q");

        tester.validate("pasdfsdfq");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("p12421341234q");
        tester.validate("qqqqq");
        tester.validate("pasdfsadf");
    }

}