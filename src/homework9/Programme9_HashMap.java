package homework9;

import java.util.HashMap;

/**
 *  Create a HashMap object called people that will store String keys and
 *  Integer values: And use for each loop to iterate the value from Map.
 */
public class Programme9_HashMap {
    public static void main(String[] args) {

        // Create a HashMap object called People

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values to people

        people.put("Prime", 9);
        people.put("Java Finish", 3);
        people.put("Automation Testing", 12);
        people.put("August", 29);
        System.out.println(people);

        for (Integer i : people.values())
            System.out.println(i);

    }

}

