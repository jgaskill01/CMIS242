import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;




public class DisplayMain  {
    // frame
    JFrame f;
    // Table
    JTable j;
    String a1;
    String a2;
    String a3;
    String b1;
    String b2;
    String b3;


    DisplayMain(){
        f = new JFrame();
        f.setTitle("Customer Invoice");
        String[][] data = {
                {a1, a2, a3},
                {b1, b2, b3}
        };

        String[] columnNames = {"Wood Type", "Width", "Length"};
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
}

public static void main(String[] args) {


        System.out.println("Jacob Gaskill, CMIS242/7380 28 MAR 2023");
        System.out.println("Order Summary:");
        MapleBoard mapleBoard = new MapleBoard(5, 10, .75, true, true, true);
        System.out.println(mapleBoard);
        System.out.println();
        WalnutBoard walnutBoard = new WalnutBoard(7, 10, 1.50, false, true);
        System.out.println(walnutBoard);
        new DisplayMain();
    }
}
