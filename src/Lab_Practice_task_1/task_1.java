package Lab_Practice_task_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String args[]){
        System.out.print("Enter your height (cm) : ");
        Scanner var = new Scanner(System.in);
        double x = var.nextDouble();

        System.out.print("Enter your weight (kg) : ");
        double y = var.nextDouble();

        System.out.println("After converting : ");
        System.out.println("Your height is : "+(x*0.393701)+" inch");
        System.out.println("Your height is : "+(y*2.20462)+" pound");

    }
}
