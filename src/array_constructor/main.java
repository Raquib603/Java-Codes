package array_constructor;

public class main {
    public static void main(String args[]) {
        String subs[] = {"Mathematics", "English", "Science", "Social"};
        Student obj = new Student();
        obj.setName("Krishna");
        obj.setAge(25);
        obj.setSubs(subs);
        obj.display();
    }
}

