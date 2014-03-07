package entities;

import com.example.ufpbmaps.R;

public class DatabaseFiller {

	/**
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public static void databaseFillerLdm() {
		DBLandmark.getInstance().addLdm(1, "Central de Aulas - CA", R.drawable.central_de_aulas, "Conjunto de 6 blocos de salas.");
		DBLandmark.getInstance().addLdm(2, "Centro de Tecnologia - CT", R.drawable.central_de_aulas, "Centro de Tecnologia da UFPB");
		DBLandmark.getInstance().addLdm(3, "Centro de Ciências Sociais Aplicadas - CCSA", R.drawable.central_de_aulas, "Centro que oferece diversos cursos de áreas humanas, incluindo adminstração.");
		DBLandmark.getInstance().addLdm(4, "Centro de Educação - CE", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(5, "Centro de Ciências Humanas, Letras e Artes - CCHLA", R.drawable.central_de_aulas, "Centro que oferece diversos cursos, entre eles, Pedagogia, Psicopedagogia e Ciências das Religião");
		DBLandmark.getInstance().addLdm(6, "Centro de Vivência", R.drawable.central_de_aulas, "Local de confraternização da UFPB");
		DBLandmark.getInstance().addLdm(7, "Biblioteca Central", R.drawable.central_de_aulas, "Maior biblioteca da UFPB.");
		DBLandmark.getInstance().addLdm(8, "Centro de Ciências Exatas e da Natureza - CCEN", R.drawable.central_de_aulas, "Inclui cursos de Biologia, Estatística, Matemática e Física");
		DBLandmark.getInstance().addLdm(9, "Reitoria", R.drawable.central_de_aulas, "Reitoria da UFPB");
		DBLandmark.getInstance().addLdm(10, "Setor Esportivo", R.drawable.central_de_aulas, "Cursos de Educação Física da UFPB");
		DBLandmark.getInstance().addLdm(11, "Centro de Ciências da Saúde - CCS", R.drawable.central_de_aulas, "Inclui cursos de Medicina, Enfermagem e Farmácia");
		DBLandmark.getInstance().addLdm(12, "Hospital Universitário - HU", R.drawable.central_de_aulas, "Hospital da UFPB");
		DBLandmark.getInstance().addLdm(13, "Residência Universitária", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(14, "Setor de Vigilância", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(15, "CODISMA", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(16, "DCE (Sede Administrativa)", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(17, "Centro de Informática - CI", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(18, "Caixa Econômica Federal", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(19, "UFPB Virtual", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(20, "Banco do Brasil", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(21, "Centro de Pesquisas de Energias Renováveis", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(22, "Centro de Comunicação, Turismo e Artes", R.drawable.central_de_aulas, "");
		DBLandmark.getInstance().addLdm(23, "Centro de Ciências Jurídicas", R.drawable.central_de_aulas, "");
	}
	
	public static void databaseFillerRoute() {

	}

}
