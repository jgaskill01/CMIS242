import java.util.Scanner;

public class OrderSystem {
    Scanner scan = new Scanner(System.in);

    public void mainMenuDisplay() {
        System.out.println("MENU" +
                "\nPlease select from the below menu options:" +
                "\n1. Order a Snack" +
                "\n2. Exit Program");
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

    public char getUserSizeSelection() {
        System.out.println("What size do you want: S, M, or L");
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


    public static void main(String[] args) {
    }
}