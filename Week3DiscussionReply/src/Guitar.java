// Name: Posko, Jake // edited by Jacob Gaskill     CMIS 242/7380     Date: 03/31/2023


public class Guitar {

    //class attributes (I changed the strings variable to a private int for non-6-stringed guitars)
    private int strings;
    private String color;
    private String type;


    //Set color method
    public void setColor(String color) {
        this.color = color;
    }

    //Set type method
    public void setType(String type) {
        this.type = type;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    //Method to Display
    public String toString() {
        String display  = "\nCool!  You have a " + strings + " string, " + color + " " + type + " " + "guitar!";
        return display;
    }

}
