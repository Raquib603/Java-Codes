package Array;

import java.util.Arrays;
import java.util.Scanner;

public class two_d_array_input {
    public static void main (String args[]) {
        int m, n;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter the row : ");
        m = var.nextInt();
        System.out.print("Enter the column : ");
        n = var.nextInt();
    int x[][]= new int[m][n];

    int i, j, z;

    

    for (i =0; i<m; i++) {
        for (j = 0; j < n; j++){
            System.out.print("Enter the element : ");
        z = var.nextInt();
        x[i][j] = z;
      }
    }
        System.out.println("2d Array : ");
        for (i =0; i<3; i++) {
            for (j = 0; j < 3; j++){
                System.out.print(x[i][j]+"\t");

            }
            System.out.println(" ");
        }





    }
}
