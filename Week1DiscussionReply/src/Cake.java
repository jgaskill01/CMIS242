
public class Cake {

    //attributes
    private String flavor;
    private int layers;
    private int diameter;
    private String message;
    //new attribute
    private String icingType;


    //constructor
    public Cake (String flavor, String icingType, int layers, int diameter, String message) {

        this.flavor = flavor;
        this.layers = layers;
        this.diameter = diameter;
        this.message = message;
        this.icingType = icingType;
    }

    //Price calculation based on layers and diameter
    public int cakePrice() {
        int cakePrice = layers * diameter;
        return cakePrice;
    }

    public String displayCake() {
        return "\nCake order: \nFlavor: " + flavor + "\nIcing Type: " + icingType + "\nLayers: " + layers + "\nDiameter: " + diameter + " inches\nMessage: " + message + "\nTotal Price of Cake: " + cakePrice() + "$" ;

    }
}
