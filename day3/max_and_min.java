import java.util.Scanner;

public class max_and_min {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter num1 and num2:");
        int num1 = number.nextInt();
        int num2 = number.nextInt();

        int diff = num1 - num2;
        int buffer = (diff >> 31) & 1;
        int max = num1 - diff * buffer;
        int min = num2 + diff * buffer;

        System.out.println("Max " + max);
        System.out.println("Min " + min);

        number.close();
    }
}
