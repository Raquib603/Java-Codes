package Lab_Practice_task_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String args[]){
        Scanner var = new Scanner(System.in);
        System.out.print("Enter any number for check that it is even or odd : ");
        int x = var.nextInt();

        if (x == 0) System.out.println("Not a even number nor odd number");
        else if (x%2==0) {
            System.out.println("Its an even number ");
        }
        else System.out.println("Its an odd number ");


    }
}
