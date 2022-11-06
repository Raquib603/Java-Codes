package Method;
public class test{



    public static int add(int x, int y){
        int z = x+y;
        return z;
    }


    public static void main (String arg[]){
        
        
        //Inner class method  == For that we have to make that method static because you are accessing from a static class 
        int a = add(2, 3);
        System.out.println("Addition is "+a);
        
        
        //method from other class == For that we have to create class object to access that method 
        person p1 = new person();
        p1.display();

        
        //method from other class 
        int x = 4;
        int y = 5;

        p1.multiplier(x, y);
      
    }
    
}
