package q37;

import java.io.*;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var optional = Optional.of(List.of("O", "N")); //Optional<List<String>> type
        System.out.println(optional);
        System.out.println(optional.get());
        System.out.println(optional.get().get(0));
        try (
                var oos = new ObjectOutputStream(new FileOutputStream(("C:\\Users\\ahmed.elsayed\\Documents\\java\\data.ser")));
                var ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\data.ser"))
                ){
            oos.writeObject(optional); // Optional class doesn't implement Serializable interface, hence
            var object = (Optional<?>)ois.readObject();
            System.out.println(object.get());
        }
    }
}
