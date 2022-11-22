package Array;

import java.util.Arrays;

public class combine { 
    public static void main(String args[]){
    int x [] ={1,2,3,4,5};
    int y [] ={6,7,8,9,10};

    int m, n;
    m = x.length;
    n = y.length;
     int z [] = new int[m+n];

     for(int i = 0; i<m; i++){
         z [i] = x[i];
     }

     for (int i = 0; i<n; i++){
         z[m+i] = y[i];

     }
    System.out.println(Arrays.toString(z));



}
    
}
