package Trip;

public class TripParameters extends TripPools {

    private static Trip trip;

    public static void Type(String tripType){
        String[] typePool = new TripPools().TypePool();
        for (String typeItem : typePool) {
            if (tripType.equals(typeItem)) {
                trip.setType(typeItem);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

}
