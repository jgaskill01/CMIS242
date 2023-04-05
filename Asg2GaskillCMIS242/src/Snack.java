public class Snack {
    String id;
    char size;
    double price;


    public Snack(){
    }
    public Snack(String id, char size, double price){
        this.id = id;
        this.size = size;
        this.price = getPrice();
    }
    public Snack(char size){
        this.size = size;
        setPrice(size);
    }
    public char getSize(){
        return size;
    }
    public void setSize(){
        this.size = size;
    }
    public void setPrice(char size){
        switch (size){
            case 'S': price = 19.99;
            break;
            case 'M' : price = 29.99;
            break;
            case 'L' : price = 39.99;
        }
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return String.format("You have chosen snack type = %s, of type = %c. id = %s, and price = %.2f", getClass().getSimpleName(), size, id, price);
    }

}
