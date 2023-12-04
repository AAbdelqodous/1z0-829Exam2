package q41;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        var dir = new File("F:" + File.separator + "A" + File.separator + "B");
        System.out.println(dir); // abstract path 'F:\A\B'.
        System.out.println(dir.getParentFile().getParent());
        // dir.getParentFile() => returns a File object for abstract path 'F:\A'
        // dir.getParentFile().getParent() => returns a String object referring to 'F:\'
        // Please note, for above code to work,
        // it is not needed that given drive and directories should exist.
    }
}
