package day2;

import java.util.Scanner;

public class param {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double weight = 0, height = 0, bmi = 0;
        String status = "",name = "";
        System.out.println("Welcome to know your health ");
        System.out.println("Let us know your name : ");
        name = info.next();
        System.out.println("Let us know your weight(Kg) ");
        weight = info.nextDouble();
        System.out.println("Let us know your height(cm) ");
        height = info.nextDouble();
        height/=100;
        bmi = weight/(height*height);
        status = (bmi<18.0)?"Underweight":
        (bmi>=18.0&&bmi<=24.0)?"Normal":
        (bmi>24.0&&bmi<28.0)?"Overweight":"Obese";
        System.out.println("The user "+name+"and here is your health update "+status);


        info.close();
    }
    

}
