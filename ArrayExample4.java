import java.util.*;

public class ArrayExample4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array:");
        // Iterate from the last element to the first to print in reverse
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
