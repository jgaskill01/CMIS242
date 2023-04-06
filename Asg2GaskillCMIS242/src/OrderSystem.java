import java.util.InputMismatchException;
import java.util.Scanner;


public class OrderSystem {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        orderSystem.run();
    }

    public void mainMenuDisplay() {
        System.out.println("MENU" + "\nPlease select from the below menu options:" + "\n1. Order a Snack" + "\n2. Exit Program");
    }

    public void foodOptionsDisplay() {
        System.out.println("Do you want Fruit Snack (1) or Salty Snack (2)?");
    }

    public int getUserIntSelection() {
        int userIntSelection = 0;
        while (true) {
            try {
                userIntSelection = Integer.parseInt(scan.nextLine());
                if (userIntSelection < 1 || userIntSelection > 2) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Entry, please select either 1 or 2");
            }
        }
        return userIntSelection;
    }
    public void upChargeOptionPrompt(int type) {
        if (type == 1) {
            System.out.println("Do you want citrus fruit included? true/false: ");
        } else {
            System.out.println("Do you want nut snack included? true/false: ");
        }
    }

    public boolean getUserBoolSelection() {
        boolean userBoolSelection = false;
        while (true) {
            try {
                userBoolSelection = scan.nextBoolean();
                scan.nextLine();
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Invalid Entry, please enter either \"True\" or \"False\"");
            }
        }
        return userBoolSelection;

    }

    public void sizePrompt() {
        System.out.println("What size do you want: S, M, or L");
    }

    public char getUserSizeSelection() {

        char userSizeSelection = '\0';
        while (true) {
            userSizeSelection = scan.nextLine().toUpperCase().charAt(0);
            if (userSizeSelection != 'S' && userSizeSelection != 'M' && userSizeSelection != 'L') {
                System.out.println("Invalid Entry. Please select a size (S, M, or L)");
                continue;
            }
            break;
        }
        return userSizeSelection;
    }

    public Snack getSnackSelection(){
        foodOptionsDisplay();
        int snackType = getUserIntSelection();
        sizePrompt();
        char size = getUserSizeSelection();
        upChargeOptionPrompt(snackType);
        boolean upChargeChoice = getUserBoolSelection();
        if (snackType == 1){
            return new FruitSnack(size, upChargeChoice);
        } else {
            return new SaltySnack(size, upChargeChoice);
        }
    }

    public void run() {
        int orderPrompt = 1;

        while (orderPrompt != 2) {
            mainMenuDisplay();
            orderPrompt = getUserIntSelection();
            if (orderPrompt == 1) {
                Snack snack = getSnackSelection();
                System.out.println(snack);
            }
        }
        scan.close();
    }
}