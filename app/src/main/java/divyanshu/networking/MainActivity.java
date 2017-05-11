package divyanshu.networking;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Earthquake>>{

    TextView tv_display_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_display_data = (TextView) findViewById(R.id.tv_display_data);

        getSupportLoaderManager().initLoader(0, null, this);
    }


    private void displayData(List<Earthquake> data) {
        tv_display_data.setText("");

        for (int i = 0; i < data.size(); ++i){
            Earthquake earthquake = data.get(i);
            tv_display_data.append(
                    earthquake.getMagnitude() + " - "
                    + earthquake.getLocation() + " - "
                    + earthquake.getTimeInMillis()
                    + "\n"
                    );
        }
    }

    @Override
    public Loader<List<Earthquake>> onCreateLoader(int id, Bundle args) {
        return new EarthquakeLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<Earthquake>> loader, List<Earthquake> data) {
        displayData(data);
    }


    @Override
    public void onLoaderReset(Loader<List<Earthquake>> loader) {
    }
}
