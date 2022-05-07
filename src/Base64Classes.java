import java.util.Base64;
import static utils.Output.println;

public class Base64Classes {
    public static void main(String[] args) {
        String text = "Marsha Lenathea Lavia";

        String encode = Base64.getEncoder().encodeToString(text.getBytes());
        println("encode: " + encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        println("decode: " + decode);
    }
}
