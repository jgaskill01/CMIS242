/**
 * @author Jacob Gaskill
 * CMIS 141/6383
 * Completed 10 October 2022
 * @version 1.0
 */
public class Snack {
    final double SMALL_PRICE = 19.99;
    final double MEDIUM_PRICE = 29.99;
    final double LARGE_PRICE = 39.99;

    String id;
    char size;
    double price;


    public Snack() {
    }

    public Snack(String id, char size) {
        this.id = id;
        this.size = size;
        this.price = calcPrice(size);
    }

    public double calcPrice(char size) {
        if (size == 'S') {
            return SMALL_PRICE;
        } else if (size == 'M'){
            return MEDIUM_PRICE;
        } else {
            return LARGE_PRICE;
        }
    }

    public String toString(){
        return String.format("Type: %s\nSize: %c\nItem ID: %s\nPrice: %.2f",this.getClass().getSimpleName(), size, id, price);
    }

}
