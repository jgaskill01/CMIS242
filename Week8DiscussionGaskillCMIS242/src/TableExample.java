import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TableExample {
    public static void main(String[] args) {
        System.out.println("Jacob Gaskill, CMIS 242 7380, 6MAY2023");
        int rows = 0;
        int columns = 0;
        int[][] data = null;

        try {

            File file = new File("C:\\Users\\jgask\\IdeaProjects\\CMIS242\\Week8DiscussionGaskillCMIS242\\src\\data.txt");
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String[] section = line.split(",");
            rows = Integer.parseInt(section[0]);
            columns = Integer.parseInt(section[1]);
            data = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                line = scan.nextLine();
                section = line.split(",");
                for (int j = 0; j < columns; j++) {
                    data[i][j] = Integer.parseInt(section[j]);
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("Invalid data format: " + e.getMessage());
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
    }
}