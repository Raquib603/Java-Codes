package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class reverse_array2 {
    public static void main(String args[]){
        ArrayList<Integer> m = new ArrayList<>();
        int i = 0;
        Scanner var = new Scanner(System.in);
        while (i<5){
            System.out.print("Enter the number - ");
            int x = var.nextInt();
            m.add(x);
            i++;


        }
        System.out.println("Before reversion "+m);
        //Reverse by builtin

        Collections.reverse(m);
        System.out.println("After reversion "+m);


    }
}
