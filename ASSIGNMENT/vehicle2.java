public class vehicle2 {
    public static void main(String[] args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        vehicle truck = new truck("Ford", "F-150", 2023, "Diesel");
        vehicle car = new car("Toyota", "Corolla", 2022, "Petrol");
        vehicle motorcycle = new motorcycle("Yamaha", "YZF-R1", 2021, "Petrol");
        System.out.println("truck details:");
        System.out.println("Make: " + truck.getmake() + ", Model: " + truck.getmodel());
        System.out.println("Fuel Efficiency: " + truck.fuelefficiency() + " km/l");
        System.out.println("Max Speed: " + truck.maxspeed() + " km/h");
        System.out.println("Distance travelled:" + truck.distancetravelled(10) + " km");
        System.out.println();

        System.out.println("car details:");
        System.out.println("Make: " + car.getmake() + ", Model: " + car.getmodel());
        System.out.println("Fuel Efficiency: " + car.fuelefficiency() + " km/l");
        System.out.println("Max Speed: " + car.maxspeed() + " km/h");
        System.out.println("Distance traveled with 10 liters of fuel: " + car.distancetravelled(10) + " km");
        System.out.println();

        System.out.println("motorcycle details:");
        System.out.println("Make: " + motorcycle.getmake() + ", Model: " + motorcycle.getmodel());
        System.out.println("Fuel Efficiency: " + motorcycle.fuelefficiency() + " km/l");
        System.out.println("Max Speed: " + motorcycle.maxspeed() + " km/h");
        System.out.println("Distance traveled with 10 liters of fuel: " + motorcycle.distancetravelled(10) + " km");
    }
}
