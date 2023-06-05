package homework9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme8_HashSet {
    public static void main(String[] args) {


        // Create a new HashSet Objects
        HashSet<Integer> nubSet = new HashSet<>();
        // Add value 4, 7, and 8
        nubSet.add(4);
        nubSet.add(7);
        nubSet.add(8);
        // Use for-loop and if-else to print
        System.out.println("Numbers present in the set:");
        for (int i = 1; i <= 10; i++) {
            if (nubSet.contains(i)) {
                System.out.println(i + " is in a set.");
            } else {
                System.out.println(i+ " is not in a set.");
            }
        }
    }
}