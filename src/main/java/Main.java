import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

public class Main {

    public static void main(String[] args ){

        // call the compute() method
        compute();
    }

    public static boolean compute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        // Create conditional to check name against Alice and Bob
        if (name.equals("alice") || name.equals("bob")) {
        // Print greeting to screen if Alice or Bob are true
            System.out.println("Hello " + name + "!");
        // Print "You are neither Alice nor Bob." otherwise
        } else {
        System.out.println("You are neither Alice nor Bob.");
        }
        return false;
    }
}
