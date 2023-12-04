package sample10.observer4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SensorReader sr = new SensorReader("********","********");
        SensorObserver observer = new SensorObserver();
        sr.addObserver(observer);
        sr.execute("3205");
    }
}