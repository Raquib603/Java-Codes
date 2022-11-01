package Array;

import java.util.Arrays;
import java.util.Scanner;

public class input_array {
    public static void main (String args[]) {
        int x[] = new int[5];
        Scanner var = new Scanner(System.in);
        int z = 0;
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.print("Enter the " + i + " element : ");
            z = var.nextInt();
            x[i] = z ;
        }
        System.out.println("the array : "+Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("After sorting the array : "+Arrays.toString(x));


    }
}
