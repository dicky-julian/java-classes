import java.util.Scanner;
import static utils.Output.*;

public class ScannerClasses {
    public static void main(String[] args) {
        inputScanner();
    }

    static void inputScanner() {
        Scanner input = new Scanner(System.in);

        print("Name : ");
        String name = input.nextLine();

        print("Age : ");
        int age = input.nextInt();

        println(name + " general " + age + " years.");
    }
}
