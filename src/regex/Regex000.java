package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex000 {
   public static final Pattern pattern = Pattern.compile("pq*");
    public static void main(String[] args) {
      validate("pqqqqqq");
      validate("p");
        validate("pqqqqqqrrrrr");
        validate("qqqqqq");
        validate("ytre");


    }
    private static void validate(String text){
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("prawda dla tekstu: "+text);
        } else
        System.out.println("fałsz dla tekstu: "+text);
    }
}
