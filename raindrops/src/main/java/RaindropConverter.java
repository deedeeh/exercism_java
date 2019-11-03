class RaindropConverter {
    private static final String PLING = "Pling";
    private static final String PLANG = "Plang";
    private static final String PLONG = "Plong";

    String convert(int number) {
        if (number % 105 == 0) {
            return PLING + PLANG + PLONG;
        } else if (number % 15 == 0) {
            return PLING + PLANG;
        } else if (number % 21 == 0) {
            return PLING + PLONG;
        } else if (number % 35 == 0) {
            return PLANG + PLONG;
        } else if (number % 3 == 0) {
            return PLING;
        } else if (number % 5 == 0) {
            return PLANG;
        } else if (number % 7 == 0) {
            return PLONG;
        }
        return String.valueOf(number);
    }

}
