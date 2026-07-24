package day4;

import java.util.Scanner;

public class DemoHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("let us know your name in odd length");
        String name = scanner.nextLine();
        int limit = name.length();
        for(int row=limit/2;row>=0;row--){
            for(int space=limit/2;space>row;space--)
                System.out.print(" ");
            for(int column=0;column<=(row*2);column++)
                System.out.print(name.charAt(column));
            System.out.println();
        }
        for(int row=1;row<=limit/2;row++){
            for(int space=limit/2;space>row;space--)
                System.out.print(" ");
            for(int column=0;column<=(row*2);column++)
                System.out.print(name.charAt(column));
            System.out.println();
        }
        scanner.close();
    }
}