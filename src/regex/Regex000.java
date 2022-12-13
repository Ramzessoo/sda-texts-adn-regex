package regex;


public class Regex000 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("pq*");
        tester.validate("pqqqqqq");
        tester.validate("p");
        tester.validate("pqqqqqqrrrrr");
        tester.validate("qqqqqq");
        tester.validate("ytre");


    }

}
