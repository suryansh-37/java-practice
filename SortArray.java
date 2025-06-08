import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int [] arr = {5,6,2,3,7,3};
        Arrays.sort(arr);
        System.out.println("sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }

    
}
