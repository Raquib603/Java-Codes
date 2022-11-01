package Lab_Practice_task_1;

import java.util.Scanner;

public class task_7 {
    static int summation(int n) {
        int sum;
        sum = (int)(Math.pow(10, n + 1) - 10 - (9 * n)) / 81;
        return sum;
    }

    public static void main(String args[]){
            Scanner var = new Scanner(System.in);
            System.out.print("Enter the series number N : ");
            int x = var.nextInt();
            System.out.println(summation(x));

    }
}
