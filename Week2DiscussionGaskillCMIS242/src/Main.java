import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);

    //update the name with user input
    public void updateName(WaterSource waterSource) {
        System.out.println("Enter the name of the freshwater source: ");
        waterSource.setWaterSourceName(scan.nextLine());
    }
    //update the current depth with user input
    public void updateCurrentDepth(WaterSource waterSource) {
        System.out.println("Enter the current average depth of the source in feet: ");
        waterSource.setCurrentDepth(scan.nextInt());
        scan.nextLine();
    }
    //update the past depth with user input
    public void updatePastDepth(WaterSource waterSource) {
        System.out.println("Enter the depth of the source in 2013 in feet: ");
        waterSource.setPastDepth(scan.nextInt());
        scan.nextLine();
    }
    //update all values
    public void updateValues(WaterSource waterSource) {
        updateName(waterSource);
        updateCurrentDepth(waterSource);
        updatePastDepth(waterSource);
    }


    //check change in depth over time
    public void checkDepthChange(int pastDepth, int currentDepth) {
        if (pastDepth - currentDepth > 0) {
            System.out.println("The depth is declining");
        } else if (pastDepth - currentDepth == 0) {
            System.out.println("The Depth is not declining");
        } else {
            System.out.println("The depth is increasing");
        }
    }

    public static void main(String[] args) {
        Main controller = new Main();
        WaterSource waterSource = new WaterSource();
        System.out.println(waterSource);
        System.out.println();
        controller.updateValues(waterSource);
        System.out.println(waterSource);
        controller.checkDepthChange(waterSource.getPastDepth(), waterSource.getCurrentDepth());
    }
}








