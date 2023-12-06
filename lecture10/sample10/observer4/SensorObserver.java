package lecture10.sample10.observer4;

public class SensorObserver implements Observer {
    public SensorObserver() {
    }

    public void update(SensorReader subject) {
        float illuminance = subject.getIlluminance();
        float humidity = subject.getHumidity();
        float airpressure = subject.getAirpressure();
        float temperature = subject.getTemperature();
        System.out.printf("%f %f %f %f\n", illuminance, humidity, airpressure, temperature);
    }
}