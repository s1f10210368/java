package midexam.four; 

public class Main {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar(0.5);
        System.out.println(ev.getManufacturer());
        System.out.println(ev.getDistance());
        ev.charge();
        System.out.println(ev.getDistance());
    }
}
