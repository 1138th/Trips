import Trip.TripParameters;
import WorkWithTrips.*;

import java.util.HashMap;

public class Main extends BuildTrip {

    public static void main(String[] args) {
        HashMap<Integer, TripParameters> tripsSet = new HashMap<Integer, TripParameters>();
        int tripIndex = 0;
        String answer;
        System.out.println("hello, we're starting to build trips set\n" +
                "would you like to build your set manually or enter number N and create set of N trips randomly?");
        answer = Answers.ChooseAnswer("manually", "randomly");
        if (answer.equals("manually")) {
            do {
                TripParameters trip = new TripParameters();
                ChoosingPatternString("type", TypePool(), trip);
                ChoosingPatternString("transport", TransportPool(), trip);
                ChoosingPatternString("food", FoodPool(), trip);
                ChoosingPatternInteger("number", trip);
                ChoosingPatternInteger("duration", trip);
                Print.PrintTrip(trip);
                tripsSet.put(tripIndex++, trip);
                System.out.println("would you like to build another trip? (y/n)");
                answer = Answers.ChooseAnswer("y", "n");
            } while (answer.equals("y"));
        } else {
            int tripsQuantity;
            System.out.println("you choose random, please, enter quantity of trips in set:");
            tripsQuantity = Answers.RandomTripsQuantity();
            GenerateRandomSet(tripsSet, tripsQuantity);
        }
        Print.PrintSet(tripsSet);
    }
}
