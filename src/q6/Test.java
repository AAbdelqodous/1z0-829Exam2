package q6;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        /* for(var i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        } */

        /* Stream.iterate("*", s -> s += "*").limit(5)
                .forEach(System.out::println); */

        /* Stream.iterate("*", s -> s.length() <= 5, s -> s += "*")
                .forEach(System.out::println); */

        IntStream.range(1, 6)
                .mapToObj(i -> "*".repeat(i)) //.map(i -> "*".repeat(i))
                .forEach(System.out::println);
    }
}
