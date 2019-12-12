package com.example.faturapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        final GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);

        Bundle extras = getIntent().getExtras();
        int arr[] = extras.getIntArray("array");

        try {
            LineGraphSeries < DataPoint > series = new LineGraphSeries < > (new DataPoint[] {
                    new DataPoint(1, arr[0]),
                    new DataPoint(2, arr[1]),
                    new DataPoint(3, arr[2]),
                    new DataPoint(4, arr[3]),
                    new DataPoint(5, 5)
            });
            graph.addSeries(series);
        } catch (Exception e) {
            Toast.makeText(GraphActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }


    }
}