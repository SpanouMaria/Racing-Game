public class Racer {
    private String name;
    private Vehicle vehicle;
    private double totalTime;

    public Racer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.totalTime = 0;
    }

    public void race(Road road, double fuelConsumed) {
        double time = vehicle.race(road, fuelConsumed);
        totalTime += time;
    }

    public void refuel() {
        vehicle.refuel();
    }

    @Override
    public String toString() {
        return name + " (" + totalTime + " minutes)\n" + vehicle.toString();
    }

    public String getName() {
        return name;
    }

    public double getTotalTime() {
        return totalTime;
    }
}