package List.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        
        timeStamp st1 = new timeStamp();
        ArrayList<Integer> nums = new ArrayList<>();

    // User input
    Scanner sc = new Scanner(System.in);
    System.out.println("hh - mm - ss");
    
    for(int i =0; i<=4; i++){
    String n = sc.nextLine();
    if (!n.isEmpty()) {
        String[] str = n.split(" ");
        for (String s : str) {
            try {
                nums.add(Integer.valueOf(s));
            } catch (NumberFormatException e) {
                System.out.println(s + " cannot be converted to Integer, skipping...");
            }
        }
    }
    
}
       st1.display(nums);

      System.out.println("\nEnter time lapse for delete\n");
      int x = sc.nextInt();
      System.out.println("After deleting the lapse - \n");
      Iterator itr = nums.iterator();
      while (itr.hasNext()){
          int z = (Integer) itr.next();
          if(z==x){
              itr.remove();
          }
      }

      st1.display(nums);
     }
 
  }
    

