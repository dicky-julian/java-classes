import java.util.Random;
import static utils.Output.println;

public class RandomClasses {
    public static void main(String[] args) {
        // generate random number
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1000);
            println(number);
        }
    }
}
