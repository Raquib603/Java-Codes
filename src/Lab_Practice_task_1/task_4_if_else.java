package Lab_Practice_task_1;

import java.util.Scanner;

public class task_4_if_else {
    public static void main (String args[]){
     int x, y;
     Scanner var = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        x = var.nextInt();
        System.out.print("Enter the second number : ");
        y = var.nextInt();

        System.out.println("\n1. + \n2. - \n3. * \n4. /");
        System.out.print("Choose the operation : ");
        int z = var.nextInt();

        if (z==1) System.out.println("Summetion is : "+(x+y));
        if (z==2) System.out.println("Substraction is : "+(x-y));
        if (z==3) System.out.println("Multiplication is : "+(x*y));
        if (z==4) System.out.println("Division is : "+(x/y));

        else System.out.println("Choose the correct operation number");


    }
}
