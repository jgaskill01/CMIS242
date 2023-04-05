/**
 * @author Jacob Gaskill
 * CMIS 141/6383
 * Completed 10 October 2022
 * @version 1.0
 */

import java.util.Scanner;

public class OrderSystem {
    Scanner scan = new Scanner(System.in);
    final String TRAIL_MIX_ID = "1a2b";
    final String POTATO_CHIPS_ID = "3c4d";
    final String FRUIT_SALAD_ID = "5e6f";
    final String SLICED_CITRUS_MEDLEY = "7g8h";
    final String CHOCOLATE_ECLAIR = "9i0j";


    public void mainMenuDisplay() {
        System.out.println("Welcome to the Snack Shack!" +
                "\nPlease order an item from the menu below:" +
                "\n1. Trail Mix" +
                "\n2. Potato Chips" +
                "\n3. Fruit Salad" +
                "\n4. Sliced Citrus Medley" +
                "\n5. Chocolate Eclair" +
                "\n6. Exit");
    }

    public void sizeMenuDisplay() {
        System.out.println("\nPlease Select a Size (S, M, L):");
    }

    public int getUserSelection() {
        mainMenuDisplay();
        int userSelection = 0;
        while (true) {
            try {
                userSelection = Integer.parseInt(scan.nextLine());
                if (userSelection < 1 || userSelection > 6) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Entry, please select a number between 1 and 6");
            }
        }
        return userSelection;
    }


    public char sizeSelection() {
        sizeMenuDisplay();
        char sizeSelection;
        while (true) {
            sizeSelection = scan.nextLine().toUpperCase().charAt(0);
            if (sizeSelection != 'S' && sizeSelection != 'M' && sizeSelection != 'L') {
                System.out.println("Invalid Entry, please enter the size (S, M, or L");
                continue;
            }
            break;
        }
        return sizeSelection;
    }



    public Snack menuSelection(int userSelection) {
        char size = sizeSelection();
        Snack selection;
        switch (userSelection) {
            case 1:
                selection = new SaltySnack(TRAIL_MIX_ID, size, true);
                break;
            case 2:
                selection = new SaltySnack(POTATO_CHIPS_ID, size);
                break;
            case 3:
                selection = new FruitSnack(FRUIT_SALAD_ID, size);
                break;
            case 4:
                selection = new FruitSnack(SLICED_CITRUS_MEDLEY, size, true);
                break;
            case 5:
                selection = new Snack(CHOCOLATE_ECLAIR, size);
                break;
            default:
                selection = new Snack("No Item Found", 'n');
        }
        return selection;
    }


    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        int userSelection = orderSystem.getUserSelection();
        while (userSelection != 6) {
            Snack newSnack = orderSystem.menuSelection(userSelection);
            System.out.println(newSnack);
            userSelection = orderSystem.getUserSelection();
        }
        System.out.println("Have a nice day!");
    }
}