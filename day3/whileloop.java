import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit=0,number = 0, prev1=Integer.MIN_VALUE;
        int prev2 = Integer.MIN_VALUE;
        System.out.println("Enter the limit");
        limit = sc.nextInt();
        while(limit>0){
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(prev1<number){
                prev2 = prev1;prev1 = number;}
            else if(prev2<number&&number!=prev1){
                prev2 = number;
            limit--;
            }
            else {
                System.out.println("Adding number");
            }
        }
        System.out.println(prev1+" "+prev2);
        sc.close();
    }
}
