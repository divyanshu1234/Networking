package divyanshu.networking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String requestURL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-05-02&minfelt=50&minmagnitude=5";

        final TextView tv_display_data = (TextView) findViewById(R.id.tv_display_data);

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                requestURL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        tv_display_data.setText("");
                        List<Earthquake> earthquakeList = NetworkHelper.extractEarthquakeData(response);

                        for (int i = 0; i < earthquakeList.size(); ++i) {
                            Earthquake earthquake = earthquakeList.get(i);
                            tv_display_data.append(
                                    earthquake.getMagnitude()
                                            + " - " + earthquake.getLocation()
                                            + " - " + earthquake.getTimeInMillis()
                                            + "\n"
                            );
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        requestQueue.add(request);
    }
}
