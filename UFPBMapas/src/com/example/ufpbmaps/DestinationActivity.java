package com.example.ufpbmaps;

import entities.DBLandmark;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class DestinationActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_destination);
				
		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);		
		for(int j = 1; j <= 23; j++){
			Button destination = new Button(this);
			destination.setId(j);
			destination.setText(DBLandmark.getInstance().getLdm(j).getName());
			l1.addView(destination);
		}
	}
}
