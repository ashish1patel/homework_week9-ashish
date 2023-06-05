package homework9;

import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme10_Zone1Stations {

    public static void main(String[] args) {
        // Array to store station names and train lines
        String[] stations = {
                "Baker Street", "Bakerloo, Circle, Hammersmith & City, Jubilee, Metropolitan",
                "Oxford Circus", "Bakerloo, Central, Victoria",
                "Kings Cross St Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria",
                "Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City",
                "London Bridge", "Jubilee, Northern",
                "Victoria", "Circle, District, Victoria"
        };

        // Using Scanner - to enter a station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name: ");
        String searchStation = scanner.nextLine();
        //Closing the scanner
        scanner.close();

        // Search for the station - using for and if loop
        boolean found = false;
        for (int i = 0; i < stations.length; i += 2) {
            if (stations[i].equalsIgnoreCase(searchStation)) {
                System.out.println("Lines passing through " + searchStation + ": " + stations[i + 1]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No lines found for the station: " + searchStation);
        }
    }
}


