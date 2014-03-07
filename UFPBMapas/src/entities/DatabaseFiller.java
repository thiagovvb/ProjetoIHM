package entities;

import android.widget.ImageView;

public class DatabaseFiller {

	/**
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public static void databaseFillerLdm() {
		ImageView p = null;
		DBLandmark.getInstance().addLdm(1, "Central de Aulas - CA", p, "Conjunto de 6 blocos de salas.");
		DBLandmark.getInstance().addLdm(2, "Centro de Tecnologia - CT", p, "Centro de Tecnologia da UFPB");
		DBLandmark.getInstance().addLdm(3, "Centro de Ciências Sociais Aplicadas - CCSA", p, "Centro que oferece diversos cursos de áreas humanas, incluindo adminstração.");
		DBLandmark.getInstance().addLdm(4, "Centro de Educação - CE", p, "");
		DBLandmark.getInstance().addLdm(5, "Centro de Ciências Humanas, Letras e Artes - CCHLA", p, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ciências das Religião");
		DBLandmark.getInstance().addLdm(6, "Centro de Vivência", p, "Local de confraternização da UFPB");
		DBLandmark.getInstance().addLdm(7, "Biblioteca Central", p, "Maior biblioteca da UFPB.");
		DBLandmark.getInstance().addLdm(8, "Centro de Ciências Exatas e da Natureza - CCEN", p, "Inclui cursos de Biologia, Estatística, Matemática e Física");
		DBLandmark.getInstance().addLdm(9, "Reitoria", p, "Reitoria da UFPB");
		DBLandmark.getInstance().addLdm(10, "Setor Esportivo", p, "Cursos de Educação Física da UFPB");
		DBLandmark.getInstance().addLdm(11, "Centro de Ciências da Saúde - CCS", p, "Inclui cursos de Medicina, Enfermagem e Farmácia");
		DBLandmark.getInstance().addLdm(12, "Hospital Universitário - HU", p, "Hospital da UFPB");
		DBLandmark.getInstance().addLdm(13, "Residência Universitária", p, "");
		DBLandmark.getInstance().addLdm(14, "Setor de Vigilância", p, "");
		DBLandmark.getInstance().addLdm(15, "CODISMA", p, "");
		DBLandmark.getInstance().addLdm(16, "DCE (Sede Administrativa)", p, "");
		DBLandmark.getInstance().addLdm(17, "Centro de Informática - CI", p, "");
		DBLandmark.getInstance().addLdm(18, "Caixa Econômica Federal", p, "");
		DBLandmark.getInstance().addLdm(19, "UFPB Virtual", p, "");
		DBLandmark.getInstance().addLdm(20, "Banco do Brasil", p, "");
		DBLandmark.getInstance().addLdm(21, "Centro de Pesquisas de Energias Renováveis", p, "");
		DBLandmark.getInstance().addLdm(22, "Centro de Comunicação, Turismo e Artes", p, "");
		DBLandmark.getInstance().addLdm(23, "Centro de Ciências Jurídicas", p, "");
	}
	
	public static void databaseFillerRoute() {

	}

}
