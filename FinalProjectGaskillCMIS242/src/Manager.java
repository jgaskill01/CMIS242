/**
 *
 * This class contains all the methods and core functionality of the program.
 *
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final List<Media> mediaList;

    public Manager() {
        mediaList = new ArrayList<Media>();
    }

    public boolean loadMediaObjectsFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] mediaData = line.split(",");
                int id = Integer.parseInt(mediaData[0]);
                String title = mediaData[1];
                int yearPublished = Integer.parseInt(mediaData[2]);
                boolean isAvailable = Boolean.parseBoolean(mediaData[3]);

                Media media;
                if (mediaData[4].equals("EBook")) {
                    int numChapters = Integer.parseInt(mediaData[5]);
                    media = new EBook(id, title, yearPublished, numChapters, isAvailable);
                } else if (mediaData[4].equals("MusicCD")) {
                    int lengthInMinutes = Integer.parseInt(mediaData[5]);
                    media = new MusicCD(id, title, yearPublished, isAvailable, lengthInMinutes);
                } else if (mediaData[4].equals("MovieDVD")) {
                    double sizeInMb = Double.parseDouble(mediaData[5]);
                    media = new MovieDVD(id, title, yearPublished, isAvailable, sizeInMb);
                } else {
                    throw new IllegalArgumentException("Unknown media type: " + mediaData[4]);
                }

                mediaList.add(media);
            }
            System.out.println("Successfully loaded media objects from file: " + filePath);
            return true;

        } catch (IOException ex) {
            System.out.println("Could not load media objects from file: " + filePath);
        }
        return false;
    }

    public List<Media> findMediaByTitle(String title) {
        List<Media> result = new ArrayList<Media>();
        for (Media media : mediaList) {
            if (media.getTitle().equals(title)) {
                result.add(media);
            }

        }
        return result;
    }

    public double rentMedia(int id) {
        for (Media media : mediaList) {
            if (media.getId() == id && media.isAvailable()) {
                media.setRented(true);
                System.out.println("Successfully rented media with ID " + id);
                return media.calculateRentalFee();
            }
        }
        System.out.println("Could not rent media with ID " + id);
        return -1.00;
    }
}