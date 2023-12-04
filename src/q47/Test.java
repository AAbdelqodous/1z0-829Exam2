package q47;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        System.out.println(Duration.ofDays(-2));
        System.out.println(Duration.ofHours(-2));
        System.out.println(Duration.ofMinutes(100));
        System.out.println(Duration.ofSeconds(90));
        System.out.println(Duration.ofMillis(3600000)); // 60 * 60 * 1000
        System.out.println(Duration.ofNanos(3600000000000L)); // 60 * 60 * 1000 * 1000 * 1000
    }
}
