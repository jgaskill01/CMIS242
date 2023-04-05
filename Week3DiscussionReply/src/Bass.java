// Name: Posko, Jake // edited by Jacob Gaskill     CMIS 242/7380     Date: 03/31/2023


public class Bass extends Guitar {

    //attribute specific to this child class
    private static String gain = "gain knob";

    //Method to Display
    public String displayGain() {
        String display  = "And this guitar has a " + gain + ".";
        return display;
    }

}
