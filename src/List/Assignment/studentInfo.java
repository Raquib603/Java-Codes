package List.Assignment;

public class studentInfo {
    
    double CGPA;
    String name;
    int ID;
   
    


    studentInfo(int ID,String name, double CGPA){
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    studentInfo(){
        //default constructor
    }


     

    
public void display(){
    System.out.println(ID+"\t"+name+"\t"+CGPA);
}

}
