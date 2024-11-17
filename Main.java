import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Calling feature 1: sortIntegers
        sortIntegers(new int[] {5, 8, 3, 1, 2});
    }

    public static void sortIntegers(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Integer array is empty.");
        }
        Arrays.sort(numbers);
        System.out.println("\nSorted integers: " + Arrays.toString(numbers) + "\n");
    }
}