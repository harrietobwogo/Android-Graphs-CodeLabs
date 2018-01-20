package phr.samuelowino.org.androidgraphscodelabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LineChart chart;
    Entry entry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chart = findViewById(R.id.chart);

        entry = new Entry(1,10);

        List<Entry> entryList = Arrays.asList(
                new Entry(1,10),
                new Entry(1,11),
                new Entry(1,12),
                new Entry(1,13),
                new Entry(1,14),
                new Entry(1,15),
                new Entry(1,16),
                new Entry(1,17),
                new Entry(1,18)
        );

        LineDataSet dataSet = new LineDataSet(entryList,"Heart Rate");
        dataSet.setColor(getResources().getColor(android.R.color.holo_blue_dark));
        dataSet.setValueTextColor(getResources().getColor(android.R.color.white));

    }
}
