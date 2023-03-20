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

    //Accessors (Getters)
    public String getWaterSourceName() {
        return waterSourceName;
    }

    public int getCurrentDepth() {
        return currentDepth;
    }

    public int getPastDepth() {
        return pastDepth;
    }

    //Mutators (Setters)
    public void setWaterSourceName(String waterSourceName) {
        this.waterSourceName = waterSourceName;
    }

    public void setCurrentDepth(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    public void setPastDepth(int pastDepth) {
        this.pastDepth = pastDepth;
    }

    //toString format
    public String toString() {
        return String.format("Name: %s \nDepth as of 16 March 2023: %d feet \nDepth in 2013: %d feet", waterSourceName, currentDepth, pastDepth);
    }

}