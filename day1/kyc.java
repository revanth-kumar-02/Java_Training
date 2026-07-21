package day1;

import java.util.Scanner;

public class kyc {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String name="" , pan = "", address = "";
        long aadhar = 0L, mobile = 0L;
        
        System.out.println("Welcome to the Bank");

        System.out.println("Enter your name: ");
        name = user.nextLine();
        System.out.println("Enter your address: ");
        address = user.nextLine();
        System.out.println("Enter PAN card: ");
        pan = user.next();
        System.out.println("Enter your mobile no: ");
        mobile = user.nextLong();
        System.out.println("Enter your aadhar number: ");

        System.out.println("Thanks for registering our system "+name+" Hope you enjoyed the experience. For more details we contact you "+mobile);
   
   
   
    }
}
