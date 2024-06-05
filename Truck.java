public class Truck extends Vehicle {
    double milesDriven;
    double fuelConsumned;
    double cargoWeight;
    public Truck(String make, String model, int year, double milesDriven, double fuelConsumned, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumned = fuelConsumned;
        this.cargoWeight = cargoWeight;
    }
    public double CalculateFuelEfficiency() {
        return milesDriven / (fuelConsumned + (cargoWeight * 0.5));
    }}