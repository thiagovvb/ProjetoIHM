package entities;

import java.util.StringTokenizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import com.example.ufpbmaps.LandmarkActivity;
import com.example.ufpbmaps.MapActivity;

public class QRCode {

	protected static final String ZXING_MARKET = "market://search?q=pname:com.google.zxing.client.android";
	protected static final String ZXING_DIRECT = "https://zxing.googlecode.com/files/BarcodeScanner3.1.apk";
	public String QRCode = "";

	/**
	 * Método que será chamado no clique do botão
	 * 
	 * @param view
	 */
	public void lerQR(View view) {		
		// Criamos um Intent com o caminho aplicativo que irá ler o QR code
		Intent intent = new Intent("com.google.zxing.client.android.SCAN");
		// Passamos o parametro "SCAN_MODE" para ler somente códigos no formato
		// QR
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
			QRCode = intent.getStringExtra("SCAN_RESULT");

		}
		int key = Integer.parseInt(accessCode());
		Landmark landmark = DBLandmark.getInstance().getLdm(key);
		Intent intent2 = new Intent(this, LandmarkActivity.class);
		intent2.putExtra("Landmark", landmark);
		startActivity(intent2);
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
}
