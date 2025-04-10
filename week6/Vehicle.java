public class Vehicle {
    public String carmodel;
    public String color;
    public String fuel_type;
    public Vehicle(String carmodel, String color, String fuel_type){
    this.carmodel = carmodel;
    this.color = color;
    this.fuel_type = fuel_type;
    }
    public void displayinfo() {
        System.out.println("Car Model: " + carmodel);
        System.out.println("Car color: " + color);
        System.out.println("car fuel type: " + fuel_type);
        System.out.println("I own a BMW.");
    }
}
class Car extends Vehicle {
    public Car(String carmodel, String color, String fuel_type) {
        super(carmodel, color, fuel_type);
    }
     public void displayinfo() {
        super.displayinfo();
        System.out.println("I own an Audi.");
    }
}