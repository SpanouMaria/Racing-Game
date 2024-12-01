import java.util.Random;

public class RockyRoad extends Road {
    private int difficulty;

    public RockyRoad(int kilometers, boolean hasTurns) {
        super(kilometers, hasTurns);
        Random random = new Random();
        this.difficulty = random.nextInt(3);
    }

    @Override
    public double updateConsumptionFactor(double consumption) {
        consumption = super.updateConsumptionFactor(consumption);
        if (difficulty == 2) {
            consumption *= 1.2;
        } else if (difficulty == 1) {
            consumption *= 1.1;
        }
        return consumption;
    }

    @Override
    public String toString() {
        return super.toString() + " with difficulty: " + difficulty;
    }

    @Override
    public int getType() {
        return 2;
    }
}