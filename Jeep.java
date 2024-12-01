public class Jeep extends Vehicle {
    private double[] consumptionFactors = {0.25, 0.3, 0.35};

    public Jeep() {
        super("Jeep", 100);
    }

    @Override
    public double computeConsumptionFactor(Road road) {
        double consumptionFactor = consumptionFactors[road.getType()];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}