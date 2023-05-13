/**
 *
 * This class is a child of media and contains the attributes and methods of the media family as well as its own
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 9 MAY 2023
 * @version 1.0
 */

import java.util.Calendar;


class MusicCD extends Media {
    private int length;

    public MusicCD(int id, String title, int yearPublished, boolean isAvailable, int length) {
        super(id, title, yearPublished);
        this.length = length;
        this.isAvailable = isAvailable;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double calculateRentalFee() {
        double fee = this.length * 0.02;
        if (getYearPublished() == Calendar.getInstance().get(Calendar.YEAR)) {
            fee += 1.0;
        }
        return fee;
    }

    public String toString() {
        return "MusicCD [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYearPublished() + ", length=" + this.length + " available=" + isAvailable() + "]";
    }
}
