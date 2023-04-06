public class FruitSnack extends Snack {
    boolean isCitrusIncluded;
    double citrusCharge = 5.99;



    public FruitSnack() {
    }

    public FruitSnack(char size, boolean isCitrusIncluded) {
        super(size);
        this.isCitrusIncluded = isCitrusIncluded;
    }
    public void setId(char size){
        String newId = "F";
        newId += (int)size;
        newId += isCitrusIncluded ? "X" : "N";
        this.id = newId;
    }
    public String getId(){
        return id;
    }

    public double calcPrice(){
        double price = getBasePrice(this.size);
        if (isCitrusIncluded) {
            price += citrusCharge;
        }
        return price;
    }

    @Override
    public String toString() {
        return String.format("You have chosen snack type = Fruit Snack, of size = %c, ID = %s, and price = %.2f\n\n", size, id, calcPrice());
    }

}

