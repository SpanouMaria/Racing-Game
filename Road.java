import java.util.Random;

public class Road {
    private int kilometers;
    private boolean hasTurns;

    public Road(int kilometers, boolean hasTurns) {
        this.kilometers = kilometers;
        this.hasTurns = hasTurns;
    }

    public double updateConsumptionFactor(double consumption) {
        if (hasTurns) {
            consumption *= 1.1;
        }
        return consumption;
    }

    @Override
    public String toString() {
        String roadType = "paved road";
        if (hasTurns) {
            roadType += " with turns";
        }
        return kilometers + " km of " + roadType;
    }

    public boolean getHasTurns() {
        return hasTurns;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getType() {
        return 0;
    }
}