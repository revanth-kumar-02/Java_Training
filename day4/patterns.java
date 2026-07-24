package day4;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner block = new Scanner(System.in);
        int limit = 0;
        char word = 'Z';
        System.out.println("Enter the row limit ");
        limit = block.nextInt();
        for (int row = limit; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(word + " ");
                word--;
            }
            System.out.println();
        }
        block.close();
    }
}
