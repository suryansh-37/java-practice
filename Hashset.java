import java.util.HashSet;
public class Hashset {
    public static void main(String [] args){
        HashSet<String> set = new HashSet<>();
        set.add("banana");
        set.add("apple");
        set.add("pineapple");
        set.add("cherry");
        set.add("guvava");
        set.add("jackfruit");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("cherry"));
        set.clear();
        System.out.println(set);
       }
    
}
