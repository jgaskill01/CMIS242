/**
 * This class contains attributes and methods specific to the Maple family of boards.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 28 March 2023
 * @version 1.0
 */

public class MapleBoard extends WoodBoard {
    private final double MAPLE_PRICE = 6.50;
    private final double FIGURED_UP_CHARGE = 2.00;
    private final double BIRDSEYE_UP_CHARGE = 2.50;

    private boolean isFigured;
    private boolean isBirdseye;
    private final double price;

    public MapleBoard(int width, int length, double thickness, boolean isDiscount, boolean isFigured, boolean isBirdseye) {
        super(width, length, thickness, isDiscount);
        this.isFigured = isFigured;
        this.isBirdseye = isBirdseye;
        this.price = calcPrice();
    }

    //Accessor
    public boolean isFigured() {
        return isFigured;
    }

    public boolean isBirdseye() {
        return isBirdseye;
    }

    public double calcPrice() {
        double newPrice = MAPLE_PRICE;
        if (isFigured) {
            newPrice += FIGURED_UP_CHARGE;
        }
        if (isBirdseye) {
            newPrice += BIRDSEYE_UP_CHARGE;
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
                        "\nBirdseye? %s" + "\nFigured? %s" +
                        "\nDiscount? %s" +
                        "\nTotal Price: %.2f",
                getClass().getSimpleName(),
                getWidth(), getLength(), getThickness(),
                isBirdseye() ? "Y" : "N",
                isFigured() ? "Y" : "N",
                isDiscount() ? "Y" : "N",
                price);

    }
}

