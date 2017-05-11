package divyanshu.networking;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by Divyanshu on 5/12/17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    public EarthquakeLoader(Context context) {
        super(context);
    }

    @Override
    public List<Earthquake> loadInBackground() {
        String requestURL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-05-02&minfelt=50&minmagnitude=5";
        return NetworkHelper.fetchEarthquakeData(requestURL);
    }
}
