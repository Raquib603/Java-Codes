import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class class_test {
    public static void main (String args[]){
        ArrayList<Double> m = new ArrayList<>();
        Scanner var = new Scanner(System.in);
        int i = 0;

        while(i<6){
            System.out.print("Enter the "+i+"th element - ");
            double x = var.nextDouble();
            m.add(x);
            i++;

        }

        System.out.println("Inputted array - "+ m);
        Collections.reverse(m);
        System.out.println("\n After reverse the array - "+m);


    }
}
