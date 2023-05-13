/**
 *
 * This class is a child of media and contains the attributes and methods of the media family as well as its own
 *
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

import java.util.*;

class EBook extends Media {
    private int chapters;

    public EBook(int id, String title, int yearPublished, int chapters, boolean isAvailable) {
        super(id, title, yearPublished);
        this.chapters = chapters;
        this.isAvailable = isAvailable;
    }


    public int getChapters() {
        return this.chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public double calculateRentalFee() {
        double fee = this.chapters * 0.10;
        if (getYearPublished() == Calendar.getInstance().get(Calendar.YEAR)) {
            fee += 1.0;
        }
        return fee;
    }

    public String toString() {
        return "EBook [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYearPublished() + ", chapters=" + this.chapters + " available=" + isAvailable() + "]";
    }
}
