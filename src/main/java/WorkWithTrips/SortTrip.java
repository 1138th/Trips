package WorkWithTrips;

import Trip.TripParameters;

import java.util.HashMap;
import java.util.Scanner;

public class SortTrip {

    private static Scanner scan = new Scanner(System.in);

    public static String SortParameter() {
        String answer = "";
        String[] poolOfParameters = {"type", "transport", "food", "number", "duration"};
        System.out.println("enter parameter by which set will sort:");
        boolean register = true;
        while (register) {
            for (int i = 0; i < poolOfParameters.length; i++) {
                if (i < (poolOfParameters.length - 1))
                    System.out.print(poolOfParameters[i] + ", ");
                else System.out.println(poolOfParameters[i]);
            }
            answer = scan.nextLine();
            for (String item : poolOfParameters) {
                if (answer.equals(item)) register = false;
            }
            if (register)
                System.out.println("please enter parameter correctly:");
        }
        return answer;
    }

    private static boolean CompareStrings(String string1, String string2) {

        return false;
    }

    public static void Sort(HashMap<Integer, TripParameters> tripSet, String sortParameter) {
        for (int i = 0; i < tripSet.size(); i++) {
            for (int j = i; j < tripSet.size(); j++) {
                //switch ()
            }
        }
    }
}
