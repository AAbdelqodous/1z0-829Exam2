package q49;

public class Test {
    public static void main(String[] args) {
        String str = " "; //single space
        boolean b1 = str.isEmpty(); // returns true if and only if length() is 0.
        boolean b2 = str.isBlank(); // returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println(b1 + " : " + b2); //Line n1

        str.strip(); //Line n2 //returns a string whose value is this string, with all leading and trailing white space removed
        //  `str.strip();` returns an empty string "". As String is immutable, hence a new String object is created and 'str' still refers to " ".
        b1 = str.isEmpty();
        b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n3 // As, there is no change in 'str', Line n3 also prints false : true on to the console.
    }
}
