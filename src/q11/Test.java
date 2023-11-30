package q11;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        var list = new ArrayList<String>(List.of("T", "O", "A", "S", "L", "M")); //Line n1
//        list.add("x");
//        System.out.println(list);
        list.sort((var x1, var x2) -> -2 * x1.compareTo(x2)); //Line n2
        //use the compareTo method of String class, inside our Comparator,
        // then Strings will be sorted in ascending order,
        //as we are multiplying the result of comareTo method with -2
        // the given comparator (at Line n2) would sort the Strings in descending order
        list.forEach(System.out::print);
    }
}
