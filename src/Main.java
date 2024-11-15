import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Calling Feature 1
        sortIntegers();

        // Calling Feature 2
        sortStrings();
    }

    public static void sortIntegers() {
        int[] numbers = {5, 8, 3, 1, 2};
        Arrays.sort(numbers);
        System.out.println("\nSorted integers: " + Arrays.toString(numbers));
    }

    public static void sortStrings() {
        String[] strings = {"cherry", "banana", "apple", "dragon fruit", "elderberry"};
        Arrays.sort(strings);
        System.out.println("\nSorted strings: " + Arrays.toString(strings));
    }
}