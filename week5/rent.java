public class rent {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 150, 4);
        Bike bike = new Bike("Yamaha", 120, true);
        Truck truck = new Truck("Volvo", 90, 10);
        System.out.println("Car Details");
        car.start();
        car.showDetails();
        System.out.println("Bike Details");
        bike.start();
        bike.showDetails();
        System.out.println("Truck Details");
        truck.start();
        truck.showTruck(); 
    }
}