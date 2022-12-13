package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

    private Pattern pattern;


    public void validate(String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }
}

