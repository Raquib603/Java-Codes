package Lab_Practice_task_1;

import java.util.Arrays;

public class task_9 {
    public static void main(String args[]){
        int x [] = {1,2,3,4,5};

        int y [] = new int[x.length];

        for (int i = 0; i< x.length; i++){
            y[i] = x[x.length - i - 1];
        }
        System.out.println("The array - "+ Arrays.toString(x));

        for(int i =0; i< y.length; i++){
            System.out.println(y[i]);
        }
    }
}
