package com.example.ufpbmaps;

import entities.DBLandmark;
import entities.Landmark;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LandmarkActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landmark);
		
		Intent intent = getIntent();
		Landmark landmark = (Landmark) intent.getSerializableExtra("Landmark");
				
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText(landmark.getName());
		
		TextView t1 = (TextView) findViewById(R.id.landmarkDescription);
		t1.setText(landmark.getDescription());

		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		
		for(int i = 1; i <= 23 && i != landmark.getId(); i++){
			Button destination = new Button(this);
			destination.setText(DBLandmark.getInstance().getLdm(i).getName());
			l1.addView(destination);
		}
	}
}