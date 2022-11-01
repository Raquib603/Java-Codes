package Array;

import java.util.Arrays;

public class reverse_array1 {
    public static void main (String args[]){
        int x[] = {1,2,3,4,5};

        int z[] = new int[x.length];

        for (int i = 0; i< z.length; i++){
            z [i] = x[x.length - i - 1];


        }
        System.out.println("The array - "+ Arrays.toString(x));
        System.out.println("The reverse array "+Arrays.toString(z));



    }
}
