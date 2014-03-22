package com.example.ufpbmaps;

import entities.DBLandmark;
import entities.DBRoutes;
import entities.Landmark;
import entities.Route;
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
		
		Intent intent = getIntent();
		Landmark landmark = (Landmark) intent.getSerializableExtra("Landmark");
		
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText(landmark.getAcronym());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(landmark.getPicture());
		
		TextView t1 = (TextView) findViewById(R.id.landmarkDescription);
		t1.setText(landmark.getName() + " - " + landmark.getDescription());

		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		
		for(int j = 1; j <= 23; j++){
			if(j != landmark.getId()){
				Button destination = new Button(this);
				destination.setId(j);
				destination.setText(DBLandmark.getInstance().getLdm(j).getName());
				destination.setOnClickListener(abreRota);
				l1.addView(destination);
			}
		}
	}
	
	private void initiateRouteActivity(Route route){
		Intent intent = new Intent(this, RouteActivity.class);
		intent.putExtra("Route", route);
		startActivity(intent);
	}
	
	private OnClickListener abreRota = new OnClickListener() { 
		public void onClick(View v) {
			Intent intent = getIntent();
			Landmark origem = (Landmark) intent.getSerializableExtra("Landmark");
			//Landmark destino = DBLandmark.getInstance().getLdm(v.getId());
			if(origem.getId() == 1 || origem.getId() == 7) {
				initiateRouteActivity(DBRoutes.getInstance().getRoute(1));
			} else {
				initiateRouteActivity(DBRoutes.getInstance().getRoute(2));
			}
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