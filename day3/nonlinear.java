import java.util.Scanner;

public class nonlinear {
    public static void main(String[] args) {
        int mBalance = 20000, count = 0;
        Scanner sc = new Scanner(System.in);
        int required = 0;
        while(mBalance>=500) {
            System.out.println("Requirement amount");
            required = sc.nextInt();
            if(required<=mBalance) {
                if(required%500==0) {
                    mBalance-=required;
                    System.out.println(required+" dispensed");
                    count++;
                }else System.out.println("Invalid denom");
            }else 
                System.out.println("Insufficient balance");
        }
    }
}
