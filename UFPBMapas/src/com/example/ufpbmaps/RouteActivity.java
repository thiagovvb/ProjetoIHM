package com.example.ufpbmaps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
}
