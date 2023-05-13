/**
 * Parent converter class, defines values, attributes, and methods for all child
 * converters
 *
 * @author Jacob Gaskill
 * CMIS 242/7380
 * Completed 22 April 2023
 * @version 1.0
 */

public class Converter {
    //attribute (input is made a final, makes setter unnecessary)
    private final double input;

    //default constructor (sets input to "NaN")
    public Converter() {
        this.input = Double.NaN;
    }
    //overloaded constructor that sets the input to a value
    public Converter(double input) {
        this.input = input;
    }
    //method to get the user input to be converted
    public double getInput() {
        return input;
    }

    //default conversion method, returns input without conversion
    public double convert() {
        return input;
    }
}
