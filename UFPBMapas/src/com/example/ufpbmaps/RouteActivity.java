package com.example.ufpbmaps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import entities.DBLandmark;
import entities.Route;

public class RouteActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);
		
		Intent intent = getIntent();
		Route route = (Route) intent.getSerializableExtra("Route");
				
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText("De " + DBLandmark.getInstance().getLdm(route.getSourceId()).getName()
				+ " a " + DBLandmark.getInstance().getLdm(route.getDestinationId()).getName());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(route.getMap());

	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preferencias, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.aboutUs) {
        	new AlertDialog.Builder(this).setMessage(R.string.aboutUs).setTitle("About").setPositiveButton("Voltar", null).show();
            return true;
        }
     
        return super.onOptionsItemSelected(item);
    }
}
