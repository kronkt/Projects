import java.util.*;

public class JediOut {
    public static void main(String[] args){

        // scanner object
        Scanner input = new Scanner(System.in);

        // prompt for number of Jedi
        System.out.println("How many Jedi will be training?");
        int numJedi = input.nextInt();
        Jedi[] jedi = new Jedi[numJedi];

        // loop to get Jedi information
        for(int i = 0; i < numJedi; i++) {
            System.out.println("Enter Jedi name: ");
            String name = input.next();
            System.out.println("Enter hours: ");
            int hours = input.nextInt();
            System.out.println("Enter minutes: ");
            double minutes = input.nextDouble();
            System.out.println("Enter iteration: ");
            int id = input.nextInt();

            jedi[i] = new Jedi(name, hours, minutes, id);
        }

        // loop to print Jedi information
        for(int)

    }
}


