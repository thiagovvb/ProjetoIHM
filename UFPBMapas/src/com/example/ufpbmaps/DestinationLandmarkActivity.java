package com.example.ufpbmaps;

import java.util.ArrayList;
import java.util.StringTokenizer;

import dbclasses.DataHandler;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import entities.CompleteRoute;
import entities.Landmark;

public class DestinationLandmarkActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		DataHandler dh = new DataHandler(getApplicationContext());
		dh.open();
		
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
		destination.setOnClickListener(lerQR);
		l1.addView(destination);
		
		ArrayList<Landmark> al = dh.fetchLandmark();
		
		for(int j = 1; j <= al.size(); j++){
			if(j != landmark.getId()){
				destination = new Button(this);
				destination.setId(j);
				destination.setText(al.get(j-1).getName());
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
			if(v.getId() < source.getId()){
				destination = dh.fetchLandmark(v.getId());
			} else {
				destination = dh.fetchLandmark(v.getId() + 2);
			}
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
	
	/*
	 * 
	 * INÍCIO: TRATAMENTO BOTÃO QRCODE
	 * 
	 */
	
	protected static final String ZXING_MARKET = "market://search?q=pname:com.google.zxing.client.android";
	protected static final String ZXING_DIRECT = "https://zxing.googlecode.com/files/BarcodeScanner3.1.apk";
	public String QRCode = " ";

	/**
	 * Método que será chamado no clique do botão
	 * 
	 * @param view
	 */
	public OnClickListener lerQR = new OnClickListener() {		
		public void onClick(View v) {
			// Criamos um Intent com o caminho aplicativo que irá ler o QR code
			Intent intent = new Intent("com.google.zxing.client.android.SCAN");
			intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
			// Passamos o parametro "SCAN_MODE" para ler somente códigos no formato QR
			try {
				startActivityForResult(intent, 0);
			} catch (ActivityNotFoundException e) {
				mostrarMensagem();
			}
		}
	};

	/**
	 * Pergnta se o usuário deseja instalar o ZXing
	 */
	private void mostrarMensagem() {
		new AlertDialog.Builder(this)
				.setTitle("Instalar barcode scanner?")
				.setMessage(
						"Para escanear QR code você precisa instalar o ZXing barcode scanner.")
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setPositiveButton("Instalar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int whichButton) {
								Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ZXING_MARKET));
								try {
									startActivity(intent);
								} catch (ActivityNotFoundException e) {
									//Se não tiver o Play Store
									intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ZXING_DIRECT));
									startActivity(intent);
								}
							}
						}).setNegativeButton("Cancelar", null).show();
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		if (requestCode == 0 && resultCode == Activity.RESULT_OK) {
			QRCode = intent.getStringExtra("SCAN_RESULT");
			
			DataHandler dh = new DataHandler(getApplicationContext());
			dh.open();

			int key = Integer.parseInt(accessCode());
			Landmark landmark = dh.fetchLandmark(key);
			Intent intent2 = new Intent(this, LandmarkActivity.class);
			intent2.putExtra("Landmark", landmark);
			
			dh.close();
			
			startActivity(intent2);			
		}
	}
	
	public String accessCode(){		 
		StringTokenizer tokens = new StringTokenizer(QRCode);
		tokens.nextToken();
		return (String) tokens.nextToken();
	}
	
}
