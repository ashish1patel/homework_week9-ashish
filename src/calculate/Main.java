package calculate;

import java.util.Scanner;
//Create two class with name  “Main”
public class Main {

    public static void main(String[] args) {


        char choice = 'Y';

        while (choice == 'Y') {
            System.out.print("Enter the first number: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            System.out.print("Enter the symbol (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);

            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
            scanner.close();
        }
    }

}