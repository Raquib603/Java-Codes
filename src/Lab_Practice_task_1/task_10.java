package Lab_Practice_task_1;

import java.util.Arrays;

public class task_10 {
    public static void main(String args[]){
        int x[][] = {{1,2,3,4},{5,6,7,8}};
        int y[][] = {{11,12,13,14}, {15,16,17,18}};
        int z[][] = new int[x.length][y.length];

        for (int i = 0; i<x.length; i++){
            for(int j = 0; j<x.length; j++){
                z[i][j] = x[i][j]+y[i][j];

            }
        }

        System.out.println("After addtion : ");

        for(int i = 0; i<z.length; i++){
            for (int j = 0; j<z.length; j++){
                System.out.println("\t"+z[i][j]);
            }
            System.out.println("\n");

        }




    }
}
