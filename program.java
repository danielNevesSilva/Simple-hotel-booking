
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.println("How many busy rooms you be rented? ");
        int num = input.nextInt();
        Rent[] vect = new Rent[10];

        for (int i = 1; i <= num; i++) {
            input.nextLine();
            System.out.println("rent # " + i + ":");
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("E-mail: ");
            String email = input.nextLine();
            System.out.println("Room: ");
            int room = input.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

    }

}

