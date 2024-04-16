import java.util.Scanner;

public class citiesDist {
    public static void main(String[] args) {
        int Path[] = { 80, 600, 750, 900, 1200, 110, 1500 };
        String BusStops[] = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        int sourceIndex = -1;
        int destinationIndex = -1;
        int d = 1000, fare = 5, distance = 0;

        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String destination = sc.nextLine();

        source = source.toUpperCase();
        destination = destination.toUpperCase();

        for (int i = 0; i < BusStops.length; i++) {
            if (BusStops[i].equals(source)) {
                sourceIndex = i;
                break;
            }
        }

        for (int i = 0; i < BusStops.length; i++) {
            if (BusStops[i].equals(destination)) {
                destinationIndex = i;
                break;
            }
        }

        if (sourceIndex == destinationIndex) {
            System.out.println("INVALID INPUT");
            return;
        }

        if (sourceIndex < destinationIndex) {
            for (int i = sourceIndex; i < destinationIndex; i++) {
                distance += Path[i];
            }
        } else {
            for (int i = sourceIndex; i < Path.length; i++) {
                distance += Path[i];
            }
            for (int i = 0; i < destinationIndex; i++) {
                distance += Path[i];
            }
        }

        double cost = Math.ceil((distance/d)*fare);
        System.out.println("Fare: " + cost + " INR");
    }
}
