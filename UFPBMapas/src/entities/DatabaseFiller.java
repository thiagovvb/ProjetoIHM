package entities;

import android.widget.ImageView;

public class DatabaseFiller {

	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public static void databaseFillerLdm() {
		ImageView p = null;
		DBLandmark.getInstance().addLdm(1, "Central de Aulas - CA", p, "Conjunto de 6 blocos de salas.");
		DBLandmark.getInstance().addLdm(2, "Centro de Tecnologia - CT", p, "Centro de Tecnologia da UFPB");
		DBLandmark.getInstance().addLdm(3, "Centro de Ci�ncias Sociais Aplicadas - CCSA", p, "Centro que oferece diversos cursos de �reas humanas, incluindo adminstra��o.");
		DBLandmark.getInstance().addLdm(4, "Centro de Educa��o - CE", p, "");
		DBLandmark.getInstance().addLdm(5, "Centro de Ci�ncias Humanas, Letras e Artes - CCHLA", p, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ci�ncias das Religi�o");
		DBLandmark.getInstance().addLdm(6, "Centro de Viv�ncia", p, "Local de confraterniza��o da UFPB");
		DBLandmark.getInstance().addLdm(7, "Biblioteca Central", p, "Maior biblioteca da UFPB.");
		DBLandmark.getInstance().addLdm(8, "Centro de Ci�ncias Exatas e da Natureza - CCEN", p, "Inclui cursos de Biologia, Estat�stica, Matem�tica e F�sica");
		DBLandmark.getInstance().addLdm(9, "Reitoria", p, "Reitoria da UFPB");
		DBLandmark.getInstance().addLdm(10, "Setor Esportivo", p, "Cursos de Educa��o F�sica da UFPB");
		DBLandmark.getInstance().addLdm(11, "Centro de Ci�ncias da Sa�de - CCS", p, "Inclui cursos de Medicina, Enfermagem e Farm�cia");
		DBLandmark.getInstance().addLdm(12, "Hospital Universit�rio - HU", p, "Hospital da UFPB");
		DBLandmark.getInstance().addLdm(13, "Resid�ncia Universit�ria", p, "");
		DBLandmark.getInstance().addLdm(14, "Setor de Vigil�ncia", p, "");
		DBLandmark.getInstance().addLdm(15, "CODISMA", p, "");
		DBLandmark.getInstance().addLdm(16, "DCE (Sede Administrativa)", p, "");
		DBLandmark.getInstance().addLdm(17, "Centro de Inform�tica - CI", p, "");
		DBLandmark.getInstance().addLdm(18, "Caixa Econ�mica Federal", p, "");
		DBLandmark.getInstance().addLdm(19, "UFPB Virtual", p, "");
		DBLandmark.getInstance().addLdm(20, "Banco do Brasil", p, "");
		DBLandmark.getInstance().addLdm(21, "Centro de Pesquisas de Energias Renov�veis", p, "");
		DBLandmark.getInstance().addLdm(22, "Centro de Comunica��o, Turismo e Artes", p, "");
		DBLandmark.getInstance().addLdm(23, "Centro de Ci�ncias Jur�dicas", p, "");
	}
	
	public static void databaseFillerRoute() {

	}

}
