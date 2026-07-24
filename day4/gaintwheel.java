package day4;
import java.util.Scanner;
public class gaintwheel {
    public static void main(String[] args) {
       Scanner rev = new Scanner(System.in);
       for (int cabin =91; cabin>=87; cabin--){
           System.out.println("New cabin arrived");
           for (int person=1; person<=4;){
            System.out.println("Let me know your age");
            int age = rev.nextInt();
            if (age>=18&&age<=60){
                System.out.println("You can ride");
                person++;
            }
            else if (age<18){
                System.out.println("You are not allowed to ride");
            }
            else if (age>60){
                System.out.println("You are not allowed to ride");
                rev.close();
            }
           }
       }
    }
    
}