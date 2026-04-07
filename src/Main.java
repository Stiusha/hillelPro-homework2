public class Main {

    private static final double MILES_TO_KM_COEFFICIENT = 1.609;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");

        double miles = 10;
        double kmFromMiles = convertMilesToKm(miles);

        System.out.printf("%.2f miles is %.2f KM\n", miles, kmFromMiles);
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM_COEFFICIENT;
    }
}