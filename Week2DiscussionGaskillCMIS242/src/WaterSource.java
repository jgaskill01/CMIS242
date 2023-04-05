import java.util.Scanner;

public class WaterSource {

    //Initialize Scanner
    Scanner scan;

    //Attributes
    private String waterSourceName;
    private int currentDepth;
    private int pastDepth;

    //Base Constructor
    public WaterSource() {
        this("Initial Values", 0, 0);
    }

    //Overloaded Constructor
    public WaterSource(String waterSourceName, int currentDepth, int pastDepth) {
        this.waterSourceName = waterSourceName;
        this.currentDepth = currentDepth;
        this.pastDepth = pastDepth;
        this.scan = new Scanner(System.in);
    }


    //waterSource name getter and setter
    public String getWaterSourceName() {
        return waterSourceName;
    }
    public void setWaterSourceName(String waterSourceName) {
        this.waterSourceName = waterSourceName;
    }

    //currentDepth getter and setter
    public int getCurrentDepth() {
        return currentDepth;
    }
    public void setCurrentDepth(int currentDepth) {
        this.currentDepth = currentDepth;
    }

     //pastDepth getter and setter
    public int getPastDepth() {
        return pastDepth;
    }
    public void setPastDepth(int pastDepth) {
        this.pastDepth = pastDepth;
    }

    //toString format
    public String toString() {
        return String.format("Name: %s \nDepth as of 16 March 2023: %d feet \nDepth in 2013: %d feet", waterSourceName, currentDepth, pastDepth);
    }

}