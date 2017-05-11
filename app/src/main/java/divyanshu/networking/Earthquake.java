package divyanshu.networking;

/**
 * Created by Divyanshu on 5/12/17.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMillis;

    public Earthquake(double magnitude, String location, long timeInMillis){
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMillis = timeInMillis;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
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
