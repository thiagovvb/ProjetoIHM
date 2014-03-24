package com.example.ufpbmaps;

import java.util.ArrayList;

import dbclasses.DataHandler;
import entities.DBLandmark;
import entities.Landmark;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class DestinationActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_destination);
				
		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		
		DataHandler dh = new DataHandler(getApplicationContext());
		dh.open();
		
		ArrayList<Landmark> array = dh.fetchRelevantLandmarks();
		
		for(int j = 1; j <= array.size(); j++){
			Button destination = new Button(this);
			destination.setId(j);
			destination.setText(array.get(j-1).getName());
			destination.setOnClickListener(destination_button_click_listener);
			l1.addView(destination);
		}
		
		dh.close();
	}
	
	public void initiateDestinationLandmark(int viewId) {
		DataHandler dh = new DataHandler(getApplicationContext());
		dh.open();
		
		Intent intent = new Intent(this, DestinationLandmarkActivity.class);
		Landmark destination = dh.fetchLandmark(viewId);
		intent.putExtra("Landmark", destination);
		
		dh.close();
		startActivity(intent);
	}
	
	protected OnClickListener destination_button_click_listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			initiateDestinationLandmark(v.getId());
		}
	};
	
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