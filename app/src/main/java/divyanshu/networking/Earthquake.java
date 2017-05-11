package divyanshu.networking;

/**
 * Created by Divyanshu on 5/12/17.
 */

public class Earthquake {
    private float magnitude;
    private String location;
    private long timeInMillis;

    public Earthquake(float magnitude, String location, long timeInMillis){
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMillis = timeInMillis;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public void setTimeInMillis(long timeInMillis) {
        this.timeInMillis = timeInMillis;
    }
}
