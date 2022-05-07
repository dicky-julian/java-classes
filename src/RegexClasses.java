import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static utils.Output.println;

public class RegexClasses {
    public static void main(String[] args) {
        String text = "Marsha Lenathea Lavia";
        // search string that include "e" character inside
        Pattern pattern = Pattern.compile("[a-zA-Z]*[e][a-zA-Z]*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String result = matcher.group();
            println(result);
        }
    }
}
