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

    public void WoodTypePrompt(){
        System.out.println("What type of wood would you like to enter? (1) for Maple, (2) for Walnut: ");
    }
    public void WidthPrompt(){
        System.out.println("What width is the board?");
    }
    public void LengthPrompt(){
        System.out.println("What length is the board?");
    }
    public void ThicknessPrompt(){
        System.out.println("What thickness is the board?");
    }
    public void FiguredPrompt(){
        System.out.println("Is the board figured?");
    }
    public void BirdseyePrompt(){
        System.out.println("Is the board birdseye?");
    }

    public void PeruvianPrompt(){
        System.out.println("Is the board Peruvian?");
    }

    public int getUserWoodTypeSelection() {
        int userIntSelection = 0;
        while (true) {
            try {
                userIntSelection = Integer.parseInt(scan.nextLine());
                if (userIntSelection < 1 || userIntSelection > 2) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Entry, please select either 1 or 2");
            }
        }
        return userIntSelection;
    }

    public int getUserWidthSelection() {
        int userIntSelection = 0;
        while (true) {
            try {
                userIntSelection = Integer.parseInt(scan.nextLine());
                if (userIntSelection < 3 || userIntSelection > 60) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Entry, please select a wood width greater than 3 and less than 60," +
                        " Our shop does not stock wood smaller or larger than those measurements");
            }
        }
        return userIntSelection;
    }

    public WoodBoard newBoard() {
        if (getUserWoodTypeSelection() == 1) {
            WoodBoard newBoard = new MapleBoard(5, 10, 0.75, true, false, false);
        } else {
            WoodBoard newBoard = new WalnutBoard(5, 10, 0.75, true, false);
        }
        return newBoard();
    }


    public static void main(String[] args) {
        LumberOrderSystem orderSystem = new LumberOrderSystem();
        System.out.println("Jacob Gaskill, CMIS242/7380 28 MAR 2023");
        orderSystem.WoodTypePrompt();
        orderSystem.getUserWoodTypeSelection();
        System.out.println("Order Summary:");
        WoodBoard mapleBoard = new MapleBoard(5, 10, .75, true, true, true);
        System.out.println(mapleBoard);
        System.out.println();
        WoodBoard walnutBoard = new WalnutBoard(7, 10, 1.50, false, true);
        System.out.println(walnutBoard);
        WoodBoard saleWalnut = new WalnutBoard(101, 10, 1.50, false, true, true);
        System.out.println(saleWalnut);
    }
}