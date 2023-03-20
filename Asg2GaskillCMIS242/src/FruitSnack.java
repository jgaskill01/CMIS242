/**
 * @author Jacob Gaskill
 * CMIS 141/6383
 * Completed 10 October 2022
 * @version 1.0
 */
public class FruitSnack extends Snack {
    boolean isCitrus;
    final double CITRUS_FEE = 5.99;

    public FruitSnack() {
    }

    public FruitSnack(String id, char size) {
        this(id, size, false);
    }

    public FruitSnack(String id, char size, boolean isCitrus){
        super(id, size);
        this.isCitrus = isCitrus;
        this.price = calcPrice(size);


    }

    public String getId() {
        return id;
    }

    public char getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setId() {
        this.id = id;
    }

    public void setSize() {
        this.size = size;
    }

    public void setPrice() {
        this.price = price;
    }

    public boolean isCitrus() {
        return isCitrus;
    }

    @Override
    public double calcPrice(char size) {
        double snackPrice = super.calcPrice(size);

        if (isCitrus()) {
            snackPrice += CITRUS_FEE;
        }
        return snackPrice;
    }
}
