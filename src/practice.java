import java.util.*;

public class practice {
    public static void main (String args[]){
        Scanner var = new Scanner(System.in);
        ArrayList <Integer> m = new ArrayList<>();

        while (true) {
            System.out.print("Enter the integer - ");
            int x = var.nextInt();

            if (x == -1){
                break;
            }
            m.add(x);

        }
        System.out.println("The array - "+m);


        Iterator itr = m.iterator();

        while(itr.hasNext()){
            int z = (Integer) itr.next();
            if(z%2 != 0){
                itr.remove();
            }
        }
        System.out.print("After removing the odd numbers - "+ m);
        Collections.reverse(m);
        System.out.println("\nAfter reverse ");
        System.out.println(m);


    }
}
