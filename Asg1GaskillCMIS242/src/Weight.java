/**
 * This class contains the attributes and constructor for Weight objects.
 * It also includes methods to convert all values to ounces, normalize back to
 * pounds-ounces format, compare values, add values, divide added values (average)
 * and toString() functionality.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 19 March 2023
 * @version 1.0
 */

public class Weight {

    //Attributes
    private final int OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    //Constructor
    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
        normalize();
    }

    //Method to convert LBS-OZ format to Total OZ
    private double toOunces() {
        return (pounds * OUNCES_IN_A_POUND) + ounces;
    }

    //Method to return Total OZ to LBS-OZ
    private void normalize() {
        if (ounces >= OUNCES_IN_A_POUND) {
            int poundsToAdd = (int) ounces / OUNCES_IN_A_POUND;
            double newOunces = ounces - (poundsToAdd * 16);
            this.pounds += poundsToAdd;
            this.ounces = newOunces;
        }
    }

    //Method to compare values and ID lower value
    public boolean lessThan(Weight weightToCompare) {
        return this.toOunces() < weightToCompare.toOunces();
    }

    //Method to add Weights together (in OZ)
    public void addTo(Weight weightToAdd) {
        this.ounces += weightToAdd.toOunces();
        normalize();
    }

    //Method to divide a weight (the sum of the three Weights) by a divisor
    public Weight divide(int divisor) {
        double divided = this.toOunces() / divisor;
        return new Weight(0, divided);

    }

    //toString format for printing an instance of the class
    public String toString() {
        return String.format("%d pounds and %.2f ounces", pounds, ounces);
    }
}
