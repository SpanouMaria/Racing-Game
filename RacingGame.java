import java.util.Scanner;

public class RacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of track segments: ");
        int trackSize = scanner.nextInt();

        RaceTrack raceTrack = new RaceTrack(trackSize);

        System.out.println("Choose your vehicle (1: Motorbike, 2: Car, 3: Jeep): ");
        int choice = scanner.nextInt();
        Vehicle playerVehicle;
        if (choice == 1) {
            playerVehicle = new Motorbike();
        } else if (choice == 2) {
            playerVehicle = new Car();
        } else {
            playerVehicle = new Jeep();
        }

        Racer player = new Racer("Player", playerVehicle);

        while (raceTrack.hasMoreSegments()) {
            raceTrack.printRemainingTrack();
            Road segment = raceTrack.nextSegment();
            System.out.println("Current segment: " + segment);
            System.out.println("Enter fuel to use for this segment: ");
            double fuel = scanner.nextDouble();
            double time = playerVehicle.race(segment, fuel);
            System.out.println("Time for this segment: " + time + " minutes");
        }

        System.out.println("Race finished!");
        System.out.println(player);
    }
}