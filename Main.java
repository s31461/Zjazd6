public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fiat", "126P", 1976, 100, 12);
        Truck truck = new Truck("Scania", "XYZ", 2015, 700, 248, 2000);
        System.out.println("Car consumption: " + String.format("%.2f", car.CalculateFuelEfficiency()));
        System.out.println("Truck consumption: " + String.format("%.2f", truck.CalculateFuelEfficiency()));
    }}