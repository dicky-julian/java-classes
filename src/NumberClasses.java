import java.math.BigInteger;

import static utils.Output.println;

public class NumberClasses {
    public static void main(String[] args) {
        int number = 100;
        BigInteger bigNumber = new BigInteger("10000000000");
    }

    static void convertNumber(Number number) {
        // number -> string
        String stringVal = number.toString();

        // string -> primitive integer
        int stringintVal = Integer.parseInt(stringVal);

        // string -> non-primitive integer
        Integer stringIntVal = Integer.valueOf(stringVal);

        // non-primitive convert
        Integer intVal = number.intValue();
        Long longVal = number.longValue();
        Double doubleVal = number.doubleValue();

        println("int: " + intVal);
        println("long: " + longVal);
        println("double: " + doubleVal);
    }

    static void bigNumberOperator(BigInteger bigNumber) {
        BigInteger number = bigNumber.add(bigNumber);
        println(bigNumber + " + " + bigNumber + " = " + number);

        number = bigNumber.subtract(bigNumber);
        println(bigNumber + " - " + bigNumber + " = " + number);

        number = bigNumber.multiply(bigNumber);
        println(bigNumber + " * " + bigNumber + " = " + number);

        number = bigNumber.divide(bigNumber);
        println(bigNumber + " / " + bigNumber + " = " + number);

        number = bigNumber.mod(bigNumber);
        println(bigNumber + " % " + bigNumber + " = " + number);
    }
}
