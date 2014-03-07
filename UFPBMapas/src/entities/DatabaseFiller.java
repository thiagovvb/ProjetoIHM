package entities;

import com.example.ufpbmaps.R;

public class DatabaseFiller {

	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public static void databaseFillerLdm() {
		DBLandmark.getInstance().addLdm(1, "Central de Aulas - CA", R.drawable.central_de_aulas, "Conjunto de 6 blocos de salas.");
		DBLandmark.getInstance().addLdm(2, "Centro de Tecnologia - CT", R.drawable.sem_imagem, "Centro de Tecnologia da UFPB");
		DBLandmark.getInstance().addLdm(3, "Centro de Ci�ncias Sociais Aplicadas - CCSA", R.drawable.sem_imagem, "Centro que oferece diversos cursos de �reas humanas, incluindo adminstra��o.");
		DBLandmark.getInstance().addLdm(4, "Centro de Educa��o - CE", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(5, "Centro de Ci�ncias Humanas, Letras e Artes - CCHLA", R.drawable.sem_imagem, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ci�ncias das Religi�o");
		DBLandmark.getInstance().addLdm(6, "Centro de Viv�ncia", R.drawable.sem_imagem, "Local de confraterniza��o da UFPB");
		DBLandmark.getInstance().addLdm(7, "Biblioteca Central", R.drawable.biblio_central, "Maior biblioteca da UFPB.");
		DBLandmark.getInstance().addLdm(8, "Centro de Ci�ncias Exatas e da Natureza - CCEN", R.drawable.ccen, "Inclui cursos de Biologia, Estat�stica, Matem�tica e F�sica");
		DBLandmark.getInstance().addLdm(9, "Reitoria", R.drawable.reitoria, "Reitoria da UFPB");
		DBLandmark.getInstance().addLdm(10, "Setor Esportivo", R.drawable.sem_imagem, "Cursos de Educa��o F�sica da UFPB");
		DBLandmark.getInstance().addLdm(11, "Centro de Ci�ncias da Sa�de - CCS", R.drawable.sem_imagem, "Inclui cursos de Medicina, Enfermagem e Farm�cia");
		DBLandmark.getInstance().addLdm(12, "Hospital Universit�rio - HU", R.drawable.sem_imagem, "Hospital da UFPB");
		DBLandmark.getInstance().addLdm(13, "Resid�ncia Universit�ria", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(14, "Setor de Vigil�ncia", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(15, "CODISMA", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(16, "DCE (Sede Administrativa)", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(17, "Centro de Inform�tica - CI", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(18, "Caixa Econ�mica Federal", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(19, "UFPB Virtual", R.drawable.ufpb_virual, "");
		DBLandmark.getInstance().addLdm(20, "Banco do Brasil", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(21, "Centro de Pesquisas de Energias Renov�veis", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(22, "Centro de Comunica��o, Turismo e Artes", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(23, "Centro de Ci�ncias Jur�dicas", R.drawable.sem_imagem, "");
	}
	
	public static void databaseFillerRoute() {
		DBRoutes.getInstance().addRoute(1, 1, 7, R.drawable.rota_1_7, null);
		DBRoutes.getInstance().addRoute(2, 8, 19, R.drawable.rota_19_8, null);
	}

}
