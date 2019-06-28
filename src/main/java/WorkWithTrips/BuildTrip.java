package WorkWithTrips;

import Exceptions.TripNumberParameterException;
import Exceptions.TripParameterException;
import Trip.Trip;
import Trip.TripParameters;
import Trip.TripPools;

import java.util.Scanner;

public class BuildTrip extends TripPools {

    private static Scanner scan = new Scanner(System.in);

    public static void ChoosingDestination(Trip trip){
        String parameter;
        System.out.println("select your trip destination:");

    }

    public static void ChoosingPatternString(String parameterType, String[] pool, Trip trip){
        String parameter;
        System.out.println("select trip " + parameterType + " from one of the following:");
        while (true){
            for (int i = 0; i < pool.length; i++){
                if (i < pool.length - 1)
                    System.out.print(pool[i] + ", ");
                else System.out.print(pool[i]);
            }
            System.out.println();
            parameter = scan.nextLine();
            try {
                switch (parameterType){
                    case "type": {
                        TripParameters.Type(parameter, trip);
                        break;
                    }
                    case "transport": {
                        TripParameters.Transport(parameter, trip);
                        break;
                    }
                    case "food": {
                        TripParameters.Food(parameter, trip);
                        break;
                    }
                }
                System.out.println("trip " + parameterType + " selected");
                break;
            } catch (TripParameterException e){
                System.out.println("please enter correct " + parameterType + " like one of the following:");
            }
        }
    }

    public static void ChoosingPatternInteger(String parameterType, Trip trip){
        int parameter;
        System.out.println("select trip " + parameterType + " with next condition:");
        while (true){
            System.out.print("trip " + parameterType + " must be positive integer and ");
            if (parameterType.equals("number"))
                System.out.println("contain less than 16 persons");
            else System.out.println("contain less than 2 month (61 days)");
            try {
                parameter = Integer.parseInt(scan.nextLine());
            } catch (TripNumberParameterException e){
                System.out.println("please enter integer");
                continue;
            }
            try {
                switch (parameterType){
                    case "number": {
                        TripParameters.Number(parameter, trip);
                        break;
                    }
                    case "duration": {
                        TripParameters.Duration(parameter, trip);
                        break;
                    }
                }
                System.out.println("trip " + parameterType + " selected");
                break;
            } catch (TripNumberParameterException e){
                System.out.println("please enter correct " + parameterType);
            }
        }
    }
}
