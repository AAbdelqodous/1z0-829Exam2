package q34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        for(String dryFruit : dryFruits) {
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
                //If you want to successfully remove the items from ArrayList, while using Iterator or ListIterator,
                // then use Iterator.remove() or ListIterator.remove() metho
            }
        }

        System.out.println(dryFruits);
    }
}
