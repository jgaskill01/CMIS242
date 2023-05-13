/**
 * This class is an abstract parent class. It contains some universal "board" attributes and methods.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 28 March 2023
 * @version 1.0
 */

public abstract class WoodBoard {
    private final double DISCOUNT = .90;
    private final int width;
    private final int length;
    private double thickness;
    private boolean isDiscount;


    public WoodBoard(int width, int length, double thickness, boolean isDiscount) {
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.isDiscount = isDiscount;
    }

    public abstract double calcPrice();


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public double getDiscount() {
        return DISCOUNT;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public double getBoardFeet() {
        return (width) * (length / 12.0) * (thickness);
    }

    @Override
    public String toString() {
        return "WoodBoard{" + "width=" + width + ", length=" + length + ", thickness=" + thickness + ", isDiscount=" + isDiscount + '}';
    }
}
