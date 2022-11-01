package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class task_3_iterator {
    public static void main (String args[]){

        int x;
        ArrayList <Integer> m = new ArrayList<>();
        Scanner var = new Scanner(System.in);
        while (true){
            System.out.print("Enter the integer number - ");
            x = var.nextInt();

            if(x==-1){
                break;
            }
            m.add(x);
        }
        System.out.println("Users input was : ");
        System.out.println(m);

        System.out.println("\nAfter removing the odd numbers  - ");
        Iterator itr = m.iterator();
        while (itr.hasNext()){
            int z = (Integer) itr.next();
            if(z%2 != 0){
                itr.remove();
            }
        }

        /*  for (int i = 0; i< m.size(); i++ ) {
            if (m.get(i) % 2 != 0){
                m.remove(i);
            }
        }   */

        System.out.println(m);
        int sum = 0;
        for (int i = 0; i<m.size(); i++){
            sum += m.get(i);
        }
        System.out.println("Summetion of the array is : "+sum);

    }

}
