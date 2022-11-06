package Method;

public class person {

    String name = "Raquib";
    int age = 30;
    int id = 40;

    void display(){
        System.out.println("His name is "+name);
        System.out.println("Age "+age);
        System.out.println("Id "+id);
    
    }

    int multiplier(int x, int y){
        System.out.println("After multiplying the x and y : "+(x*y));
        return 1;
    }
    
}
