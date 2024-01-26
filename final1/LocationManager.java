public class LocationManager {
    private static final LocationManager instance = new LocationManager();
    public static LocationManager getInstance() {
        return instance;
    }
    private double latitude = 0;
    private double longitude = 0;

    private LocationManager() {
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
