public class Car extends Vehicle {
    private double[] consumptionFactors = {0.1, 0.35, 0.45};

    public Car() {
        super("Car", 100);
    }

    @Override
    public double computeConsumptionFactor(Road road) {
        double consumptionFactor = consumptionFactors[road.getType()];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}