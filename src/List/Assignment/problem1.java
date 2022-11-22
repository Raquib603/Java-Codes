package List.Assignment;

import java.util.Arrays;

public class problem1 {
    public static void sortedMerge(int a[], int b[], int res[], int n, int m){
        // Sorting a[] and b[]
        Arrays.sort(a);
        Arrays.sort(b);
      
        // Merge two sorted arrays into res[]
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i += 1;
                k += 1;
            } else {
                res[k] = b[j];
                j += 1;
                k += 1;
            }
        }   
         
        while (i < n) {       // Merging remaining   // elements of a[] (if any)
            res[k] = a[i];
            i += 1;
            k += 1;
        }   
        while (j < m) {       // Merging remaining  elements of b[] (if any)
            res[k] = b[j];
            j += 1;
            k += 1;
        }
    }
    public static void main(String[] args) {
        
            int a[] = {10, 1, 5, 6, 10, 14, 20, 25, 31, 38, 40 };
            int b[] = { 12, 2, 4, 7, 9, 16, 19, 23, 24, 32, 35, 36, 42 };
            int n = a.length;
            int m = b.length;
          
            // Final merge list
            int res[] = new int[n + m];
            sortedMerge(a, b, res, n, m);
          
            System.out.print( "Sorted merged list :");
            for (int i = 0; i < n + m; i++)
                System.out.print(" " + res[i]);  
    }
    
}
