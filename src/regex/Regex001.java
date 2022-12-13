package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex,
który dopasowuje ciąg znaków, w który zaczyna się od 'p',
 po którym następuje cokolwiek, kończąc na 'q'.

 pdfgdfgdsfg
 pq
 pqqqqqqqqq
 p123423412342134q
 */
public class Regex001 {
    private static final Pattern pattern = Pattern.compile("p.*q");

    public static void main(String[] args) {
        validate("pasdfsdfq");
        validate("pq");
        validate("pqqqq");
        validate("p12421341234q");
        validate("qqqqq");
        validate("pasdfsadf");
    }

    private static void validate(String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }
}