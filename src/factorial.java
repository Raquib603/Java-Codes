import java.util.Scanner;

public class factorial {
    static int fact(int y){
        int j = 1;
        for (int i = 1; i<=y; i++){
            j *= i;
        }
        return j;
    }
    public static void main (String args[]){
        System.out.print("Enter any number for its factorial : " );
        Scanner var = new Scanner(System.in);
        int x = var.nextInt();

        int z = fact(x);
        System.out.println("Factorial of "+x+" is : "+z);
    }
}
