package entities;

import android.content.Context;

import com.example.ufpbmaps.R;

import dbclasses.DataHandler;

public class DatabaseFiller {

	private Context context;
	private static DatabaseFiller uniqueInstance = null;
	
	private DatabaseFiller(Context context) {
		this.context = context;
	}
	
	public DatabaseFiller getInstance(Context context) {
		if(uniqueInstance == null)
			return new DatabaseFiller(context);
		return uniqueInstance;
	}
	
	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm() {
		DataHandler dh = new DataHandler(context);
		int id = 0;
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.central_de_aulas, "Conjunto de 6 blocos de salas.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Centro de Tecnologia da UFPB", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ci�ncias Sociais Aplicadas", R.drawable.ccsa, "Centro que oferece diversos cursos de �reas humanas, incluindo adminstra��o.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educa��o", R.drawable.ce, "", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ci�ncias Humanas, Letras e Artes", R.drawable.cchla, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ci�ncias das Religi�o", 1);
		dh.insertLandmark(++id, "Centro de Viv�ncia", "Centro de Viv�ncia", R.drawable.centro_de_vivencia, "Local de confraterniza��o da UFPB", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.biblio_central, "Maior biblioteca da UFPB.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ci�ncias Exatas e da Natureza", R.drawable.ccen, "Inclui cursos de Biologia, Estat�stica, Matem�tica e F�sica", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.reitoria, "Reitoria da UFPB", 1);
		dh.insertLandmark(++id, "Setor Esportivo", "Setor Esportivo", R.drawable.sem_imagem, "Cursos de Educa��o F�sica da UFPB", 1);
		dh.insertLandmark(++id, "CCS", "Centro de Ci�ncias da Sa�de", R.drawable.sem_imagem, "Inclui cursos de Medicina, Enfermagem e Farm�cia", 1);
		dh.insertLandmark(++id, "HU", "Hospital Universit�rio", R.drawable.sem_imagem, "Hospital da UFPB", 1);
		dh.insertLandmark(++id, "Resid�ncia Universit�ria", "Resid�ncia Universit�ria", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Setor de Vigil�ncia", "Setor de Vigil�ncia", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CODISMA", "CODISMA", R.drawable.codisma, "", 1);
		dh.insertLandmark(++id, "DCE", "DCE (Sede Administrativa)", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CI", "Centro de Inform�tica", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econ�mica Federal", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.ufpb_virual, "", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CPER", "Centro de Pesquisas de Energias Renov�veis", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunica��o, Turismo e Artes", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ci�ncias Jur�dicas", R.drawable.ccj, "", 1);
		dh.insertLandmark(++id, "Lando", "Lanchonete do Lando", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEB", "Cantina Elefante Branco", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Gole da Fruta", "Gole da Fruta", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "LES", "Laborat�rio de Energia Solar", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Barat�o", "Dep�sito O Barat�o", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "TV UFPB", "TV UFPB", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Prefeitura Universit�ria", "Prefeitura Universit�ria", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "NTI", "NTI UFPB", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Economia", "Economia", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Concert Hall", "Concert Hall Radegundis Feitosa", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Rotat�ria ao lado do CCHLA", "Rotat�ria ao lado do CCHLA", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotat�ria por tr�s da Reitoria", "Rotat�ria por tr�s da Reitoria", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotat�ria pr�xima ao Setor Esportivo", "Rotat�ria pr�xima ao Setor Esportivo", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotat�ria na Entrada do CT", "Rotat�ria na Entrada do CT", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Bifurca��o para Resid�ncia ou Hospital", "Bifurca��o para Resid�ncia ou Hospital", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Bifurca��o para Hospital", "Bifurca��o para Hospital", R.drawable.sem_imagem, "", 0);
	}
	
	public void databaseFillerRoute() {
		DBRoutes.getInstance().addRoute(1, 1, 7, R.drawable.rota_1_7, null, 1);
		DBRoutes.getInstance().addRoute(2, 8, 19, R.drawable.rota_19_8, null, 1);
	}

}
