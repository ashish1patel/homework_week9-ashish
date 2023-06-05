package homework9;

import java.util.ArrayList;

public class Programme7_ArrayListEmptyOrNot {
    public void arrayListEmptyOrNot(){
        // Create a new ArrayList
        ArrayList< String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("White");
        list.add("Orange");
        System.out.println("Original array list" + list);
        System.out.println("Checking the above array list is empty or not - " +list.isEmpty());
        list.removeAll(list);
        System.out.println("Array list after remove all element " +list);
        System.out.println("Checking the above array list is empty or not!- " +list.isEmpty());

    }

    public static void main(String[] args) {
        Programme7_ArrayListEmptyOrNot obj = new Programme7_ArrayListEmptyOrNot();
        obj.arrayListEmptyOrNot();
    }
}
