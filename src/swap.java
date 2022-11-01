public class swap {
    public static void main (String args[]){
        //swapping
        int x = 4;
        int y = 5;
        System.out.println("Before swapping x was : "+x+" ||  y was : "+y);

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping x is : "+x+" || y is "+ y);
    }
}
