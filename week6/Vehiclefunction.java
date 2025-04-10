public class Vehiclefunction {
    public static void main(String[]args) {
        System.out.println("Likitha lekhya");
        Vehicle v = new  Vehicle("Audi", "White", "Petrol");
        v.displayinfo();
        Car c = new Car("Benz", "Black", "Diesel");
        c.displayinfo();
    }
}