package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main (String[] args){
        int x[] = {2, 8,12, 4, 16, 9, 22, 31, 1};

        //insertion sort
        for (int i =1; i<x.length; i++){
            int current = x[i];
            int j = i-1;
            while ((j>=0 && current<x[j])){
                x[j+1] = x[j];
                j--;
            }
            //placement
            x[j+1] = current;
        }
        System.out.println(Arrays.toString(x));





    }

}
