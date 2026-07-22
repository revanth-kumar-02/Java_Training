//Emi calculator using switch case 
package day2;

import java.util.Scanner;

public class emi_cal {
    public static void main(String[] args) {
        int tenure = 0; double cost = 0,emi = 0;
        Scanner check = new Scanner(System.in);
        System.out.println("The Amount for EMI eligibilty");
        cost = check.nextDouble();
        if(cost>=5000) {
            System.out.println("Eligible to convert "+cost+" info EMI");
            System.out.println("Enter the desired tenure");
            tenure = check.nextInt();

            switch (tenure) {
                case 12: case 3: case 6: case 9:
                    emi = (cost+(cost*0.05))/tenure;
                    System.out.println("ROI 5%");                    
                    break;
                case 24:
                    emi = (cost+(cost*0.10))/tenure;
                    System.out.println("ROI 10%");                    
                    break;
                case 36:
                    emi = (cost+(cost*0.15))/tenure;
                    System.out.println("ROI 15%");                    
                    break;
                default:
                    System.out.println("Invalid tenure");
                    break;
            }
            System.out.println("Your repayment EMI "+emi);
        }else {
            System.out.println(cost+" is not eligible for EMI");
        }
        check.close();
    }
}
