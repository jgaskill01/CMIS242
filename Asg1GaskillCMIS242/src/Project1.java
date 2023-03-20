import jdk.jfr.internal.tool.Main;

/**
 * This class contains methods to find the minimum and maximum weights given three
 * weight objects, and a method to find average weight given three weight objects.
 * and main method to run the above methods.
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 19 March 2023
 * @version 1.0
 */

public class Project1 {

    //Method to find Minimum Weight
    private Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
        Weight minWeight = weight1;
        if (weight2.lessThan(minWeight))
            minWeight = weight2;
        if (weight3.lessThan(minWeight))
            minWeight = weight3;
        return minWeight;
    }

    //Method to find Maximum Weight
    private Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
        Weight maxWeight = weight1;
        if (!weight2.lessThan(maxWeight))
            maxWeight = weight2;
        if (!weight3.lessThan(maxWeight))
            maxWeight = weight3;
        return maxWeight;

    }

    //Method to find Average Weight
    private Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {
        Weight avgWeight = weight1;
        avgWeight.addTo(weight2);
        avgWeight.addTo(weight3);
        return avgWeight.divide(3);
    }

    //Main method
    public static void main(String[] args) {
        Project1 controller = new Project1();
        System.out.println("Jacob Gaskill, CMIS 242, 19 MARCH 2023");
        System.out.println();
        Weight weight1 = new Weight(11, 3);
        System.out.printf("Created Weight1: %s\n", weight1);
        Weight weight2 = new Weight(7, 20);
        System.out.printf("Created Weight2: %s\n", weight2);
        Weight weight3 = new Weight(14, 6);
        System.out.printf("Created Weight3: %s\n", weight3);
        System.out.println();
        System.out.printf("Minimum Weight:  %s\n", controller.findMinimum(weight1, weight2, weight3));
        System.out.println();
        System.out.printf("Maximum Weight: %s\n", controller.findMaximum(weight1, weight2, weight3));
        System.out.println();
        System.out.printf("Average Weight: %s\n", controller.findAverage(weight1, weight2, weight3));
    }
}