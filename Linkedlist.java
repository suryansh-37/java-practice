import java.util.LinkedList;
public class Linkedlist {
    public static void main(String [] args){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("dog");
        animals.add("baboon");
        animals.add("racoon");
        animals.add("cat");
        System.out.println("List of animals are:" + animals);
        animals.add("monkey");
        System.out.println(animals);
        animals.set(2,"python");
        System.out.println(animals);
    }
    
}
