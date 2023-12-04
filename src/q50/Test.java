package q50;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer) animal).jump();
        ((Deer) animal).jump(5);
    }
}
