package q42;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(0);
        list.remove( list.indexOf(0));
        // list.indexOf(0) returns 2 (index at which 0 is stored in the list).
        // So list.remove(list.indexOf(0)); is converted to list.remove(2);
        // list.remove(2) removes the element at index 2, which is 0.
        System.out.println(list);
    }
}
