public class Motorbike extends Vehicle {
    private double[] consumptionFactors = {0.05, 0.4, 0.5};

    public Motorbike() {
        super("Motorbike", 100);
    }

    @Override
    public double computeConsumptionFactor(Road road) {
        double consumptionFactor = consumptionFactors[road.getType()];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}