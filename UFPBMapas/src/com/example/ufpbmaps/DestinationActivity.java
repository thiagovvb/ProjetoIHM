package com.example.ufpbmaps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class DestinationActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_destination);
		
		Button myButton = new Button(this);
		myButton.setText("Push Me");
		
		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		l1.addView(myButton);
	}
}
