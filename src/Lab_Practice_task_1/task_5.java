package Lab_Practice_task_1;

import java.util.Scanner;

public class task_5 {

   static int fact(int x){
       int y = 1;
       if (x == 0){
           return 1;
       }
       else {
           for (int i = 1; i<=x; i++){
               y *= i;
           }
       return y;
       }
   }

   static int nCr(int x, int y){

       return fact(x)/(fact(y)*fact(x-y));
   }

    public static void main (String args[]){
        Scanner var = new Scanner(System.in);
        int x,y;
        System.out.print("Enter n - ");
        x = var.nextInt();
        System.out.print("Enter r - ");
        y = var.nextInt();

        int z = nCr(x,y);
        System.out.println("---------Combination------- ");
        System.out.println("          "+x+"C"+y+" = "+z);

    }
}
