package Lab_Practice_task_1;

import java.util.Scanner;

public class task_6 {
    public static void main (String args[]){
        Scanner var = new Scanner(System.in);
        String x;
        System.out.print("Enter the customer name : ");
        x = var.nextLine();

        System.out.print("Enter the customer id : ");
        int y = var.nextInt();

        System.out.print("Enter the usage of curret unit : ");
        int z = var.nextInt();

        if(0<=z && z<=200) System.out.println("Customer name : "+x+"\nCustomer id : "+y+"\nBill : "+(z*3.5));
        if(201<=z && z<=500) System.out.println("Customer name : "+x+"\nCustomer id : "+y+"\nBill : "+(z*4));
        if(501<=z && z<=1000) System.out.println("Customer name : "+x+"\nCustomer id : "+y+"\nBill : "+(z*5));
        if(z>1000) System.out.println("Customer name : "+x+"\nCustomer id : "+y+"\nElectricity Bill : "+(z*7));


    }
}
