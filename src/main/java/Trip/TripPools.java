package Trip;

public class TripPools extends Trip {

    static String[] TypePool(){
        String[] pool = new String[8];
        int i = 0;
        pool[i++] = "vacation";
        pool[i++] = "excursion:";
        pool[i++] = "shopping";
        pool[i++] = "cruise";
        pool[i++] = "therapy";
        pool[i++] = "business";
        pool[i++] = "school";
        pool[i] = "autotour";
        return pool;
    }

    static String[] TransportPool(){
        String[] pool = new String[7];
        int i = 0;
        pool[i++] = "air";
        pool[i++] = "water";
        pool[i++] = "railway";
        pool[i++] = "bus";
        pool[i++] = "vehicle";
        pool[i++] = "rented";
        pool[i] = "other";
        return pool;
    }

    static String[] FoodPool(){
        String[] pool = new String[7];
        int i = 0;
        pool[i++] = "breakfast";
        pool[i++] = "lunch";
        pool[i++] = "dinner";
        pool[i++] = "breakfast-lunch";
        pool[i++] = "breakfast-dinner";
        pool[i++] = "lunch-dinner";
        pool[i] = "full";
        return pool;
    }
}
