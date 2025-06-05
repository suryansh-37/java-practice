import java.util.*;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close(); // It's good practice to close the scanner
    }
}
