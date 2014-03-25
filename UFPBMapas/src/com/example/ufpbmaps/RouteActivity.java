package com.example.ufpbmaps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import entities.CompleteRoute;
import entities.Graph;

public class RouteActivity extends Activity {
	private int idInRoute;
	private CompleteRoute cr;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);
		
		idInRoute = 0;
		
		Intent intent = getIntent();
		cr = (CompleteRoute) intent.getSerializableExtra("CompleteRoute");
		
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText("De " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getName()
				+ " a " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getName());

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(cr.getRoute(idInRoute).getMap());
		
		TextView t2 = (TextView) findViewById(R.id.buttonTittle);
		t2.setText(Graph.getInstance().getRoute(
				Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getId(),
				Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getId()
				).getInstruction());
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
	
	public void gotoPrevious(View v){
		if(idInRoute != 0) {
			
			idInRoute--;
			
			TextView t = (TextView) findViewById(R.id.landmarkName);
			t.setText("De " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getName()
					+ " a " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getName());
			
			ImageView i = (ImageView) findViewById(R.id.landmarkImage);
			i.setImageResource(cr.getRoute(idInRoute).getMap());
			
			TextView t2 = (TextView) findViewById(R.id.buttonTittle);
			t2.setText(Graph.getInstance().getRoute(
					Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getId(),
					Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getId()
					).getInstruction());
			
		}
	}
	
	public void gotoNext(View v){
		if(idInRoute != cr.getCompleteRoute().size() - 1) {
			
			idInRoute++;
			
			TextView t = (TextView) findViewById(R.id.landmarkName);
			t.setText("De " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getName()
					+ " a " + Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getName());
			
			ImageView i = (ImageView) findViewById(R.id.landmarkImage);
			i.setImageResource(cr.getRoute(idInRoute).getMap());
			
			TextView t2 = (TextView) findViewById(R.id.buttonTittle);
			t2.setText(Graph.getInstance().getRoute(
					Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getSourceId()).getId(),
					Graph.getInstance().getLandmark(cr.getRoute(idInRoute).getDestinationId()).getId()
					).getInstruction());
			
		}
	}
}
