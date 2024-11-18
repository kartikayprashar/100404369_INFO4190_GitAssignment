# 100404369 INFO 4190 Git Assignment

<p>This project shows the sorting of both integers and strings. For example, this application enables users to modify both the numbers and strings array so the function may return the ascending or alphabetically sorted array. How a user may use this project is also shown.</p>

***

## Files

###### SortIntegers.java: Sorts the integers in an ascending order.
###### SortStrings.java: Sorts the strings in alphabetical order.

***

## Features

### 1. Sort Integers

- <b>Branch:</b> `feature-sort-integers`
- <p><b>Description:</b> This feature implements a function to sort an array of integers in ascending order.</p>
- <p><b>Usage:</b> Run the <b>SortIntegers.java file</b>, which sorts an example array of integers and prints the sorted result to the console.</p>
- <p><b>Modification:</b> Modify the method call named <b>sortIntegers</b> by changing the value of numbers within the curley braces in the main method as shown below by substituting numbers with the variables int1, int2, int3, int4 and int5.</p>

```java
import java.util.Arrays;

public class SortIntegers {

    public static void main(String[] args) {
        // Calling feature 1: sortIntegers
        sortIntegers(new int[] {int 1, int2, int3, int4, int5}); // <- Substitute integers here
    }

    public static void sortIntegers(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Integer array is empty.");
        }
        Arrays.sort(numbers);
        System.out.println("\nSorted integers: " + Arrays.toString(numbers) + "\n");
    }
}
```

### 2. Sort Strings

- <b>Branch:</b> `feature-sort-strings`
- <p><b>Description:</b> This feature implements a function to sort an array of strings in alphabetical order.</p>
- <p><b>Usage:</b> Run the <b>SortStrings.java</b> file, which sorts an example array of strings and prints the stored result to the console.</p>
- <p><b>Modification:</b> Modify the method call named <b>SortStrings</b> by changing the value of strings within the curley braces in the main method as shown below by substituting strings with the variables str1, str2, str3, str4 and str5.</p>

```java
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        // Calling feature 2: sortStrings
        sortStrings(new String[] {"str1", "str2", "str3", "str4", "str5"}); // <- Substitute strings here
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
```
