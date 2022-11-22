package List.Assignment;

import java.util.Scanner;


public class problem2 {
    public static void main(String[] args) {

        int ids[] = {15234,13732,13569,15467,16285};
        String name[] ={"Jon","Tyrion","Sandor","Ramsey","Arya"};
        double cgpa[] ={2.6,3.9,1.2,3.1,3.1};

        studentInfo s1 = new studentInfo(15234,"Jon", 2.6);
        studentInfo s2 = new studentInfo(13732,"Tyrion",  3.9);
        studentInfo s3 = new studentInfo(13569,"Sandor", 1.2);
        studentInfo s4 = new studentInfo(15467,"Ramsey", 3.1);
        studentInfo s5 = new studentInfo(16285,"Arya",  3.1);

        studentInfo s6 = new studentInfo();


        System.out.println("ID\tNAME\tCGPA");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();



        //delete
        int x;
        Scanner var = new Scanner(System.in);
        System.out.print("Enter id for delete - ");
        x = var.nextInt();
        
        
            if(x==15234|| x==13732 || x==13569 || x==15467 || x==16285){
                System.out.println("\nAfter deleting "+x+" id, new info list - \nName\tID\tCGPA");
                for (int i = 0; i<=4; i++){
                if (ids[i]!=x){
                System.out.println(ids[i]+"\t"+name[i]+"\t"+cgpa[i]);
            }
            
        }
        
    } else System.out.println("\nItem is not on the list for delete");

    
    
    
    //search
    System.out.print("\nEnter any id for search - ");
    int s = var.nextInt();

    switch (s){
        
        case 15234 : System.out.println("Item is found");
        s1.display(); break;
        case 13732 : System.out.println("Item is found");
        s2.display(); break;
        case 13569 : System.out.println("Item is found");
        s3.display(); break;
        case 15467 : System.out.println("Item is found");
        s4.display(); break;
        case 16285 : System.out.println("Item is found");
        s5.display(); break;
        default: System.out.println("\nItem is not on that list");
    }
 

        
       
       
        
    }
    
}
