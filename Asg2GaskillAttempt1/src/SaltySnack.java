/**
 * @author Jacob Gaskill
 * CMIS 141/6383
 * Completed 10 October 2022
 * @version 1.0
 */

public class SaltySnack extends Snack {
    boolean isNut;
    final double NUT_FEE = 4.50;

    //Constructors
    public SaltySnack() {
    }

    public SaltySnack(String id, char size) {
        this(id, size, false);
    }

    public SaltySnack(String id, char size, boolean isNut){
        super(id, size);
        this.isNut = isNut;
        this.price = calcPrice(size);
    }

    //Getters
    public String getId() {
        return id;
    }

    public char getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setId() {
        this.id = id;
    }

    public void setSize() {
        this.size = size;
    }

    public void setPrice() {
        this.price = price;
    }

    public String saltySnackWithNuts(){
        return "";
    }

    public boolean isNut() {
        return isNut;
    }

    @Override
    public double calcPrice(char price) {
        double snackPrice = super.calcPrice(size);
        if (isNut()) {
            snackPrice += NUT_FEE;
        }
        return snackPrice;
    }
}
