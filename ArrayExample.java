import java.util.ArrayList;

public class ArrayExample {
    public static void main(String [] args){
        ArrayList<String> fruits= new ArrayList<>();
        // adding elements in array
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pinapple");
        fruits.add("blueberry");
        fruits.add("cherry");
        fruits.add("mango");
        System.out.println("your list of fruits are "+ fruits);
        // chenging elements in array
        fruits.set(3,"orange");
        System.out.println("array after updating element :" + fruits);
        System.out.println("array size :" + fruits.size());
            for (String fr : fruits){
                 System.out.println(fr);
        System.out.println("is apple present:" + fruits.contains("apple"));
        fruits.clear();
        System.out.println("is fruits is empty: " + fruits.isEmpty());
        
        }
    }
    
}
