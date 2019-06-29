package WorkWithTrips;

import Trip.TripParameters;

import java.util.HashMap;
import java.util.Scanner;

public class SortTrip {

    private static Scanner scan = new Scanner(System.in);

    public static String SortParameter() {
        String answer = "";
        String[] poolOfParameters = {"type", "transport", "food", "number", "duration"};
        System.out.println("enter parameter by which set will be sorted:");
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
        char[] str1 = string1.toCharArray();
        char[] str2 = string2.toCharArray();
        for (int i = 0; i < Math.min(str1.length, str2.length); i++) {
            if (str1[i] < str2[i]) return true;
            else if (str1[i] > str2[i]) return false;
        }
        return false;
    }

    public static void Sort(HashMap<Integer, TripParameters> tripSet, String sortParameter) {
        HashMap<Integer, TripParameters> tempStore = new HashMap<>();
        for (int i = 0; i < tripSet.size(); i++) {
            for (int j = i; j < tripSet.size(); j++) {
                switch (sortParameter) {
                    case "type": {
                        if (CompareStrings(tripSet.get(j).getType(), tripSet.get(i).getType())) {
                            tempStore.put(0, tripSet.get(j));
                            tripSet.put(j, tripSet.get(i));
                            tripSet.put(i, tempStore.get(0));
                        }
                        break;
                    }
                    case "transport": {
                        if (CompareStrings(tripSet.get(j).getTransport(), tripSet.get(i).getTransport())) {
                            tempStore.put(0, tripSet.get(j));
                            tripSet.put(j, tripSet.get(i));
                            tripSet.put(i, tempStore.get(0));
                        }
                        break;
                    }
                    case "food": {
                        if (CompareStrings(tripSet.get(j).getFood(), tripSet.get(i).getFood())) {
                            tempStore.put(0, tripSet.get(j));
                            tripSet.put(j, tripSet.get(i));
                            tripSet.put(i, tempStore.get(0));
                        }
                        break;
                    }
                    case "number": {
                        if (tripSet.get(j).getNumber() < tripSet.get(i).getNumber()) {
                            tempStore.put(0, tripSet.get(j));
                            tripSet.put(j, tripSet.get(i));
                            tripSet.put(i, tempStore.get(0));
                        }
                        break;
                    }
                    case "duration": {
                        if (tripSet.get(j).getDuration() < tripSet.get(i).getDuration()) {
                            tempStore.put(0, tripSet.get(j));
                            tripSet.put(j, tripSet.get(i));
                            tripSet.put(i, tempStore.get(0));
                        }
                        break;
                    }
                }
            }
        }
    }
}
