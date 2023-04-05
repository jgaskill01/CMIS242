/**
 * This class is the main method. User creates a new WalnutBoard or MapleBoard object
 * with all parameters to generate a printout of the order with price.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 28 March 2023
 * @version 1.0
 */

public class LumberOrderSystem {
    public static void main(String[] args) {
        System.out.println("Jacob Gaskill, CMIS242/7380 28 MAR 2023");
        System.out.println("Order Summary:");
        MapleBoard mapleBoard = new MapleBoard(5, 10, .75, true, true, true);
        System.out.println(mapleBoard);
        System.out.println();
        WalnutBoard walnutBoard = new WalnutBoard(7, 10, 1.50, false, true);
        System.out.println(walnutBoard);
    }
}