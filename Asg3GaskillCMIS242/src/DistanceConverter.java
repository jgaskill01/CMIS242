/**
 * This class converts miles to kilometers
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 22 April 2023
 * @version 1.0
 */

public class DistanceConverter extends Converter {

    //default parent constructor sets input to NaN
    public DistanceConverter() {
        super();
    }

    //overloaded constructor set input to user value
    public DistanceConverter(double input) {
        super(input);
    }

    //dynamic override method
    @Override
    public double convert() {
        if (Double.isNaN(getInput())) {
            return Double.NaN;
        }
        return getInput() * 1.609;
    }
}