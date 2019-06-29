package WorkWithTrips;

import Exceptions.TripNumberParameterException;

import java.util.Scanner;

public class Answers {

    private static Scanner scan = new Scanner(System.in);

    public static String ChooseAnswer(String answer1, String answer2) {
        String answer;
        answer = scan.nextLine();
        while (!(answer.equals(answer1) || answer.equals(answer2))) {
            System.out.println("please enter correct command (" + answer1 + "/" + answer2 + ")");
            answer = scan.nextLine();
        }
        return answer;
    }

    public static int RandomTripsQuantity() {
        int tripsQuantity;
        String answer;
        while (true) {
            answer = scan.nextLine();
            try {
                tripsQuantity = Integer.parseInt(answer);
                if (tripsQuantity <= 0) {
                    System.out.println("quantity cannot be negative");
                } else break;
            } catch (TripNumberParameterException e) {
                System.out.println("please, enter number");
            }
        }
        return tripsQuantity;
    }
}
