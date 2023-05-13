/**
 * This class contains contains the main method, as well as the display method that a jframe and jtable to
 * print and display boards with their info
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 6 Apr 2023
 * @version 1.0
 */


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


public class DisplayMain {
    // frame
    JFrame f;
    // Table
    JTable j;
    ArrayList<String[]> data;

    DisplayMain(WoodBoard woodBoard1, WoodBoard woodBoard2) {
        f = new JFrame();
        f.setTitle("Customer Invoice");
        data = new ArrayList<>();
        data.add(woodBoard1.getTableRow());
        data.add(woodBoard2.getTableRow());
        String[][] d = data.toArray(new String[0][0]);
        String[] columnNames = {"Wood Type", "Width", "Length", "Thickness", "Price"};
        j = new JTable(d, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {


        System.out.println("Jacob Gaskill, CMIS242/7380 6 APR 2023");
        System.out.println("Order Summary:");
        MapleBoard mapleBoard = new MapleBoard(5, 10, .75, true, true, true);
        System.out.println(mapleBoard);
        System.out.println();
        WalnutBoard walnutBoard = new WalnutBoard(7, 10, 1.50, false, true);
        System.out.println(walnutBoard);
        new DisplayMain(mapleBoard, walnutBoard);
    }
}
