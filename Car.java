// Child Class
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
