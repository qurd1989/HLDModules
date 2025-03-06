package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorNext {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Get the iterator

        for (String s : list) {
            
            System.out.println(s);
        }
//        // Print the first element
//        System.out.println(iterator.next());
//
//        // Print the second element
//        System.out.println(iterator.next());
//
//        // Print the third element
//        System.out.println(iterator.next());
//
//        // Print the fourth element
//        System.out.println(iterator.next());
    }
}
