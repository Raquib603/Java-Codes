package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main (String args[]){
        int x[] = {2, 1, 0};


        //selection sort
        for (int i =0; i<x.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<x.length; j++){
                if (x[smallest]>x[j]){
                    smallest = j;
                }
            }
            int temp = x[smallest];
            x[smallest] = x[i];
            x[i] = temp;
        }
        System.out.println(Arrays.toString(x));






    }
}
