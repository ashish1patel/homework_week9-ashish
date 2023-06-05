package homework9;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_ArrayList {
    public void colours() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("Black");
        list.add("White");
        list.add("Yellow");
        System.out.println("Colour is in a collection: ");
        for (String colour : list) {

            System.out.println(colour);
        }
    }
    public static void main(String[] args) {
        Programme4_ArrayList obj = new Programme4_ArrayList();
        obj.colours();
    }

}
