package git_link_list;



public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> x = new java.util.LinkedList<Integer>();
 


        methods m1 = new methods(x);
        x.add(4);
        x.add(50);


        m1.addAtHead(1);
        
        m1.printList();

        
      }
    
}
