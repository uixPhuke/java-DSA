package Basic;

import java.util.Scanner;

    class UserDefinedPassword {
        String password;

        // Constructor to set password
        UserDefinedPassword(String password) {
            this.password = password;
        }

        // Method to check password
        void checkPassword(String input) {
            if (password.equals(input)) {
                System.out.println("Correct Password");
            } else {
                System.out.println("Incorrect Password");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Set your password: ");
            String setPass = sc.nextLine();

            UserDefinedPassword obj = new UserDefinedPassword(setPass);

            System.out.print("Enter password to login: ");
            String loginPass = sc.nextLine();

            obj.checkPassword(loginPass);
        }
    }

