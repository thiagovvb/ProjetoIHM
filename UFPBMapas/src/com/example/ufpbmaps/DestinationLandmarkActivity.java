package com.example.ufpbmaps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import entities.DBLandmark;
import entities.DBRoutes;
import entities.Landmark;
import entities.Route;

public class DestinationLandmarkActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_destinationlandmark);
		
		Intent intent = getIntent();
		Landmark landmark = (Landmark) intent.getSerializableExtra("Landmark");
		
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText(landmark.getName());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(landmark.getPicture());
		
		TextView t1 = (TextView) findViewById(R.id.landmarkDescription);
		t1.setText(landmark.getDescription());

		LinearLayout l1 = (LinearLayout)findViewById(R.id.buttonLinearLayout);
		
		Button destination = new Button(this);
		destination.setId(0);
		destination.setText(R.string.qrcode_button);
		destination.setOnClickListener(null);
		l1.addView(destination);
		for(int j = 1; j <= 23; j++){
			if(j != landmark.getId()){
				destination = new Button(this);
				destination.setId(j);
				destination.setText(DBLandmark.getInstance().getLdm(j).getName());
				destination.setOnClickListener(abreRota);
				l1.addView(destination);
			}
		}
	}
	
	private void initiateRouteActivity(Route route){
		System.out.println("Passou daqui E");
		Intent intent = new Intent(this, RouteActivity.class);
		System.out.println("Passou daqui F");
		intent.putExtra("Route", route);
		System.out.println("Passou daqui G");
		startActivity(intent);
		System.out.println("Passou daqui H");
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
				System.out.println("Passou daqui D");
				initiateRouteActivity(DBRoutes.getInstance().getRoute(1));
				System.out.println("Passou daqui I");
			} else {
				System.out.println("Passou daqui J");
				initiateRouteActivity(DBRoutes.getInstance().getRoute(2));
				System.out.println("Passou daqui K");
			}
			System.out.println("Passou daqui L");
		}
	};
}
