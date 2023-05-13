/**
 * This abstract class contains the attributes and methods of all the objects that are considered "Media"
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

public abstract class Media {
    private final int id;
    private String title;
    private int yearPublished;
    public boolean isAvailable;

    public Media(int id, String title, int yearPublished) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public double calculateRentalFee() {
        return 3.50;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRented(boolean rented) {
        isAvailable = false;
    }
}