package za.co.wethinkcode.avajlauncher;

public class Coordinates {
    private final int longitude;
    private final int latitude;
    private final int height;

    public Coordinates(final int longitude, final int latitude, final int height) {
        this.longitude =  longitude;
        this.latitude = latitude ;
        this.height = height;
    }

    public int getLongitude() { return longitude; }

    public int getLatitude() { return latitude; }
    
    public int getHeight() { return height; }
}
