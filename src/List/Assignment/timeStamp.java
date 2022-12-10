package List.Assignment;

import java.util.ArrayList;

public class timeStamp {
    //print
    public void display(ArrayList<Integer> nums){
           
        for (int i = 0; i < nums.size(); i++) { 	    
                System.out.print(nums.get(i)+" : ");
               
                if((i+1)%3==0) System.out.print("\n");
                
        } 
     }   
}