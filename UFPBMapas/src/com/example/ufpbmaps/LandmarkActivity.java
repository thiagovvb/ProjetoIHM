package com.example.ufpbmaps;

import java.util.ArrayList;

import dbclasses.DataHandler;
import entities.CompleteRoute;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LandmarkActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landmark);
		
		DataHandler dh = new DataHandler(getApplicationContext());
		dh.open();
		
		Intent intent = getIntent();
		Landmark landmark = (Landmark) intent.getSerializableExtra("Landmark");
		
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText(landmark.getAcronym());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(landmark.getPicture());
		
		TextView t1 = (TextView) findViewById(R.id.landmarkDescription);
		t1.setText(landmark.getName() + " - " + landmark.getDescription());

		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		
		ArrayList<Landmark> ldm = dh.fetchLandmark();
		
		for(int j = 1; j <= ldm.size(); j++){
			if(j != landmark.getId()){
				Button destination = new Button(this);
				destination.setId(j);
				destination.setText(ldm.get(j-1).getName());
				destination.setOnClickListener(abreRota);
				l1.addView(destination);
			}
		}
		
		dh.close();
	}
	
	private void initiateRouteActivity(int source, int destination){
		Intent intent = new Intent(this, RouteActivity.class);
		CompleteRoute cr = new CompleteRoute(getApplicationContext());
		cr.create(source, destination);
		intent.putExtra("CompleteRoute", cr);
		startActivity(intent);
	}
	
	private OnClickListener abreRota = new OnClickListener() { 
		public void onClick(View v) {
			DataHandler dh = new DataHandler(getApplicationContext());
			dh.open();
			Intent intent = getIntent();
			Landmark source = (Landmark) intent.getSerializableExtra("Landmark");
			Landmark destination;
			//if(v.getId() < source.getId()){
			//	destination = dh.fetchLandmark(v.getId());
			//} else {
			destination = dh.fetchLandmark(v.getId());
			//}
			dh.close();
			initiateRouteActivity(source.getId(), destination.getId());
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