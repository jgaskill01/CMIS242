
public class IllegalUserOptionArgumentException extends IllegalArgumentException {
    private String message = null;

    public IllegalUserOptionArgumentException(int userOption){
        super("\nInvalid Entry ");
        message = "\nPlease select either 1 for Maple or 2 for Walnut. You entered: " + userOption;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " : " + message;
    }

}
