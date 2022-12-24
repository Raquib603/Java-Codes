package Recursion;

public class addition_series {
    // Recursive program to find the
// value of the given series
static float sumOfSeries(int i, int n, float s){
     
    // Base case
    if (i > n)
        return s;
 
    // Recursive case
    else{
         
        // If we are currently looking
        // at the even number
        if (i % 2 == 0)
            s -= (float)1 / i;
 
        // If we are currently looking
        // at the odd number
        else
            s += (float)1 / i;
             
        return sumOfSeries(i + 1, n, s);
    }
}
 
// Driver code
public static void main(String[] args){
    float sum = sumOfSeries(1, 3, 0);
     
    System.out.printf("%f", sum);
    }
}
