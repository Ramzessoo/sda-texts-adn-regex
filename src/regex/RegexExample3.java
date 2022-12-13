package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(.*\\-\\-)(\\w+)(\\-\\-.*)");
        Matcher matcher = pattern.matcher("Francis Hunior --Underwood-- został prezydentem USA");

        System.out.println(matcher.matches());  //matches musi być bo się wywali
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));

    }
}