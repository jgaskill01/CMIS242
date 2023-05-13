/**
 * This class is an abstract parent class. It contains some universal "board" attributes and methods.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 6 Apr 2023
 * @version 1.0
 */

public abstract class WoodBoard {
    private final double DISCOUNT = .90;
    private int width;
    private int length;
    private double thickness;
    private boolean isDiscount;


    public WoodBoard(int width, int length, double thickness, boolean isDiscount) {
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.isDiscount = isDiscount;
    }

    public abstract double calcPrice();

    public String[] getTableRow(){
        String entry = getClass().getSimpleName();
        String entry1 = Integer.toString(getWidth());
        String entry2 = Integer.toString(getLength());
        String entry3 = Double.toString(getThickness());
        String entry4 = String.format("$%.2f", calcPrice());
        return new String[]{entry, entry1, entry2, entry3, entry4};
    }

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

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public double getDiscount(){
        return DISCOUNT;
    }

    public double getBoardFeet() {
        return (width) * (length / 12.0) * (thickness);
    }

    @Override
    public String toString() {
        return "WoodBoard{" +
                "width=" + width +
                ", length=" + length +
                ", thickness=" + thickness +
                ", isDiscount=" + isDiscount +
                '}';
    }
}
