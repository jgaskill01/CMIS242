/**
 * This class is the main method. User creates a new WalnutBoard or MapleBoard object
 * with all parameters to generate a printout of the order with price.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 28 March 2023
 * @version 1.0
 */

import java.util.Scanner;

public class LumberOrderSystem {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LumberOrderSystem orderSystem = new LumberOrderSystem();
        System.out.println("Jacob Gaskill, CMIS242/7380 29 APR 2023");

        orderSystem.WoodTypePrompt();
        orderSystem.getUserWoodTypeSelection();
        System.out.println(orderSystem.newBoard());
    }

    public void WoodTypePrompt() {
        System.out.println("What type of wood would you like to enter? (1) for Maple, (2) for Walnut: ");
    }

    public int getUserWoodTypeSelection() {
        int userIntSelection;
        while (true) {
            try {
                userIntSelection = Integer.parseInt(scan.next());
                if (userIntSelection < 1 || userIntSelection > 2) {
                    throw new IllegalUserOptionArgumentException(userIntSelection);
                } else {
                    break;
                }
            } catch (IllegalUserOptionArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return userIntSelection;
    }

    public WoodBoard newBoard() {
        if (getUserWoodTypeSelection() == 1) {
            return new MapleBoard(5, 10, 0.75, true, false, false);
        } else {
            return new WalnutBoard(5, 10, 0.75, true, false);

        }
    }
}
