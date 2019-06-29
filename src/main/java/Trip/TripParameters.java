package Trip;

import Exceptions.*;

public class TripParameters extends TripPools {

    private static boolean AccessingParameter(String parameter, String[] parametersPool) {
        for (String parameterItem : parametersPool) {
            if (parameter.equals(parameterItem)) {
                return true;
            }
        }
        return false;
    }

    public static void Type(String tripType, Trip trip) {
        if (AccessingParameter(tripType, TripPools.TypePool())) {
            trip.setType(tripType);
        } else {
            throw new TripParameterException();
        }
    }

    public static void Transport(String tripTransport, Trip trip) {
        if (AccessingParameter(tripTransport, TripPools.TransportPool())) {
            trip.setTransport(tripTransport);
        } else {
            throw new TripParameterException();
        }
    }

    public static void Food(String tripFood, Trip trip) {
        if (AccessingParameter(tripFood, TripPools.FoodPool())) {
            trip.setFood(tripFood);
        } else {
            throw new TripParameterException();
        }
    }

    public static void Number(int tripNumber, Trip trip) {
        if (tripNumber <= 0) {
            System.out.println("number of travellers must be larger than zero");
            throw new TripNumberParameterException();
        } else if (tripNumber > 15) {
            System.out.println("number of travellers must be less than 16");
            throw new TripNumberParameterException();
        } else {
            trip.setNumber(tripNumber);
        }
    }

    public static void Duration(int tripDuration, Trip trip) {
        if (tripDuration <= 0) {
            System.out.println("duration of trip must be larger than zero days");
            throw new TripNumberParameterException();
        } else if (tripDuration > 61) {
            System.out.println("duration if trip must be less than 2 month");
            throw new TripNumberParameterException();
        } else {
            trip.setDuration(tripDuration);
        }
    }
}
