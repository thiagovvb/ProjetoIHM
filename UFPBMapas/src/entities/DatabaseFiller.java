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
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm() {
		DataHandler dh = new DataHandler(context);
		int id = 0;
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.central_de_aulas, "Conjunto de 6 blocos de salas.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Centro de Tecnologia da UFPB", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ciências Sociais Aplicadas", R.drawable.ccsa, "Centro que oferece diversos cursos de áreas humanas, incluindo adminstração.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educação", R.drawable.ce, "", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ciências Humanas, Letras e Artes", R.drawable.cchla, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ciências das Religião", 1);
		dh.insertLandmark(++id, "Centro de Vivência", "Centro de Vivência", R.drawable.centro_de_vivencia, "Local de confraternização da UFPB", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.biblio_central, "Maior biblioteca da UFPB.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ciências Exatas e da Natureza", R.drawable.ccen, "Inclui cursos de Biologia, Estatística, Matemática e Física", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.reitoria, "Reitoria da UFPB", 1);
		dh.insertLandmark(++id, "Setor Esportivo", "Setor Esportivo", R.drawable.sem_imagem, "Cursos de Educação Física da UFPB", 1);
		dh.insertLandmark(++id, "CCS", "Centro de Ciências da Saúde", R.drawable.sem_imagem, "Inclui cursos de Medicina, Enfermagem e Farmácia", 1);
		dh.insertLandmark(++id, "HU", "Hospital Universitário", R.drawable.sem_imagem, "Hospital da UFPB", 1);
		dh.insertLandmark(++id, "Residência Universitária", "Residência Universitária", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Setor de Vigilância", "Setor de Vigilância", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CODISMA", "CODISMA", R.drawable.codisma, "", 1);
		dh.insertLandmark(++id, "DCE", "DCE (Sede Administrativa)", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CI", "Centro de Informática", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econômica Federal", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.ufpb_virual, "", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CPER", "Centro de Pesquisas de Energias Renováveis", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunicação, Turismo e Artes", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ciências Jurídicas", R.drawable.ccj, "", 1);
		dh.insertLandmark(++id, "Lando", "Lanchonete do Lando", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEB", "Cantina Elefante Branco", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Gole da Fruta", "Gole da Fruta", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "LES", "Laboratório de Energia Solar", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Baratão", "Depósito O Baratão", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "TV UFPB", "TV UFPB", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Prefeitura Universitária", "Prefeitura Universitária", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "NTI", "NTI UFPB", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Economia", "Economia", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Concert Hall", "Concert Hall Radegundis Feitosa", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "Rotatória ao lado do CCHLA", "Rotatória ao lado do CCHLA", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotatória por trás da Reitoria", "Rotatória por trás da Reitoria", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotatória próxima ao Setor Esportivo", "Rotatória próxima ao Setor Esportivo", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Rotatória na Entrada do CT", "Rotatória na Entrada do CT", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Bifurcação para Residência ou Hospital", "Bifurcação para Residência ou Hospital", R.drawable.sem_imagem, "", 0);
		dh.insertLandmark(++id, "Bifurcação para Hospital", "Bifurcação para Hospital", R.drawable.sem_imagem, "", 0);
	}
	
	public void databaseFillerRoute() {
		DBRoutes.getInstance().addRoute(1, 1, 7, R.drawable.rota_1_7, null, 1);
		DBRoutes.getInstance().addRoute(2, 8, 19, R.drawable.rota_19_8, null, 1);
	}

}
