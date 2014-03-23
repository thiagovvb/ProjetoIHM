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
	
	public static DatabaseFiller getInstance(Context context) {
		if(uniqueInstance == null)
			return new DatabaseFiller(context);
		return uniqueInstance;
	}
	
	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		//Landmarks Relevantes
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.ca, "Conjunto com 8 blocos de salas de aula.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Arquitetura, Engenharia de Alimentos, Engenharia de Materiais, Engenharia de Produ��o, Engenharia Civil e " +
				"Ambiental, Engenharia Mec�nica e Engenharia Qu�mica.", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ci�ncias Sociais Aplicadas", R.drawable.ccsa, "Neste centro est�o os departamentos de " +
				"Administra��o, Ci�ncias da Informa��o, Economia, Finan�as e Contabillidade, e de Rela��es Internacionais.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educa��o", R.drawable.ce, "Neste centro est�o os departamentos de " +
				"Fundamenta��o da Educa��o, Habilita��o Pedag�gica, Metodologia da Educa��o, Psicopedagogia e Ci�ncias das " +
				"Religi�es.", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ci�ncias Humanas, Letras e Artes", R.drawable.cchla, "Neste centro est�o os departamentos de " +
				"Ci�ncias Sociais, Filosofia, Hist�ria, Letras Cl�ssicas e Vern�culas, Letras Estrangeiras Modernas, Midias Digitais, Psicologia " +
				"e Servi�o Social.", 1);
		dh.insertLandmark(++id, "Centro de Viv�ncia", "Centro de Viv�ncia", R.drawable.centro_de_vivencia, "Neste local pode-se adicionar cr�ditos ao passe legal, " +
				"e solicitar sua carteira de estudante. ", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.biblio_central, "Principal biblioteca da Universidade Federal da Para�ba.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ci�ncias Exatas e da Natureza", R.drawable.biblio_ccen, "Neste centro est�o os departamentos de " +
				"Biologia Molecular, Geoci�ncias, Sistematica e Ecologia, Estat�stica, F�sica, Matem�tica e Quimica. Bem como o NEPREMAR.", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.reitoria, "Central Administrativa da Universidade Federal da Para�ba.", 1);
		dh.insertLandmark(++id, "Setor Esportivo", "Setor Esportivo", R.drawable.sem_imagem, "�rea destina ao cursos de Licenciatura em Educa��o F�sica.", 1);
		dh.insertLandmark(++id, "CCS", "Centro de Ci�ncias da Sa�de", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Ci�ncias Farmaceuticas, Cl�nica e Odontologia Social, Educa��o F�sica, Enfermagem Cl�nica, Fisiologia e Patologia, Enfermagem, Sa�de P�blica " +
				"e Psiquiatria, Fisioterapia, Fonoaudiologia, Nutri��o, Morfologia, Odontologia Restauradora, Terapia Ocupacional. Bem como a Escola T�cnica de Sa�de.", 1);
		dh.insertLandmark(++id, "HULW", "Hospital Universit�rio Lauro Wanderley", R.drawable.sem_imagem, "O HULW oferece as especializa��es Latu-Sensu em Resid�ncia " +
				"M�dica nas �reas de Anestesiologia, Cl�nica m�dica, Cirurgia Geral, Ginecologia e Obstetr�cia, Pediatria, Oftalmologia e Terapia Intensiva e Doen�as " +
				"Infecto-Contagiosas al�m de disponibilizar campo de pr�tica na profissionaliza��o dos cursos de Medicina, Enfermagem, Fisioterapia, Nutri��o, Farm�cia, " +
				"Odontologia, Servi�o Social, Psicologia, Educa��o F�sica, Comunica��o Social entre outros.", 1);
		dh.insertLandmark(++id, "Resid�ncia Universit�ria", "Resid�ncia Universit�ria", R.drawable.sem_imagem, "Condom�nio onde residem os estudantes que n�o possuem fam�lia " +
				"na cidade de Jo�o Pessoa.", 1);
		dh.insertLandmark(++id, "Setor de Vigil�ncia", "Setor de Vigil�ncia", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "CODISMA", "Cooperativa Cultural Universit�ria da Para�ba Ltda", R.drawable.codisma, " ", 1);
		dh.insertLandmark(++id, "Resturante Universit�rio", "Resturante Universit�rio", R.drawable.sem_imagem, "Local designado � alimenta��o dos alunos.", 1);
		dh.insertLandmark(++id, "CI", "Centro de Inform�tica", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Computa��o Cient�fica, Inform�tica e Sistema de Computa��o.", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econ�mica Federal", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.ufpb_virtual, "Local destinado � ger�ncia dos cursos � dist�ncia.", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEAR", "Centro de Energias e Alternativas Renov�veis", R.drawable.sem_imagem, "Neste centro est�o os departamentos " +
				"de Energia El�trica e Energias Renov�veis.", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunica��o, Turismo e Artes", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Artes C�nicas, Artes Visuais, Comunica��o e Turismo, Educa��o Musical e M�sica", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ci�ncias Jur�dicas", R.drawable.ccj, "Neste centro est�o os departamentos de " +
				"Direito Privado, Direito P�blico e Direito Processual e Pr�tica Jur�dica.", 1);
		dh.insertLandmark(++id, "Lando", "Lanchonete do Lando", R.drawable.sem_imagem, "Lanchonete pr�xima ao departamento de F�sica.", 1);
		dh.insertLandmark(++id, "CEB", "Cantina Elefante Branco", R.drawable.sem_imagem, "Lanchonete pr�xima ao departamento de Odontologia.", 1);
		dh.insertLandmark(++id, "Gole da Fruta", "Gole da Fruta", R.drawable.sem_imagem, "Lanchonete pr�xima � UFPB Virtual.", 1);
		dh.insertLandmark(++id, "Barat�o", "Dep�sito O Barat�o", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "TV UFPB", "TV UFPB", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "NTI", "N�cleo da Tecnologia da Informa��o", R.drawable.sem_imagem, "Este n�cleo oferece suporte na �rea de Informatica.", 1);
		dh.insertLandmark(++id, "Concert Hall", "Concert Hall Radegundis Feitosa", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "Santander", "Banco Santander", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "DQ, DG e DCN", "Departamentos de Qu�mica, Geografia e Ci�ncias Naturais", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "DM, DF e DE", "Departamentos de Matem�tica, F�sica e Estat�stica", R.drawable.dm, " ", 1);

		//Landmarks n�o relevantes
		dh.insertLandmark(++id, "Rotat�ria ao lado do CCHLA", "Rotat�ria ao lado do CCHLA", R.drawable.sem_imagem, " ", 0);
		dh.insertLandmark(++id, "Rotat�ria pr�xima ao Setor Esportivo", "Rotat�ria pr�xima ao Setor Esportivo", R.drawable.sem_imagem, " ", 0);//*/
	}
	
	public void databaseFillerRoute() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		
		/*
		 dh.insertRoute(id, �CT�, �CPER�, map, 164, instruction);
			dh.insertRoute(id, �CPER�, �CCJ�, map, 165, instruction);
			dh.insertRoute(id, �CCJ�, �CA�, map, 50, instruction);
			dh.insertRoute(id, �CCJ�, �CCSA�, map, 61, instruction);
			dh.insertRoute(id, �CA�, �CCSA�, map, 79, instruction);
			dh.insertRoute(id, �CCSA�, �CE�, map, 123, instruction);
			dh.insertRoute(id, �CE�, �CCHLA�, map, 91, instruction);
			dh.insertRoute(id, �CCHLA�, �Rotat�ria CCHLA�, map, 58, instruction);
			dh.insertRoute(id, �Rotat�ria CCHLA�, �Concert Hall�, map, 56, instruction);
			dh.insertRoute(id, �Rotat�ria CCHLA�, �CTA�, map, 150, instruction);
			dh.insertRoute(id, �Rotat�ria CCHLA�, �RU�, map, 222, instruction);
			dh.insertRoute(id, �RU�, �Centro de Viv�ncia�, map, 48, instruction);
			dh.insertRoute(id, �Centro de Viv�ncia�, �CODISMA�, map, 42, instruction);
			dh.insertRoute(id, �CODISMA�, �TV UFPB�, map, 135, instruction);
			dh.insertRoute(id, �TV UFPB�, �Barat�o�, map, 75, instruction);
			dh.insertRoute(id, �TV UFPB�, �Caixa�, map, 151, instruction);
			dh.insertRoute(id, �CTA�, �Caixa�, map, 170, instruction);
			dh.insertRoute(id, �Rotat�ria CCHLA�, �Caixa�, map, 255, instruction);
			dh.insertRoute(id, �Barat�o�, �Caixa�, map, 148, instruction);
			dh.insertRoute(id, �TV UFPB�, �Setor de Vigil�ncia�, map, 164, instruction);
			dh.insertRoute(id, �Setor De Vigil�ncia�, �Rotat�ria Setor Esportivo�, map, 127, instruction);
			dh.insertRoute(id, �Rotat�ria Setor Esportivo�, �Reitoria�, map, 110, instruction);
			dh.insertRoute(id, �Rotat�ria Setor Esportivo�, �Setor Esportivo�, map, 167, instruction);
			dh.insertRoute(id, �Reitoria�, �NTI�, map, 75, instruction);
			dh.insertRoute(id, �Reitoria�, �UFPB Virtual�, map, 61, instruction);
			dh.insertRoute(id, �RU�, �Banco do Brasil�, map, 16, instruction);
			dh.insertRoute(id, �Centro de Viv�ncia�, �Banco do Brasil�, map, 77, instruction);
			dh.insertRoute(id, �Banco do Brasil�, �Biblioteca Central�, map, 44, instruction);
			dh.insertRoute(id, �Biblioteca Central�, �Santander�, map, 136, instruction);
			dh.insertRoute(id, �Santander�, �NTI�, map, 107, instruction);
			dh.insertRoute(id, �Biblioteca Central�, �NTI�, map, 165, instruction);
			dh.insertRoute(id, �NTI�, �Gole da Fruta�, map, 74, instruction);
			dh.insertRoute(id, �Gole da Fruta�, �UFPB Virtual�, map, 69 instruction);
			dh.insertRoute(id, �NTI�, �UFPB Virtual�, map, 64, instruction);
			dh.insertRoute(id, �UFPB Virtual�, �Setor Esportivo�, map, 240, instruction);
			dh.insertRoute(id, �Gole da Fruta�, �CEB�, map, 276, instruction);
			dh.insertRoute(id, �Setor Esportivo�, �CEB�, map, 413, instruction);
			dh.insertRoute(id, �Setor Esportivo�, �Resid�ncia�, map, 361, instruction);
			dh.insertRoute(id, �CEB�, �CCS�, map, 126, instruction);
			dh.insertRoute(id, �CEB�, �HU�, map, 164, instruction);
			dh.insertRoute(id, �CCS�, �HU�, map, 72, instruction);
			dh.insertRoute(id, �HU�, �Resid�ncia�, map, 209, instruction);
			dh.insertRoute(id, �CA�, �Lanchonete do Lando�, map, 145, instruction);
			dh.insertRoute(id, �Lanchonete do Lando�, �CI�, map, 111, instruction);
			dh.insertRoute(id, �CI�, DM, DF, DE�, map, 54, instruction);
			dh.insertRoute(id, �DM, DF, DE�, �CCEN�, map, 51, instruction);
			dh.insertRoute(id, �CCEN�, �DQ, DG, DCN�, map, 170, instruction);
			dh.insertRoute(id, �DQ, DG, DCN�, �Santander�, map, 177, instruction);
			dh.insertRoute(id, �CTA�, �RU�, map, 169, instruction);		
			dh.insertRoute(id, �CPER�, �CT�, map, 164, instruction);
			dh.insertRoute(id, �CCJ�, �CPER�, map, 165, instruction);
			dh.insertRoute(id, �CA�, �CCJ�, map, 50, instruction);
			dh.insertRoute(id, �CSAJ�, �CCJ�, map, 61, instruction);
			dh.insertRoute(id, �CCSA�, �CA�, map, 79, instruction);
			dh.insertRoute(id, �CE�, �CCSA�, map, 123, instruction);
			dh.insertRoute(id, �CCHLA�, �CE�, map, 91, instruction);
			dh.insertRoute(id, �Rotat�ria CCHLA�, �CCHLA�, map, 58, instruction);
			dh.insertRoute(id, �Concert Hall�, �Rotat�ria CCHLA�, map, 56, instruction);
			dh.insertRoute(id, �CTA�, �Rotat�ria CCHLA�, map, 150, instruction);
			dh.insertRoute(id, �RU�, �Rotat�ria CCHLA�, map, 222, instruction);
			dh.insertRoute(id, �Centro de Viv�ncia�, �RU�, map, 48, instruction);
			dh.insertRoute(id, �CODISMA�, �Centro de Viv�ncia�, map, 42, instruction);
			dh.insertRoute(id, �TV UFPB�, �CODISMA�, map, 135, instruction);
			dh.insertRoute(id, �Barat�o�, �TV UFPB�, map, 75, instruction);
			dh.insertRoute(id, �Caixa�, �TV UFPB�, map, 151, instruction);
			dh.insertRoute(id, �Caixa�, �CTA�, map, 170, instruction);
			dh.insertRoute(id, �Caixa�, �Rotat�ria CCHLA�, map, 255, instruction);
			dh.insertRoute(id, �Caixa�, �Barat�o�, map, 148, instruction);
			dh.insertRoute(id, �Setor de Vigil�ncia�, �TV UFPB�, map, 164, instruction);
			dh.insertRoute(id, �Rotat�ria Setor Esportivo�, �Setor De Vigil�ncia�, map, 127, instruction);
			dh.insertRoute(id, �Reitoria�, �Rotat�ria Setor Esportivo�, map, 110, instruction);
			dh.insertRoute(id, �Setor Esportivo�, �Rotat�ria Setor Esportivo�, map, 167, instruction);
			dh.insertRoute(id, �NTI�, �Reitoria�, map, 75, instruction);
			dh.insertRoute(id, �UFPB Virtual�, �Reitoria�, map, 61, instruction);
			dh.insertRoute(id, �Banco do Brasil�, �RU�, map, 16, instruction);
			dh.insertRoute(id, �Banco do Brasil�, �Centro de Viv�ncia�, map, 77, instruction);
			dh.insertRoute(id, �Biblioteca Central�, �Banco do Brasil�, map, 44, instruction);
			dh.insertRoute(id, �Santander�, �Biblioteca Central�, map, 136, instruction);
			dh.insertRoute(id, �NTI�, �Santander�, map, 107, instruction);
			dh.insertRoute(id, �NTI�, �Biblioteca Central�, map, 165, instruction);
			dh.insertRoute(id, �Gole da Fruta�, �NTI�, map, 74, instruction);
			dh.insertRoute(id, �UFPB Virtual�, �Gole da Fruta�, map, 69 instruction);
			dh.insertRoute(id, �UFPB Virtual�, �NTI�, map, 64, instruction);
			dh.insertRoute(id, �Setor Esportivo�, �UFPB Virtual�, map, 240, instruction);
			dh.insertRoute(id, �CEB�, �Gole da Fruta�, map, 276, instruction);
			dh.insertRoute(id, �CEB�, �Setor Esportivo�, map, 413, instruction);
			dh.insertRoute(id, �Resid�ncia�, �Setor Esportivo�, map, 361, instruction);
			dh.insertRoute(id, �CCS�, �CEB�, map, 126, instruction);
			dh.insertRoute(id, �HU�, �CEB�, map, 164, instruction);
			dh.insertRoute(id, �HU�, �CCS�, map, 72, instruction);
			dh.insertRoute(id, �Resid�ncia�, �HU�, map, 209, instruction);
			dh.insertRoute(id, �Lanchonete do Lando�, �CA�, map, 145, instruction);
			dh.insertRoute(id, �CI�, �Lanchonete do Lando�, map, 111, instruction);
			dh.insertRoute(id, �DM, DF, DE�, �CI�, map, 54, instruction);
			dh.insertRoute(id, �CCEN�, �DM, DF, DE�, map, 51, instruction);
			dh.insertRoute(id, �DQ, DG, DCN�, �CCEN�, map, 170, instruction);
			dh.insertRoute(id, �Santander�, �DQ, DG, DCN�, map, 177, instruction);
			dh.insertRoute(id, �RU�, �CTA�, map, 169, instruction);  
		 */
	}

}
