package day1;
import java.util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        int option,inr = 1;
        double usd = 0.01, eur = 0.009, amount = 0, convertedValue = 0;
        double inrUsd = 96.0, inrEur = 110.0;

        System.out.println("Currency Converter");
        System.out.println("Choose which currency :");
        System.out.println("1. INR to USD");
        System.out.println("2.USD to INR");
        System.out.println("3.INR to EUR");

        System.out.println("Enter the currency: ");
        option = money.nextInt();

        if(option == 1) {
            System.out.println("INR To USD Converter ");
            System.out.println("Enter the amount: ");
            amount = money.nextDouble();
            convertedValue = amount*usd;
            System.out.println("The given amount is "+amount+" and the converted value is "+convertedValue);

        }
         else if(option == 2) {
            System.out.println("USD To INR Converter ");
            System.out.println("Enter the amount: ");
            amount = money.nextDouble();
            convertedValue = amount*inr;
            System.out.println("The given amount is "+amount+" and the converted value is "+convertedValue);

        }
        else if(option == 3) {
            System.out.println("INR To EUR Converter ");
            System.out.println("Enter the amount: ");
            amount = money.nextDouble();
            convertedValue = amount*eur;
            System.out.println("The given amount is "+amount+" and the converted value is "+convertedValue);

        }
        else {
            System.out.println("Invalid Currency");
        }


    }
}
