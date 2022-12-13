package regex;

public class Regex003 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("(\\+48)*5[0-9]{8}");

        tester.validate("+48515332123");
        tester.validate("515336293");
        //false
        tester.validate("51123");
        tester.validate("615332123");
        tester.validate("715332123");
        tester.validate("+48715332123");
        tester.validate("712123");
        tester.validate("+48+48+48412342421");
    }
}
