package List;

import java.util.ArrayList;
import java.util.Iterator;

public class methods {

    
    
    public static void display(ArrayList<Integer> x_list){
        System.out.println(x_list);
    }


    public static int len (ArrayList<Integer> x_list){
        Iterator itr = x_list.iterator();
        int x = 0;
        for (int i = 1; i<x_list.size(); i++){
           x++ ;
        }
       return x;
    }


    public static int finding (ArrayList<Integer>x_list, int x){
        int z = 1;
      for(int i = 0; i< x_list.size(); i++){
        if(x_list.get(i) == x)
        z = 2;
        
         } 

         return z;
        }

        public static ArrayList<Integer> deleting(ArrayList<Integer>x_list, int x){
            Iterator itr = x_list.iterator(); 
            while(itr.hasNext()){
                int z = (Integer) itr.next();
                if(z==x){
                    itr.remove();
                }
            }
    
             return x_list;
            }




            public static void print_display(ArrayList<Integer>x_list){
                System.out.println("Without print function - ");
                for (int x : x_list){
                    System.out.println(x);
                }

            }
    
    
    
    }
        

    

