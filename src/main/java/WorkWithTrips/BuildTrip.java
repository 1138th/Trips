package WorkWithTrips;

import Exceptions.TripParameterException;
import Trip.TripParameters;
import Trip.TripPools;

import java.util.Scanner;

public class BuildTrip extends TripPools {

    Scanner scan = new Scanner(System.in);

    private String ChoosingParameter(String parameter){
        while (true){
            try {
                TripParameters.Type(parameter);
                System.out.println("trip type choosed");

            } catch (TripParameterException e){

            }
        }
    }

    public void BuildTrip(){
        Scanner scan = new Scanner(System.in);
        int parameter2;
        String paremeter;
        System.out.println("hello, we're starting to build your trip\n" +
                "choose trip type from one of showed below");
        for (String item : TripPools.TypePool()){
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
