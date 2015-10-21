package com.example.david.spotify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private GridView gridview;

    private int mPhotoSize, mPhotoSpacing;

    private ImageAdapter imageAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Use ImageAdapter to create GridView

        imageAdapter = new ImageAdapter(this);

        gridview = (GridView) findViewById(R.id.moviegrid);
        gridview.setAdapter(imageAdapter);

        /*
        gridview.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (imageAdapter.getNumColums() == 0) {
                    final int numColumns = (int) Math.floor(gridview.getWidth()/(mPhotoSize+mPhotoSpacing));
                    if (numColumns > 0) {
                        final int columnWidth = (gridview.getWidth()/numColumns ) - mPhotoSpacing;
                        imageAdapter.setNumColumns(numColumns);
                        imageAdapter.setItemHeight(columnWidth);
                    }
                }
            }
        });
        */
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
