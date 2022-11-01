package Lab_Practice_task_1;

import java.util.Scanner;

public class task_4_switch {
    public static void main (String args[]){
        double x, y;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        x = var.nextDouble();
        System.out.print("Enter the second number : ");
        y = var.nextDouble();

        System.out.println("\n1. + \n2. - \n3. * \n4. / \n");
        System.out.print("Choose the operation : ");
        int z = var.nextInt();
        switch (z) {
            case 1: System.out.println("Summetion is : "+(x+y)); break;
            case 2: System.out.println("Substraction is : "+(x-y)); break;
            case 3: System.out.println("Multiplication is : "+(x*y)); break;
            case 4: System.out.println("Division is : "+(x/y)); break;

            default:
                System.out.println("Ohh! Please choose the correct operation number.");

        }

    }
}
