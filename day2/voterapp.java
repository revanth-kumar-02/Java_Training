package day2;

import java.util.Scanner;

public class voterapp {
    public static void main(String[] args) {

        Scanner decision = new Scanner(System.in);
        int option = 0;
        double mobile = 0L;
        String email = "" ,name = "",address = "";
        //for better spacing
        System.out.println();
        //starting point
        System.out.println("Welcome to our voting system");
        System.out.println();
        System.out.println("What would you like to do.?");
        System.out.println("1.Voting Area");
        System.out.println("2.Result Area");
        System.out.println();
        System.out.println("Where would you like to go ");
        System.out.println("Enter your choice: ");
        option = decision.nextInt();
        System.out.println();
        if (option == 1) {
            
            System.out.println("For voting you need to fill these details");
            System.out.println("Name | Email Id | Mobile | Address");
            System.out.println();
            System.out.println("Enter your Name : ");
            name = decision.nextLine();
            
            if(!name.matches())
        }

    }
}
