//Triangle Pattern

package day4;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner block = new Scanner(System.in);
        int limit = 0;

        System.out.print("Enter the row limit ");
        limit = block.nextInt();

        for (int row = 1; row <= limit; row++) {
            for (int space = 1; space <= limit - row; space++) {
                System.out.print("  ");
            }

            char current = (char) ('Z' - (row - 1));
            for (int column = 1; column <= row; column++) {
                System.out.print(current + " ");
                current--;
            }

            System.out.println();
        }

        block.close();
    }
}
