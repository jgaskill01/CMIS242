public abstract class Snack {
    String id = "ID#" + ((int) (Math.random() * 1000) + 100);
    char size;

    public Snack() {
    }

    public Snack(char size) {
        this.size = size;
    }

    public abstract double calcPrice();

    public char getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public double getBasePrice(char size) {
        switch (size) {
            case 'S':
                return 19.99;
            case 'M':
                return 29.99;
            case 'L':
                return 39.99;
            default:
                return 0.00;
        }
    }

    public String toString() {
        return String.format("You have chosen snack type = %s, of type = %c. id = %s, and price = %.2f\n\n", getClass().getSimpleName(), size, id, calcPrice());
    }

}
