package homework9;
//Write a Java program to iterate through all elements in an array list using
//Iterater.
import java.util.ArrayList;
import java.util.List;

public class Programme5_Iterate_ArrayList {

    public void iterateArrayList(){
        List<String> list = new ArrayList<>();
        list.add("Black");
        list.add("White");
        list.add("Red");
        list.add("Yellow");
        list.add("Orange");
        list.add("Green");
        for (String element : list) {
            System.out.println(element);

        }
    }

    public static void main(String[] args) {
        Programme5_Iterate_ArrayList obj =new Programme5_Iterate_ArrayList();
        obj.iterateArrayList();
    }
}
