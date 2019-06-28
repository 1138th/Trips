import Trip.Trip;
import Trip.TripParameters;
import Trip.TripPools;
import WorkWithTrips.BuildTrip;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends BuildTrip {

    public static void main(String[] args) {
        Trip trip = new TripParameters();
        HashMap<Integer, TripParameters> trispMap = new HashMap<Integer, TripParameters>();
        System.out.println("hello, we're starting to build your trip");
        Scanner scan = new Scanner(System.in);
        do {
            ChoosingPatternString("type", TripPools.TypePool(), trip);
            ChoosingPatternString("transport", TripPools.TransportPool(), trip);
            ChoosingPatternString("food", TripPools.FoodPool(), trip);
            ChoosingPatternInteger("number", trip);
            ChoosingPatternInteger("duration", trip);
            PrintTrip(trip);
        } while (true);
    }
}
