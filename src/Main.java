import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";
        System.out.println("What is your age?");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            if (age >= 21)
            {
                System.out.println("You get a wristband");
            }
            else
            {
                System.out.println("You do not get a wristband");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input type: "+ trash);
            System.exit(0);
        }
    }
}