import java.util.Scanner;
public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        String carBrand = scanner.next();
        String carModel = scanner.next();
        int carYear = scanner.nextInt();
        double carPrice = scanner.nextDouble();
        int numberOfDoors = scanner.nextInt();

        Car car = new Car(carBrand, carModel, carYear, carPrice, numberOfDoors);

        // Input for Truck
        String truckBrand = scanner.next();
        String truckModel = scanner.next();
        int truckYear = scanner.nextInt();
        double truckPrice = scanner.nextDouble();
        double loadCapacity = scanner.nextDouble();

        Truck truck = new Truck(truckBrand, truckModel, truckYear, truckPrice, loadCapacity);

        // Input for Motorcycle
        String motorcycleBrand = scanner.next();
        String motorcycleModel = scanner.next();
        int motorcycleYear = scanner.nextInt();
        double motorcyclePrice = scanner.nextDouble();
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcyclePrice, hasSidecar);

        // Display details and perform actions
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Depreciation: " + car.calculateDepreciation());
        System.out.println("Cost per Door: " + car.calculateCostPerDoor());
        System.out.println("Total Cost: " + car.calculateTotalCost());

        System.out.println("\nTruck Details:");
        truck.displayDetails();
        System.out.println("Depreciation: " + truck.calculateDepreciation());
        System.out.println("Cost per Ton: " + truck.calculateCostPerTon());
        System.out.println("Total Cost: " + truck.calculateTotalCost());

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();
        System.out.println("Depreciation: " + motorcycle.calculateDepreciation());
        System.out.println("Estimated Insurance Cost: " + motorcycle.estimateInsuranceCost());
        System.out.println("Total Cost: " + motorcycle.calculateTotalCost());
    }
}

class Vehicle{
    private String brand;
    private String model;
    private int year;
    private double price;
    
    //constructor
    Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void displayDetails() {
        // System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Price: " + getPrice());
    }
    public double calculateDepreciation() {
        int current = 2024;
        int age = current - year;
        return price * (1- Math.pow(0.85, age));
    }
    
}

class Car extends Vehicle{
    private int numberOfDoors;
    
    //constructor
    Car(String brand, String model, int year, double price, int numberOfDoors) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    //Same
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Number of Doors: " + getNumberOfDoors());
    }
    public double calculateCostPerDoor() {
        return getPrice() / numberOfDoors;
    }
    public double calculateTotalCost() {
        return calculateCostPerDoor() + calculateDepreciation();
    }
    
}

class Truck extends Vehicle{
    private double loadCapacity;
    
    //constructor
    Truck(String brand, String model, int year, double price, double loadCapacity) {
        super(brand, model, year, price);
        this.loadCapacity = loadCapacity;
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    //Same
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Load Capacity: " + getLoadCapacity() + " tons");
    }
    public double calculateCostPerTon() {
        return getPrice() / loadCapacity;
    }
    public double calculateTotalCost() {
        return calculateCostPerTon() + calculateDepreciation();
    }
}

class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    
    //constructor
    Motorcycle (String brand, String model, int year, double price, boolean hasSidecar) {
        super(brand, model, year, price);
        this.hasSidecar = hasSidecar;
    }
    
    public boolean isHasSidecar() {
        return hasSidecar;
    }
    public void setHasSlidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    
    //Same
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Has Sidecar: " + isHasSidecar());
    }
    public double estimateInsuranceCost() {
        double base = 500;
        if (hasSidecar) {
            base+=200;
        }
        return base;
    }
    public double calculateTotalCost() {
        return estimateInsuranceCost() + calculateDepreciation();
    }
    
}
