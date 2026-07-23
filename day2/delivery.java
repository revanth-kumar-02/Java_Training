package day2;

import java.util.Scanner;

public class delivery {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        String name = "", address = "", email = "", mobile = "";
        int foodChoice;
        double foodPrice = 0.0;
        boolean isValid = true;

        System.out.println("Welcome to our shop");
        System.out.println("Enter your name: ");
        name = check.nextLine();
        System.out.println("Enter your Email Id: ");
        email = check.nextLine();
        System.out.println("Enter your Mobile Number: ");
        mobile = check.nextLine();
        System.out.println("Enter your Delivery Address: ");
        address = check.nextLine();

        if (!name.matches("^[A-Za-z ]{3,30}$")) {
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

        System.out.println("Here is the food menu");
        System.out.println("1. Burger");
        System.out.println("2.Pizza");
        System.out.println("3.Fried Rice");
        System.out.println("4.Biryani");

        System.out.println("Enter your food number: ");
        foodChoice = check.nextInt();
        switch (foodChoice) {
            case 1:
                System.out.println("Burger");
                foodPrice = 250;
                break;
            case 2:
                System.out.println("Pizza");
                foodPrice = 150;
                break;
            case 3:
                System.out.println("Fried Rice");
                foodPrice = 180;
                break;
            case 4:
                System.out.println("Biryani");
                foodPrice = 220;
            default:
                break;
        }
        System.out.println("Thanks for buying from us");
        System.out.println();
        System.out.println("================================");
        System.out.println("Customer Name       : " + name);
        System.out.println("Customer Email id   : " + email);
        System.out.println("Customer Ph.no      : " + mobile);
        System.out.println("Customer Address    : " + address);
        System.out.println("Food from menu      : " + foodChoice);
        System.out.println("Food Price          : " + foodPrice);
        System.out.println("=================================");
        if (isValid) {
            System.out.println("Delivery details accepted");
        } else {
            System.out.println("Please correct the invalid details and try again");
        }

        check.close();
    }
}
