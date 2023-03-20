/** Discussion 1 - Modeling an Object as a Java Class
 *
 * @author Amber Kraft -- Amended by Jacob Gaskill
 *  Date: 03/17/2023
 *  Description: Discussion 1
 */

import java.util.Scanner;

public class Bakery {

    private static void getOrder() {
        Scanner scan = new Scanner(System.in);

        String message = null;

        System.out.print("\nWhat flavor cake do you want (Chocolate, Vanilla, Strawberry)?: ");
        String flavor = scan.nextLine();

        //added icing choice for new attribute
        System.out.println("\nWhat type of icing do you want? (Buttercream, chocolate, vanilla, none");
        String icingType = scan.nextLine();

        System.out.print("Enter number of layers: ");
        int layers = scan.nextInt();

        System.out.print("Enter cake diameter in inches: ");
        int diameter = scan.nextInt();

        System.out.print("Do you want a personalized message? (Y/N): ");
        String wantMessage = scan.next();

        if (wantMessage.equalsIgnoreCase("y")) {
            System.out.print ("Enter personalized message: ");
            scan.nextLine();
            message = scan.nextLine();
        }

        else if (wantMessage.equalsIgnoreCase("n")) {
            message = ("None");
        }

        else {
            System.out.print("Invalid choice");
        }

        Cake cake = new Cake(flavor, icingType, layers, diameter, message);
        System.out.println(cake.displayCake());

        scan.close();
    }

    public static void main(String[] args) {

        //Display class information
        System.out.print("Name: Kraft, Amber & Gaskill, Jacob    CMIS 242/7380     Date: 03/17/2023\n");

        //call method
        getOrder();
    }
}
