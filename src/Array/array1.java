package Array;

import java.util.Scanner;


public class array1 {
    static void display_info(){
        System.out.println("What is it but a void display function");
    }
 public static void main (String args[]){
     System.out.print("Enter the number for its factorial : ");
     int j = 1;
     Scanner var = new Scanner(System.in);
     int x = var.nextInt();
     for(int i =1; i<=x; i++){
         j *= i;
     }
     display_info();
     System.out.println("Factorial of "+x+" is : "+j);
     System.out.println("What the : ? What");

    }

}
