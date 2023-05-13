/**
 *
 *This class is a child of media and contains the attributes and methods of the media family as well as its own
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

class MovieDVD extends Media {
    private double sizeInMB;

    public MovieDVD(int id, String title, int yearPublished, boolean isAvailable, double sizeInMB) {
        super(id, title, yearPublished);
        this.sizeInMB = sizeInMB;
        this.isAvailable = isAvailable;
    }

    public double getSize() {
        return this.sizeInMB;
    }

    public void setSize(double size) {
        this.sizeInMB = size;
    }

    public double calculateRentalFee() {
        return 3.50;
    }

    public String toString() {
     return "MovieDVD [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYearPublished() + ", size=" + this.sizeInMB + " available=" + isAvailable() + "]";
    }

}