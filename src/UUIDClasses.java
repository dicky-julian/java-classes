import java.util.UUID;

import static utils.Output.println;

public class UUIDClasses {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            println(UUID.randomUUID());
        }
    }
}
