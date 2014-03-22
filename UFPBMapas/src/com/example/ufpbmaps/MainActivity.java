package com.example.ufpbmaps;

import java.util.StringTokenizer;

import entities.DBLandmark;
import entities.DatabaseFiller;
import entities.Landmark;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends Activity {
	private static boolean dbfilled = false;
	Button btnClosePopup;
	Button btnCreatePopup;
	Button btnNextPopup;
	private PopupWindow popupWindow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnCreatePopup = (Button) findViewById(R.id.eventButton); 
		btnCreatePopup.setOnClickListener(new OnClickListener() {			
			@Override 
			public void onClick(View v) { 
				// TODO Auto-generated method stub 
				initiatePopupWindow(); 
			} 
		});
		if(!dbfilled) {
			DatabaseFiller.databaseFillerLdm();
			DatabaseFiller.databaseFillerRoute();
			dbfilled = true;
		}
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
	 * INÍCIO: TRATAMENTO BOTÃO DESTINO
	 * 
	 */
	public void executeDestination(View view){
		  Intent intent = new Intent(this, DestinationActivity.class);
		  startActivity(intent);
	}
	
	/**
	 * 
	 * INICIO: TRATAMENTO BOTÃO EVENTO
	 * 
	 */

	private void initiatePopupWindow() { 
		try { 
			// We need to get the instance of the LayoutInflater 
			LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
			View layout = inflater.inflate(R.layout.activity_eventpopup, (ViewGroup) findViewById(R.id.eventPopupLinearLayout)); 
			popupWindow = new PopupWindow(layout, 350, 350, true); 
			popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);
			
			btnNextPopup = (Button) layout.findViewById(R.id.eventPopupQRCodeButton);
			btnNextPopup.setOnClickListener(qrcode_button_click_listener);
			
			btnClosePopup = (Button) layout.findViewById(R.id.eventPopupCloseButton);
			btnClosePopup.setOnClickListener(close_button_click_listener);

		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}

	private OnClickListener qrcode_button_click_listener = new OnClickListener() { 
		public void onClick(View v) { 
			//ABRIR QR AQUI TAMBÉM POR ENQUANTO ESTÁ FECHANDO
			popupWindow.dismiss();
		} 
	};
	
	private OnClickListener close_button_click_listener = new OnClickListener() { 
		public void onClick(View v) { 
			popupWindow.dismiss();
		} 
	};
}
