package refinal1;


// シングルトン変更
public class LocationManager {
    private double latitude = 0;
    private double longitude = 0;

    // クラスの唯一のインスタンスを保持するための変数作成
    private static LocationManager instance = new LocationManager();

    // コンストラクタはプライベートに!
    private LocationManager() {
    }

    // ここでインスタンスを取得!
    public static LocationManager getInstance(){
        return instance;
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