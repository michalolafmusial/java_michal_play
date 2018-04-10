import java.util.Scanner;

public class Utility {

    private String checkIfContinue;
    private boolean userContinue;

    public String getCheckIfContinue() {
        return checkIfContinue;
    }

    public void setCheckIfContinue(String checkIfContinue) {
        this.checkIfContinue = checkIfContinue;
    }

    public boolean checkIfContinue() {
        System.out.println("Continue? (Type Y to continue)");
        Scanner read7 = new Scanner(System.in);
        checkIfContinue = read7.nextLine();
        if (checkIfContinue.equals("Y")) {
            userContinue = true;
        }
        return userContinue;
    }
}
