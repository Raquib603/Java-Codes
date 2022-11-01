package Searching;

import java.util.Arrays;

public class linear_search {
    public static void main (String args[]){
        int x[] = {3, 5, 6, 9, 10, 13, 17, 19, 20, 55};
        System.out.println(" Size of the array is "+x.length);
        Arrays.sort(x);
        System.out.println("After the sort "+Arrays.toString(x) );
        int z = 0;
        for (int i = 0; i<=x.length-1; i++)
            if (x[i]==10)
                System.out.println("We found the number in array" + "\n And the location is at the "+(i+1)+"th");
        
        else System.out.println("Didnt find the value");

    }
}
