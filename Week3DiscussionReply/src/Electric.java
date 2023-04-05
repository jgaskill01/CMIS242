// Name: Posko, Jake // edited by Jacob Gaskill     CMIS 242/7380     Date: 03/31/2023


public class Electric extends Guitar{

    //attribute specific to this child class
    private static String volume = "volume knob";



    //Method to Display
    public String displayVolume() {
        String display  = "And this guitar has a " + volume + ".";
        return display;
    }


}
