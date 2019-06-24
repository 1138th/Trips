package Trip;

class TripPools extends Trip {

    String[] TypePool(){
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

    String[] TransportPool(){
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

    String[] FoodPool(){
        String[] pool = new String[111];
        int i = 0;
        pool[i++] = "full";
        pool[i++] =
        return pool;
    }

    String[] PurposePool(){
        String[] pool = new String[111];
        int i = 0;

        return pool;
    }

    int[] NumberPool(){
        int[] pool = new int[111];
        int i = 0;

        return pool;
    }

    int[] DurationPool(){
        int[] pool = new int[111];
        int i = 0;

        return pool;
    }
}
