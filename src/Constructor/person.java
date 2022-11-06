package Constructor;

public class person {
    String name; //in class thats why global variable
    int age;
    int id;

    person(String name, int id){
        this.name = name; //in method thats why instance variable 
        this.id = id;

        System.out.println("His name is - "+name+"\nID -"+id);
    }

    person(String name, int age, int id){
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("His name is - "+name+"\nAge - "+age+"\nID -"+id);
    }


    
}
