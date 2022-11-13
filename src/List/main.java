package List;

import java.util.ArrayList;
import java.util.Scanner;

import List.methods;

public class main {
    public static void main (String args[]){
     ArrayList <Integer> x_list = new ArrayList<>();
     Scanner var = new Scanner (System.in);
     methods m1 = new methods();
     m1.display(x_list);
     System.out.println("Length "+m1.len(x_list));
     
     System.out.println("So in the first the array length is 0 as there is no element");

   

     System.out.println("Enter 5 element - ");
     for(int i = 0 ; i<=4; i++){ 
            int x = var.nextInt();
            x_list.add(x);
        } 

        System.out.println("After adding 5 elements "+x_list);

        System.out.println("Enter the finding value - ");
        int y = var.nextInt();

        if (m1.finding(x_list, y) == 1 )
        System.out.println("No, ITS NOT IN THERE");
        else System.out.println("yES ITS THERE");


        System.out.println("Now enter any item for delete -");
        int m = var.nextInt();
        m1.deleting(x_list, m);
        System.out.println("After deleting "+m+" from the list -"+x_list);

        
       
        m1.print_display(x_list);


    }
    
}
