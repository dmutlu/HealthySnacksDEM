package edu.umbc.dmutlu1.healthysnacksdem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = findViewById(R.id.gridView);
        gridview.setAdapter(new ImageAdapter(this));
    }

}