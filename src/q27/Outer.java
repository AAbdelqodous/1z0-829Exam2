package q27;

public class Outer {
    Outer(){
        System.out.print(2);
    }

    static {
        System.out.print(1);
    }

    class Inner{
        Inner(){
            System.out.print(4);
        }

        {
            System.out.print(3);
        }
    }
}
