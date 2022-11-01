package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main (String args[]){
        int x[] = {2, 8,12, 4, 16, 9, 22, 31, 1};


        //bubble sort
        int i, j;
        for (i =0; i< x.length-1; i++){
            for (j=0; j< x.length-i-1; j++){

                if(x[j]>x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));



    }
}
