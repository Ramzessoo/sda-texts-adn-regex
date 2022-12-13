package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("Tekst w którym szukam test");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        System.out.println(matcher.find());


    }
}
