package WorkWithTrips;

import Trip.*;

import java.util.HashMap;

public class Print extends TripParameters {

    public static void PrintTrip(Trip trip) {
        System.out.println("your trip created: ");
        System.out.println("\ttrip type: " + trip.getType());
        System.out.println("\ttransport: " + trip.getTransport());
        System.out.println("\tfood: " + trip.getFood());
        System.out.println("\tnumber of persons: " + trip.getNumber());
        System.out.println("\ttrip duration: " + trip.getDuration());
    }

    public static void PrintSet(HashMap<Integer, TripParameters> tripSet) {
        System.out.println("your set created: ");
        for (HashMap.Entry<Integer, TripParameters> item : tripSet.entrySet()) {
            System.out.println("trip number: " + (item.getKey() + 1));
            System.out.println("\ttrip type: " + item.getValue().getType());
            System.out.println("\ttransport: " + item.getValue().getTransport());
            System.out.println("\tfood: " + item.getValue().getFood());
            System.out.println("\tnumber of persons: " + item.getValue().getNumber());
            System.out.println("\ttrip duration: " + item.getValue().getDuration());
        }
    }
}
