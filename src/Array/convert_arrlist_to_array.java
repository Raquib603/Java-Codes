package Array;
import java.util.ArrayList;
import java.util.List;

public class convert_arrlist_to_array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(5);
        list.add(10);
        list.add(15);

        // Convert ArrayList to Array
        Integer[] array = list.toArray(new Integer[0]);

        // Print the array
        for (Integer n : array) {
            System.out.println(n);
        }
    }
}
    

