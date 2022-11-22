package Array;

import java.util.Arrays;

public class remove_duplicate_merge {
    public static int removeDuplicateItem(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
    
    public static void main(String args[]){
        int x [] ={10, 1, 5, 6, 10, 14, 20, 25, 31, 38, 40 };
        int y [] ={ 12, 2, 4, 7, 9, 16, 19, 23, 24, 32, 35, 36, 42 };
    
        int m, n;
        m = x.length;
        n = y.length;
        //merge
         int z [] = new int[m+n];
    
         for(int i = 0; i<m; i++){
             z [i] = x[i];
         }
    
         for (int i = 0; i<n; i++){
             z[m+i] = y[i];
    
         }
         Arrays.sort(z);

        //remove duplicate items
        int length = z.length;
        length = removeDuplicateItem(z, length);

        for (int i=0; i<length; i++)  {
        System.out.print(z[i]+" ");  
        }
        
    
    
    
    }
    
}
