import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter a positive number:");
                number = s.nextInt();
        } while (number <= 0);
        System.out.println("You entered a positive number" + number);
        s.close();


        }
    }

    

