package midexam.four;

public class Vehicle {
    public final double EFFICIENCY = 22.5;
    static String manufacturer;
    static double fuel;

    Vehicle(String manufacturer, double fuel){
        this.manufacturer = manufacturer;
        this.fuel = fuel;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getDistance(){
        return fuel * EFFICIENCY;
    }
}
