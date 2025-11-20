import java.util.Scanner;
public class SpaceExpeditionDriver {
    public static void main(String[] args) {
        // Create instances of different spacecraft
        CargoShip cargoShip = new CargoShip();
        ResearchVessel researchVessel = new ResearchVessel();
        PassengerShuttle passengerShuttle = new PassengerShuttle();
        MiningDrone miningDrone = new MiningDrone();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the distance each spacecraft will travel
        double cargoShipDistance = scanner.nextDouble();
        double researchVesselDistance = scanner.nextDouble();
        double passengerShuttleDistance = scanner.nextDouble();
        double miningDroneDistance = scanner.nextDouble();
        
        // CargoShip fuel management
        cargoShip.consumeResource(cargoShip.estimateConsumptionForDistance(cargoShipDistance));
        System.out.println("CargoShip fuel remaining after traveling " + cargoShipDistance + " units: " + cargoShip.calculateRemainingResource() + " units");

        // ResearchVessel food management
        researchVessel.consumeResource(researchVessel.estimateConsumptionForDistance(researchVesselDistance));
        System.out.println("ResearchVessel food supply remaining after traveling " + researchVesselDistance + " units: " + researchVessel.calculateRemainingResource() + " units");

        // PassengerShuttle oxygen management
        passengerShuttle.consumeResource(passengerShuttle.estimateConsumptionForDistance(passengerShuttleDistance));
        System.out.println("PassengerShuttle oxygen supply remaining after traveling " + passengerShuttleDistance + " units: " + passengerShuttle.calculateRemainingResource() + " units");

        // MiningDrone energy management
        miningDrone.consumeResource(miningDrone.estimateConsumptionForDistance(miningDroneDistance));
        System.out.println("MiningDrone energy remaining after traveling " + miningDroneDistance + " units: " + miningDrone.calculateRemainingResource() + " units");
    }
}

interface ResourceManagement{
    static double FUEL_CONSUMPTION_RATE = 0.5;
    static double FOOD_CONSUMPTION_RATE = 0.2;
    static double OXYGEN_CONSUMPTION_RATE = 0.3;
    static double ENERGY_CONSUMPTION_RATE = 0.4;
    public abstract void addResource(double amount);
    public abstract void consumeResource(double amount);
    public abstract double calculateRemainingResource();
    public abstract double estimateConsumptionForDistance(double distance);
    
}

abstract class Spacecraft implements ResourceManagement{
    protected double resource;
    
    public abstract double calculateRemainingResource();
    public abstract double estimateConsumptionForDistance(double distance);
    
    @Override
    public void addResource(double amount) {
        resource += amount;
    }
    @Override
    public void consumeResource(double amount) {
        resource -= amount;
    }
    
}

class CargoShip extends Spacecraft {
    //constructor
    CargoShip() {
        resource = 1000;
    }
    public double calculateRemainingResource() {
        return resource;
    }
    public double estimateConsumptionForDistance(double distance) {
        return FUEL_CONSUMPTION_RATE * distance;
    }
}

class ResearchVessel extends Spacecraft{
    ResearchVessel() {
        resource = 500;
    }
    public double calculateRemainingResource() {
        return resource;
    }
    public double estimateConsumptionForDistance(double distance) {
        return FOOD_CONSUMPTION_RATE * distance;
    }
}

class PassengerShuttle extends Spacecraft{
    PassengerShuttle() {
        resource = 800;
    }
    public double calculateRemainingResource() {
        return resource;
    }
    public double estimateConsumptionForDistance(double distance) {
        return OXYGEN_CONSUMPTION_RATE * distance;
    }
}

class MiningDrone extends Spacecraft{
    MiningDrone() {
        resource = 600;
    }
    public double calculateRemainingResource() {
        return resource;
    }
    public double estimateConsumptionForDistance(double distance) {
        return FUEL_CONSUMPTION_RATE * distance;
    }
}