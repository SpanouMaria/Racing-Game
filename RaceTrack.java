import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RaceTrack {
    private List<Road> segments;
    private int currentIndex;

    public RaceTrack(int size) {
        segments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter road type for segment " + (i + 1) + " (0: Paved, 1: Dirt, 2: Rocky): ");
            int type = scanner.nextInt();
            System.out.println("Enter road length in kilometers: ");
            int length = scanner.nextInt();
            System.out.println("Does this segment have turns? (true/false): ");
            boolean hasTurns = scanner.nextBoolean();

            if (type == 0) {
                segments.add(new Road(length, hasTurns));
            } else if (type == 1) {
                segments.add(new DirtRoad(length, hasTurns));
            } else if (type == 2) {
                segments.add(new RockyRoad(length, hasTurns));
            }
        }
        currentIndex = 0;
    }

    public Road nextSegment() {
        if (currentIndex < segments.size()) {
            return segments.get(currentIndex++);
        }
        return null;
    }

    public boolean hasMoreSegments() {
        return currentIndex < segments.size();
    }

    public void printRemainingTrack() {
        for (int i = currentIndex; i < segments.size(); i++) {
            System.out.println(segments.get(i));
        }
    }
}