package Lab_Practice_task_1;

import java.util.Arrays;

public class task_8 {
    public static void main(String args[]){
        int x[] ={2, 3, 4, 5};
        int y[] ={6, 7, 8, 9};
        int m, n;

        m = x.length;
        n = y.length;

        int z [] = new int[m+n];

        //adding x into z
        for( int i =0; i<m; i++){
            z[i] = x[i];
        }



       //adding y into z                                  [2, 3, 4, 5, ]
        for(int i = 0; i<n; i++){
            z[m+i] =y[i];
        }

        Arrays.sort(z);

        System.out.println(Arrays.toString(z));



    }
}
