package homework9;
//Write a Java program to retrieve an element (at a specified index) from a given
//array list
import java.util.ArrayList;
import java.util.List;

public class Programme6_Retrieve_ArrayList {
    public static void retrieveArrayList(){
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("White");
        list.add("Orange");
        System.out.println(list);
      String element = list.get(3);
        System.out.println("First element: " +element);


    }
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // int a = scanner.nextInt();
        retrieveArrayList();

    }
}
