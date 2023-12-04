package q50;

public class Deer extends Animal{
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
        // Overriding method may or may not throw any RuntimeException.
        // if overridden method throws any unchecked exception or Error,
        // then overriding method must not throw any checked exceptions.
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}
