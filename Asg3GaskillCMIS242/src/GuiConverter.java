/**
 * This program uses a GUI to allow users to convert temperature from F to C
 * and Distance from Miles to KM
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 22 April 2023
 * @version 1.0
 */

import javax.swing.*;

public class GuiConverter extends JFrame {
    public GuiConverter() {
        super("Converter");

        // Create panel and button objects
        JPanel panel1 = new JPanel();
        JButton distButton = new JButton("Distance Converter");
        JButton tempButton = new JButton("Temperature Converter");
        JButton exit = new JButton("Exit");

        //method to implement distance converter via GUI using action listener
        distButton.addActionListener(e -> {
            String inputString = JOptionPane.showInputDialog("Enter Distance in Miles to Convert:");
            double input = Double.parseDouble(inputString);
            DistanceConverter distConverter = new DistanceConverter(input);
            double result = distConverter.convert();
            JOptionPane.showMessageDialog(panel1, input + " miles equals " + result + " kilometers");
        });

        //method to implement temp converter via GUI using action listener
        tempButton.addActionListener(e -> {
            String inputString = JOptionPane.showInputDialog("Input Fahrenheit Temperature to Convert:");
            double input = Double.parseDouble(inputString);
            TemperatureConverter tempConverter = new TemperatureConverter(input);
            double result = tempConverter.convert();
            JOptionPane.showMessageDialog(panel1, input + " F equals " + result + " C");
        });

        //implement exit functionality
        exit.addActionListener(e -> System.exit(0));

        //add buttons to panel
        panel1.add(distButton);
        panel1.add(tempButton);
        panel1.add(exit);

        //generate panel
        add(panel1);

        //draw to screen with parameters and set to visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 80);
        setVisible(true);
    }

    public void setSize(int width, int height ){
    }

   public void setVisible(){
        boolean b;
   }

    //main!
    public static void main(String[] args) {
        GuiConverter converter = new GuiConverter();
    }
}