import java.util.StringJoiner;
import java.util.StringTokenizer;

import static utils.Output.println;

public class StringClasses {
    public static void main(String[] args) {
        String text = "Marsha Lenathea Lavia";
        String[] texts = text.split(" ");

        textTokenizer(text);
    }

    static void textTransform(String text) {
        String lower = text.toLowerCase();
        String upper = text.toUpperCase();

        println("Text lowercase: " + lower);
        println("Text uppercase: " + upper);
    }

    static void textEdge(String text) {
        boolean isStartsWith = text.startsWith("M");
        boolean isEndsWith = text.endsWith("a");

        println("Is text starts with 'M'? " + isStartsWith);
        println("Is text ends with 'm'? " + isEndsWith);
    }

    static void textSplit(String text) {
        String[] splitText = text.split(" ");

        for (String split: splitText) {
            println(split);
        }
    }

    static void textJoin(String[] texts) {
        StringJoiner joinText = new StringJoiner(", ", "[", "]");
        for (String text: texts) {
            joinText.add(text);
        }
        println(joinText);
    }

    static void textBuilder(String[] texts) {
        StringBuilder builder = new StringBuilder();
        for (String text: texts) {
            builder.append(text).append(" ");
        }

        String text = builder.toString();
        println(text);
    }

    static void textTokenizer(String text) {
        // tokenizer is like split, but it's lazy
        // cause token will split one by one, so its memory cheap
        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            println(token);
        }
    }
}
