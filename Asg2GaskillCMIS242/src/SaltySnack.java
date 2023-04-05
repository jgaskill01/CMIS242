public class SaltySnack extends Snack {
    boolean isNutSnackIncluded;
    double nutCharge = 4.50;

    public SaltySnack() {
    }

    public SaltySnack(char size){
        this.id = id;
        this.size = size;
    }
    public SaltySnack(String id, char size) {
        this.id = id;
        this.size = size;
    }

    public SaltySnack(String id, char size, double price){
        super(id, size, price);
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
    @Override
    public void setPrice(char size) {
        super.setPrice(size);
        if (isNutSnackIncluded) {
            price += nutCharge;
        }
    }
}
