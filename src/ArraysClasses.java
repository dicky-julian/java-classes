import java.util.Arrays;

import static utils.Output.println;

public class ArraysClasses {
    public static void main(String[] args) {
        String[] texts = {"Marsha", "Lenathea", "Lavia"};
        copyArray(texts);
    }

    static void binarySearchArray(String[] texts) {
        int selectedIndex = Arrays.binarySearch(texts, "Lenathea");
        println(selectedIndex);
    }

    static void copyArray(String[] texts) {
        String[] dataCopy = Arrays.copyOf(texts, texts.length);
        String[] partlyDataCopy = Arrays.copyOf(texts, 1);

        println("all data: " + Arrays.toString(dataCopy));
        println("partly data: " + Arrays.toString(partlyDataCopy));
    }

    static void sortArray(String[] texts) {
        Arrays.sort(texts);
        String sortedArray = Arrays.toString(texts);

        println(sortedArray);
    }
}
