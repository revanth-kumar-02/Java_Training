import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number ");
        num = check.nextInt();

        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        // positive or negative
        int result = ~num + 1;
        System.out.println(result);
        check.close();
    }
}
