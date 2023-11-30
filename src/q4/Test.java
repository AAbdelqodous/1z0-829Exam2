package q4;

public class Test {
    public static void main(String[] args) {
        int i = 0;
        String res = null;
        for (String[] s = {"A", "B", "C", "D"} ; ; res = String.join(".", s)) {
//            System.out.println(res);
            if( i++ == 0)
                continue; //statement takes the control to [ForUpdate] expression.
            else
                break;
        }
        System.out.println(res);
    }
}
