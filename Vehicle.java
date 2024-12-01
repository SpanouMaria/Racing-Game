public abstract class Vehicle {
    private String name;
    private double fuelQuantity;

    public Vehicle(String name, double fuelQuantity) {
        this.name = name;
        this.fuelQuantity = fuelQuantity;
    }

    public abstract double computeConsumptionFactor(Road road);

    public double race(Road road, double fuelConsumed) {
        double speed = computeSpeed(road);
        double time = road.getKilometers() / speed;
        fuelQuantity -= fuelConsumed;
        return time;
    }

    public void refuel() {
        fuelQuantity += 10;
    }

    @Override
    public String toString() {
        return name + " fuel left: " + fuelQuantity;
    }

    public String getName() {
        return name;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    private double computeSpeed(Road road) {
        double consumptionFactor = computeConsumptionFactor(road);
        double actualConsumptionPerKm = fuelQuantity / road.getKilometers();
        return actualConsumptionPerKm / consumptionFactor;
    }
}