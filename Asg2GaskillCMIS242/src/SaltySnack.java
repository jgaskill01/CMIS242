public class SaltySnack extends Snack {
    boolean isNutSnackIncluded;
    double nutCharge = 4.50;

    public SaltySnack() {
    }

    public SaltySnack(char size, boolean isNutSnackIncluded){
        this.size = size;
        this.isNutSnackIncluded = isNutSnackIncluded;
    }

    public void setId(char size){
        String newId = "S";
        newId += (int)size;
        newId += isNutSnackIncluded ? "X" : "N";
        this.id = newId;
    }
    public String getId(){
        return id;
    }

    public double calcPrice(){
        double price = getBasePrice(this.size);
        if (isNutSnackIncluded) {
            price += nutCharge;
        }
        return price;
    }

    @Override
    public String toString() {
        return String.format("You have chosen snack type = Salty Snack, of size = %c. ID = %s, and price = %.2f\n\n", size, id, calcPrice());
    }

}
