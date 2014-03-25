package com.example.ufpbmaps;

import java.util.StringTokenizer;

import dbclasses.DataHandler;
import dbclasses.LandmarkEntity;
import dbclasses.RouteEntity;
import entities.DatabaseFiller;
import entities.Landmark;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private static boolean dbfilled = false;
	Button btnClosePopup;
	Button btnCreatePopup;
	Button btnNextPopup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		DataHandler h = new DataHandler(getApplicationContext());
		h.open();
		//h.clearTable(LandmarkEntity.TABLE_NAME);
		//h.clearTable(RouteEntity.TABLE_NAME);
		
		 
		/*h.insertLandmark(0, "UFPB", "Universidade Federal da Paraiba", 5, "ah oi", 1);
		h.insertLandmark(1, "UFPE", "Universidade Federal de Pernambuco", 3, "ah oi",1);
		h.insertLandmark(2, "UFCG", "Universidade Federal de Campina Grande", 2, "ah oi",0);
		Landmark r1 = h.fetchLandmark(0);
		Landmark r2 = h.fetchLandmark(1);
		Landmark r3 = h.fetchLandmark(2);
		
		ArrayList<Landmark> landmarks = h.fetchLandmark();
		ArrayList<Landmark> relevantLandmarks = h.fetchRelevantLandmarks();
		
		System.out.println("Nome = " + r1.getName());
		System.out.println("Nome = " + r2.getName());
		System.out.println("Nome = " + r3.getName());
		System.out.println("Total = " + landmarks.size());
		System.out.println("Relevant total = " + relevantLandmarks.size());
		
		
		h.insertRoute(0, 0, 1, 3, 6, "Siga em frente");
		Route r = h.fetchRouteByDest(1).get(0);
		System.out.println("Instrucao da rota por dest = " + r.getInstruction());*/
		
		System.out.println("dbfilled = " + dbfilled + " isFilled" + h.isFilled());
		
		if(!dbfilled && !h.isFilled()) {
			DatabaseFiller.getInstance().databaseFillerLdm(h);
			DatabaseFiller.getInstance().databaseFillerRoute(h);
			dbfilled = true;
		}
		
		h.close();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public MainActivity() {
		// TODO Auto-generated constructor stub
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
	public void lerQR(View view) {		
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
			
			DataHandler db = new DataHandler(getApplicationContext());
			db.open();
			
			QRCode = intent.getStringExtra("SCAN_RESULT");

			int key = Integer.parseInt(accessCode());
			Landmark landmark = db.fetchLandmark(key);
			Intent intent2 = new Intent(this, LandmarkActivity.class);
			intent2.putExtra("Landmark", landmark);
			
			db.close();
			
			startActivity(intent2);			
		}
	}
	
	public String accessCode(){		 
		StringTokenizer tokens = new StringTokenizer(QRCode);
		tokens.nextToken();
		return (String) tokens.nextToken();
	}
	
	public void showMapScreen(View view){
		  Intent intent = new Intent(this, MapActivity.class);
		  startActivity(intent);		
	}


	
	/*
	 * 
	 * INÍCIO: TRATAMENTO BOTÃO DESTINO
	 * 
	 */
	public void executeDestination(View view){
		  Intent intent = new Intent(this, DestinationActivity.class);
		  startActivity(intent);
	}
}
