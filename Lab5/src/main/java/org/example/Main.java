package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String modelName;
    protected int mileage;
    protected int health;

    public Vehicle(String modelName) {
        this(modelName, 0, 100);
    }

    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName() { return modelName; }
    public int getMileage() { return mileage; }
    public int getHealth() { return health; }

    public abstract String service();
    public abstract int expectedLifespan();

    public boolean needsMaintenance() { return health < 70; }

    public int calculateRemainingLifespan() {
        int lifespan = expectedLifespan();
        if (health < 50) lifespan *= (double) health / 100;
        return Math.max(lifespan - mileage, 0);
    }

    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) health -= 5;
        calculateRemainingLifespan();
    }

    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.repair();
            car.drive(100);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.repair();
            truck.haul(6000);
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(50);
        }
    }
}

interface Repairable {
    String repair();
}

class Car extends Vehicle implements Repairable {
    public Car(String modelName) { super(modelName); }
    public Car(String modelName, int mileage, int health) { super(modelName, mileage, health); }

    public String repair() { return "Engine tuned and oil changed for " + modelName; }
    public String service() { return "Service: Check engine and change oil for " + modelName; }
    public int expectedLifespan() { return 150000; }

    public void drive(int miles) {
        mileage += miles;
        health -= (miles / 100);
        if (health < 30) health -= 10000;
    }
}

class Truck extends Vehicle implements Repairable {
    public Truck(String modelName) { super(modelName); }
    public Truck(String modelName, int mileage, int health) { super(modelName, mileage, health); }

    public String repair() { return "Engine overhauled and tires replaced for " + modelName; }
    public String service() { return "Service: Check engine and replace tires for " + modelName; }
    public int expectedLifespan() { return 300000; }

    public void haul(int loadWeight) {
        if (loadWeight > 5000) health -= 10;
        if (health < 40) health -= 20000;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String modelName) { super(modelName); }
    public Motorcycle(String modelName, int mileage, int health) { super(modelName, mileage, health); }

    public String service() { return "Service: Lubricate chain and tune engine for " + modelName; }
    public int expectedLifespan() { return 50000; }

    public void race(int raceMiles) {
        mileage += raceMiles;
        health -= (raceMiles / 10);
        if (health < 40) health -= 5000;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Sedan"));
        vehicles.add(new Truck("Hauler", 50000, 80));
        vehicles.add(new Motorcycle("Sport", 2000, 90));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());
            vehicle.simulateYear();

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive(500);
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.haul(6000);
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(100);
            }
            vehicle.performMaintenance(vehicle);
        }
    }
}
