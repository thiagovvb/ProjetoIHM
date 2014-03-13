package com.example.ufpbmaps;

import entities.DBLandmark;
import entities.DBRoutes;
import entities.Landmark;
import entities.Route;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
		t.setText(landmark.getName());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(landmark.getPicture());
		
		TextView t1 = (TextView) findViewById(R.id.landmarkDescription);
		t1.setText(landmark.getDescription());

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
			System.out.println("Passou daqui A");
			Intent intent = getIntent();
			System.out.println("Passou daqui B");
			Landmark origem = (Landmark) intent.getSerializableExtra("Landmark");
			System.out.println("Passou daqui C");
			//Landmark destino = DBLandmark.getInstance().getLdm(v.getId());
			if(origem.getId() == 1 || origem.getId() == 7) {
				initiateRouteActivity(DBRoutes.getInstance().getRoute(1));
			} else {
				initiateRouteActivity(DBRoutes.getInstance().getRoute(2));
			}
			System.out.println("Passou daqui D");
		}
	};
}