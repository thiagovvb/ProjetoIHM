package com.example.ufpbmaps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
		
		System.out.println("Começou onCreate de RouteActivity");
		
		idInRoute = 0;
		
		System.out.println("idInRoute agora é 0");
		
		Intent intent = getIntent();
		cr = (CompleteRoute) intent.getSerializableExtra("CompleteRoute");
		System.out.println("Pegou cr");
		
		int source = cr.getRoute(idInRoute).getSourceId();
		int destination = cr.getRoute(idInRoute).getDestinationId();
		
		TextView t = (TextView) findViewById(R.id.landmarkName);
		t.setText("De " + Graph.getInstance().getLandmark(source - 1).getName()
				+ " a " + Graph.getInstance().getLandmark(destination - 1).getName());
		System.out.println("Setou o texto acima da imagem");

		ImageView i = (ImageView) findViewById(R.id.landmarkImage);
		i.setImageResource(cr.getRoute(idInRoute).getMap());
		System.out.println("Setou a imagem");
		
		TextView t2 = (TextView) findViewById(R.id.buttonTittle);
		t2.setText(Graph.getInstance().getRoute(source, destination).getInstruction());
		System.out.println("Setou o texto abaixo da imagem");
		
		/*Button b = (Button) findViewById(R.id.buttonPrevious);
		b.setVisibility(View.INVISIBLE);*/
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
		/*Button b1 = (Button) findViewById(R.id.buttonNext);
		b1.setVisibility(View.VISIBLE);
		*/
		if(idInRoute != 0) {
			
			idInRoute--;
			
			int source = cr.getRoute(idInRoute).getSourceId();
			int destination = cr.getRoute(idInRoute).getDestinationId();
			
			TextView t = (TextView) findViewById(R.id.landmarkName);
			t.setText("De " + Graph.getInstance().getLandmark(source - 1).getName()
					+ " a " + Graph.getInstance().getLandmark(destination - 1).getName());
			System.out.println("Setou o texto acima da imagem");

			ImageView i = (ImageView) findViewById(R.id.landmarkImage);
			i.setImageResource(cr.getRoute(idInRoute).getMap());
			System.out.println("Setou a imagem");
			
			TextView t2 = (TextView) findViewById(R.id.buttonTittle);
			t2.setText(Graph.getInstance().getRoute(source, destination).getInstruction());
			System.out.println("Setou o texto abaixo da imagem");
			
		}/* else {
			Button b2 = (Button) findViewById(R.id.buttonPrevious);
			b2.setVisibility(View.INVISIBLE);
		}*/
	}
	
	public void gotoNext(View v){
		/*Button b1 = (Button) findViewById(R.id.buttonPrevious);
		b1.setVisibility(View.VISIBLE);
		*/
		if(idInRoute != cr.getCompleteRoute().size() - 1) {
			
			idInRoute++;
			
			int source = cr.getRoute(idInRoute).getSourceId();
			int destination = cr.getRoute(idInRoute).getDestinationId();
			
			TextView t = (TextView) findViewById(R.id.landmarkName);
			t.setText("De " + Graph.getInstance().getLandmark(source - 1).getName()
					+ " a " + Graph.getInstance().getLandmark(destination - 1).getName());
			System.out.println("Setou o texto acima da imagem");

			ImageView i = (ImageView) findViewById(R.id.landmarkImage);
			i.setImageResource(cr.getRoute(idInRoute).getMap());
			System.out.println("Setou a imagem");
			
			TextView t2 = (TextView) findViewById(R.id.buttonTittle);
			t2.setText(Graph.getInstance().getRoute(source, destination).getInstruction());
			System.out.println("Setou o texto abaixo da imagem");
			
		}
		/*
		if(idInRoute != cr.getCompleteRoute().size() - 2) {
			Button b2 = (Button) findViewById(R.id.buttonNext);
			b2.setVisibility(View.INVISIBLE);
		}*/
	}
}
