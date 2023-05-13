/**
 *
 *This class contains the run and main methods, and shows the user the menu, takes user input, and handles which methods
 * from the manager class that run based on that input
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

import java.util.List;
import java.util.Scanner;

public class MediaRentalSystem {
    private Manager manager;

    public MediaRentalSystem() {
        manager = new Manager();
    }

    public void run() {
        System.out.println("Welcome to the Media Rental System, by Jacob Gaskill CMIS 242/7380");

        while (true) {
            System.out.println("1: Load Media objects");
            System.out.println("2: Find Media object");
            System.out.println("3: Rent Media object");
            System.out.println("9: Quit");

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("Enter path (directory) to load from: ");
                    String path = scanner.next();
                    boolean success = manager.loadMediaObjectsFromFile(path);
                    if (!success) {
                        System.out.println("File cannot be opened: Could not load, no such directory");
                    }
                    break;

                case 2:
                    System.out.print("Enter the title: ");
                    String title = scanner.next();
                    List<Media> mediaList = manager.findMediaByTitle(title);
                    if (mediaList.size() == 0) {
                        System.out.println("There is no media with this title: " + title);
                    } else {
                        for (Media media : mediaList) {
                            System.out.println(media.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the id: ");
                    int id = scanner.nextInt();
                    double rentalFee = manager.rentMedia(id);
                    if (rentalFee < 00) {
                        System.out.println("The media object id=" + id + " is not found");
                    } else {
                        System.out.println("Media was successfully rented. Rental fee = $" + String.format("%.2f", rentalFee));
                    }
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MediaRentalSystem system = new MediaRentalSystem();
        system.run();
    }
}