package entities;

import com.example.ufpbmaps.R;

public class DatabaseFiller {

	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public static void databaseFillerLdm() {
		DBLandmark.getInstance().addLdm(1, "CA", "Central de Aulas", R.drawable.central_de_aulas, "Conjunto de 6 blocos de salas.");
		DBLandmark.getInstance().addLdm(2, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Centro de Tecnologia da UFPB");
		DBLandmark.getInstance().addLdm(3, "CCSA", "Centro de Ci�ncias Sociais Aplicadas", R.drawable.ccsa, "Centro que oferece diversos cursos de �reas humanas, incluindo adminstra��o.");
		DBLandmark.getInstance().addLdm(4, "CE", "Centro de Educa��o", R.drawable.ce, "");
		DBLandmark.getInstance().addLdm(5, "CCHLA", "Centro de Ci�ncias Humanas, Letras e Artes", R.drawable.cchla, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ci�ncias das Religi�o");
		DBLandmark.getInstance().addLdm(6, "Centro de Viv�ncia", "Centro de Viv�ncia", R.drawable.centro_de_vivencia, "Local de confraterniza��o da UFPB");
		DBLandmark.getInstance().addLdm(7, "Biblioteca Central", "Biblioteca Central", R.drawable.biblio_central, "Maior biblioteca da UFPB.");
		DBLandmark.getInstance().addLdm(8, "CCEN", "Centro de Ci�ncias Exatas e da Natureza", R.drawable.ccen, "Inclui cursos de Biologia, Estat�stica, Matem�tica e F�sica");
		DBLandmark.getInstance().addLdm(9, "Reitoria", "Reitoria da UFPB", R.drawable.reitoria, "Reitoria da UFPB");
		DBLandmark.getInstance().addLdm(10, "Setor Esportivo", "Setor Esportivo", R.drawable.sem_imagem, "Cursos de Educa��o F�sica da UFPB");
		DBLandmark.getInstance().addLdm(11, "CCS", "Centro de Ci�ncias da Sa�de", R.drawable.sem_imagem, "Inclui cursos de Medicina, Enfermagem e Farm�cia");
		DBLandmark.getInstance().addLdm(12, "HU", "Hospital Universit�rio", R.drawable.sem_imagem, "Hospital da UFPB");
		DBLandmark.getInstance().addLdm(13, "Resid�ncia Universit�ria", "Resid�ncia Universit�ria", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(14, "Setor de Vigil�ncia", "Setor de Vigil�ncia", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(15, "CODISMA", "CODISMA", R.drawable.codisma, "");
		DBLandmark.getInstance().addLdm(16, "DCE", "DCE (Sede Administrativa)", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(17, "CI", "Centro de Inform�tica", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(18, "Caixa", "Caixa Econ�mica Federal", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(19, "UFPB Virtual", "UFPB Virtual", R.drawable.ufpb_virual, "");
		DBLandmark.getInstance().addLdm(20, "BB", "Banco do Brasil", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(21, "CPER", "Centro de Pesquisas de Energias Renov�veis", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(22, "CCTA", "Centro de Comunica��o, Turismo e Artes", R.drawable.sem_imagem, "");
		DBLandmark.getInstance().addLdm(23, "CCJ", "Centro de Ci�ncias Jur�dicas", R.drawable.ccj, "");
	}
	
	public static void databaseFillerRoute() {
		DBRoutes.getInstance().addRoute(1, 1, 7, R.drawable.rota_1_7, null, 1);
		DBRoutes.getInstance().addRoute(2, 8, 19, R.drawable.rota_19_8, null, 1);
	}

}
