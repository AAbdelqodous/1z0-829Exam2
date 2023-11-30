package q13;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Arrays.asList(null,null,null));
//        System.out.println(set); //NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
        long count = set.stream().count();
        System.out.println(count);
    }
}
