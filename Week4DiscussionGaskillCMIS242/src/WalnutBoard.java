/**
 * This class contains attributes and methods specific to the Walnut family of boards.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 28 March 2023
 * @version 1.0
 */

public class WalnutBoard extends WoodBoard {

    //Class attributes; Price, and is American or Peruvian Walnut Bool
    final double WALNUT_PRICE = 7.50;
    final double PERUVIAN_UP_CHARGE = 2.00;
    boolean isPeruvian;
    double price;

    //Constructor
    public WalnutBoard(int width, int length, double thickness, boolean isDiscount, boolean isPeruvian) {
        super(width, length, thickness, isDiscount);
        this.isPeruvian = isPeruvian;
        this.price = calcPrice();
    }

    //Accessor
    public boolean isPeruvian() {
        return isPeruvian;
    }

    public double calcPrice() {
        double newPrice = WALNUT_PRICE;
        if (isPeruvian) {
            newPrice += PERUVIAN_UP_CHARGE;
        }
        if (isDiscount()) {
            newPrice *= getDiscount();
        }
        double bf = getBoardFeet();
        return bf * newPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "\nWood Type: %s" +
                        "\nWidth: %d\tLength: %d\tThickness: %.2f" +
                        "\nPeruvian? %s" +
                        "\nDiscount? %s" +
                        "\nTotal Price: %.2f",
                getClass().getSimpleName(),
                getWidth(), getLength(), getThickness(),
                isPeruvian() ? "Y" : "N",
                isDiscount() ? "Y" : "N",
                price);
    }
}

