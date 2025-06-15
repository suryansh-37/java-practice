import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String [] args){
        TreeSet<Integer> num = new TreeSet<>();
        num.add(19);
        num.add(20);
        num.add(13);
        num.add(54);
        num.add(16);
        num.add(23);
        num.add(12);
        System.out.println(num);
        System.out.println(num.higher(30));
        System.out.println(num.lower(20));
        num.remove(13);
        System.out.println(num);




    }
}
