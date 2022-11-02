package array_constructor;

public class Student {
    private String name;
    private int age;
    private String subs[];
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSubs(String[] subs) {
        this.subs = subs;
    }
    public void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Age :"+this.age);
        System.out.print("Subjects: ");
        for(int i = 0; i < subs.length; i++) {
            System.out.print(subs[i]+" ");
        }
    }
}
