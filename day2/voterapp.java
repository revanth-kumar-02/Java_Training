package day2;

import java.util.Scanner;

public class voterapp {
    public static void main(String[] args) {

        Scanner decision = new Scanner(System.in);
        int option = 0;
        String mobile = "";
        boolean isValid = true;
        String email = "", name = "", address = "";
        // for better spacing
        System.out.println();
        // starting point
        System.out.println("Welcome to our voting system");
        System.out.println();
        System.out.println("What would you like to do.?");
        System.out.println("1.Voting Area");
        System.out.println("2.Exit");
        System.out.println();
        System.out.println("Where would you like to go ");
        System.out.println("Enter your choice: ");
        option = decision.nextInt();
        decision.nextLine();
        System.out.println();
        if (option == 1) {

            System.out.println("For voting you need to fill these details");
            System.out.println("Name | Email Id | Mobile | Address");
            System.out.println();
            System.out.println("Enter your Name : ");
            name = decision.nextLine();
            System.out.println();
            System.out.println("Enter your Email Id : ");
            email = decision.nextLine();
            System.out.println();
            System.out.println("Enter your mobile number : ");
            mobile = decision.nextLine();
            System.out.println();
            System.out.println("Enter your Address : ");
            address = decision.nextLine();
            System.out.println();
            if (!name.matches("^[A-Za-z ]{5,}$")) {
                isValid = false;
                System.out.println("Invalid Name");
            }
            if (!email.matches("^[A-Za-z0-9_.-]{2,}@[A-Za-z]{3,}\\.[a-z]{2,}$")) {
                isValid = false;
                System.out.println("Invalid Email Id");
            }
            if (!mobile.matches("^[0-9]{10}$")) {
                isValid = false;
                System.out.println("Invalid mobile number");
            }
            if (!address.matches("^[A-Za-z0-9 ]{5,}$")) {
                isValid = false;
                System.out.println("Invalid Address");
            }

            if (isValid) {
                System.out.println(
                        "The User " + name + " data are valid. for further updates send to " + mobile + " or " + email);
            } else {
                System.out.println("Application Rejected");
            }
        }
        if (option == 2) {
            System.out.println("Thanks for visiting our system");
        }
        decision.close();
    }
}
