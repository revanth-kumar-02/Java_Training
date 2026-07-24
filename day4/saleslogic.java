package day4;

import java.util.Scanner;
public class saleslogic {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        double time = 21.00;
        int required = 0, payable = 0, stock = 20, invoice = 0;
        System.out.println();
        System.out.println("Welcome to the End of the Season Sale");
        System.out.println();
        System.out.println("________________________________");
        System.out.println();
        System.out.println("1.Laptop        ₨ 14,000");
        System.out.println("2.Mobile        ₨ 7,000");
        System.out.println("3.Acessories    ₨ 1,000");
        System.out.println("4.Tv            ₨ 10,000");
        System.out.println("________________________________");
        System.out.println();
        while(stock>0 && time<=21.45) {
            System.out.println("Let us know quantity ");
            required = option.nextInt();
            if(required<=stock) {
                System.out.println("Enter the amount to pay");
                payable = option.nextInt();
                if(payable>=(required*25600))
                {
                    stock-=required;invoice++;
                }
                else{
                    System.out.println("Insufficient to buy");
                }
            }else{
                System.out.println("Available "+stock);
            }time+=0.01;
        }
        System.out.println("Invoice's "+invoice);
        option.close();
    }
}
