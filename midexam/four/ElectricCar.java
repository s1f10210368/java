package midexam.four;

public class ElectricCar extends Vehicle{
    public double MAX_DISTANCE = 500.0;
    double chargeLevel;

    ElectricCar(double chargeLevel){
        super(manufacturer, fuel);
        this.chargeLevel = chargeLevel;

        manufacturer = "Tesla";
        fuel = 0;
    }

    double getChargeLevel(){
        return chargeLevel;
    }

    void charge(){
        chargeLevel = 1.0;
    }

    @Override
    public double getDistance(){
        return chargeLevel * MAX_DISTANCE;
    }
}
