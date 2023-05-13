/**
 * This class converts Temperature Fahrenheit to Celsius
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 22 April 2023
 * @version 1.0
 */

public class TemperatureConverter extends Converter {

    //default constructor, sets input value to NaN
    public TemperatureConverter() {
        super();
    }

    //overloaded consturctor sets input to a value decided by user
    public TemperatureConverter(double input) {
        super(input);
    }

    //override method to conduct conversion
    @Override
    public double convert() {
        if (Double.isNaN(getInput())) {
            return Double.NaN;
        }
        return ((getInput() - 32) * 5) / 9;
    }
}