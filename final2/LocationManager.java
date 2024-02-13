package final2;

import java.util.ArrayList;

public class LocationManager {
    private double latitude = 0;
    private double longitude = 0;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public LocationManager() {
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        notifyObservers();
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.delete(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
