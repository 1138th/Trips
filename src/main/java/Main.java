import Trip.Trip;
import Trip.TripParameters;
import Trip.TripPools;
import WorkWithTrips.BuildTrip;

public class Main extends BuildTrip {

    public static void main(String[] args) {
        Trip trip = new TripParameters();
        System.out.println("hello, we're starting to build your trip");
        BuildTrip.ChoosingPatternString("type", TripPools.TypePool(), trip);
        BuildTrip.ChoosingPatternString("transport", TripPools.TransportPool(), trip);
        BuildTrip.ChoosingPatternString("food", TripPools.FoodPool(), trip);
        BuildTrip.ChoosingPatternInteger("number", trip);
        BuildTrip.ChoosingPatternInteger("duration", trip);
        System.out.println(trip.getType());
    }
}
