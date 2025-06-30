public class Startt{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 80);
        System.out.println("Vehicle Info:");
        vehicle.displayInfo();

        System.out.println("\nCar Info:");
        Car car = new Car("Toyota", 120, 4);
        car.displayInfo();
    }
}
