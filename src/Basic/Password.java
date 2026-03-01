package Basic;
import java.util.Scanner;
public class Password {





    public static void main(String[] args) {

        String correctPassword = "java123";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}
