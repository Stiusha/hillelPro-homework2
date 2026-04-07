public class Main {

    private static final double MILES_TO_KM_COEFFICIENT = 1.609;
    private static final double KM_TO_MILES_COEFFICIENT = 1/MILES_TO_KM_COEFFICIENT;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");

        double miles = 10;
        double kmFromMiles = convertMilesToKm(miles);
        double milesFromKm = convertKmsToMiles(kmFromMiles);

        System.out.printf("%.2f miles is %.2f km\n", miles, kmFromMiles);
        System.out.printf("%.2f km is %.2f miles\n", kmFromMiles, milesFromKm);
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM_COEFFICIENT;
    }
    private static double convertKmsToMiles(double km) {
        return km * KM_TO_MILES_COEFFICIENT;
    }
}