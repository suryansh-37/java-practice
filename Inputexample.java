import java.util.Scanner;
public class Inputexample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String name = s.nextLine();
        System.out.println("enter your age");
        int age = s.nextInt();
        System.out.println("your name is " + name + ", and your age is "+age );
    }

    
}
