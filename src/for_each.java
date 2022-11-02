import java.util.Arrays;

public class for_each {

    //when you want to loop through all the values in an array or list
    //Remember that the foreach loop cannot modify the array elements

    public static void main (String args[]){
        int x[] = {4,12,8,2,18};
        for (int y =0; y<x.length; y++){
            x[y] = x[y]+1 ;
        }

        System.out.println(Arrays.toString(x));
        System.out.println("Modified");
        System.out.println("Modified again to check");
        
    }

}

