// Name: Posko, Jake // edited by Jacob Gaskill     CMIS 242/7380     Date: 03/31/2023


public class Main {

    public static void main(String[] args) {

        System.out.print("Name: Posko, Jake, Edited by Jacob Gaskill     CMIS 242/7380     Date: 03/31/2023\n");

        Acoustic acoustic = new Acoustic();
        Electric electric = new Electric();
        Bass bass = new Bass();

        acoustic.setColor("blue");
        electric.setColor("yellow");
        bass.setColor("Black");

        acoustic.setType("acoustic");
        electric.setType("electric");
        bass.setType("bass");

        acoustic.setStrings(6);
        electric.setStrings(6);
        bass.setStrings(4);


        System.out.println(acoustic.toString());
        acoustic.soundHole();


        System.out.println(electric.toString());
        System.out.println(electric.displayVolume());

        System.out.println(bass.toString());
        System.out.println(bass.displayGain());

    }

}
