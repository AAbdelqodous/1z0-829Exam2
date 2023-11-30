package q17;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B", "..", ".", "..").normalize();
        System.out.println(path.getNameCount()); //Users, ahmed.elsayed, Documents, java
        System.out.println(path.getName(0)); //Users,
        System.out.println(path.getName(0).toString().length());
//        System.out.println(path.getNameCount() + ":" + path.getName(0).toString().length());
    }
}
