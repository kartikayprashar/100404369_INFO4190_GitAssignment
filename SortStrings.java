// Changed second time for demo purpose
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        // Calling feature 2: sortStrings
        sortStrings(new String[] {"kiwi", "pear", "apple", "dragon fruit", "elderberry"});
    }

    public static void sortStrings(String[] strings) {
        if (strings.length == 0) {
            System.out.println("String array is empty.");
            return;
        }
        Arrays.sort(strings);
        System.out.println("\nSorted strings: " + Arrays.toString(strings) + "\n");
    }
}