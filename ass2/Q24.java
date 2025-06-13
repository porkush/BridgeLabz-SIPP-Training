import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity;
        double timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter From City: ");
        fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        timeFromToVia = sc.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        timeViaToFinalCity = sc.nextDouble();

        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.60934;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.printf(
            "The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes%n",
            name, fromCity, toCity, viaCity, totalDistanceKm, totalTime
        );
    }
}
