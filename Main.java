import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Distance Converter");

        System.out.print("What is the distance, in feet? ");

        Scanner sc = new Scanner(System.in);
        double dist = sc.nextDouble();

        System.out.print("What is the destination measurement? m, km, or mi? ");

        sc = new Scanner(System.in);
        String to = sc.nextLine();

        System.out.printf("The distance is %f %s.",convert(to,dist),to);
    }

    /**
     * Convert a distance in feet to the desired measurement
     * @param to String, the unit of measurement to convert to
     * @param dist double, the distance to convert from, in feet
     * @return double, the converted distance
     */
    public static double convert(String to, double dist) {
        double conversion;

        switch (to) {
            case "m":
                conversion = dist / 3.2808;
                break;
            case "km":
                conversion = dist / 3.2808 / 1000.0;
                break;
            case "mi":
                conversion = dist / 5280;
                break;
            default:
                conversion = 0;
        }

        return conversion;
    }
}
