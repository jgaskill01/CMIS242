public class FruitSnack extends Snack {
    boolean isCitrusIncluded;
    double citrusCharge = 5.99;



    public FruitSnack() {
    }

    public FruitSnack(char size) {
        super(size);
    }
    public FruitSnack(char size, double price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public FruitSnack(String id, char size, double price){
        this.id = id;
        this.size = size;
        this.price = getPrice();

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
    @Override
    public void setPrice(char size) {
        super.setPrice(size);
        if (isCitrusIncluded) {
            price += citrusCharge;
        }
    }

    public double getPrice() {
        return price;
    }
}

