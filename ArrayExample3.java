import java.util.*;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};
        int max = arr[0]; // Initialize max with the first element

        // Iterate through the array to find the largest element
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest Element: " + max);
    }
}
