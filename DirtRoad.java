import java.util.Random;

public class DirtRoad extends Road {
    private double rainLevel;

    public DirtRoad(int kilometers, boolean hasTurns) {
        super(kilometers, hasTurns);
        Random random = new Random();
        this.rainLevel = random.nextDouble();
    }

    @Override
    public double updateConsumptionFactor(double consumption) {
        consumption = super.updateConsumptionFactor(consumption);
        if (rainLevel >= 0.8) {
            consumption *= 1.2;
        } else if (rainLevel >= 0.5) {
            consumption *= 1.1;
        }
        return consumption;
    }

    @Override
    public String toString() {
        return super.toString() + " with rain level: " + rainLevel;
    }

    @Override
    public int getType() {
        return 1;
    }
}