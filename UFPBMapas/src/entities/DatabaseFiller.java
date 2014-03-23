package entities;

import java.util.ArrayList;

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
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.ca, "Conjunto com  blocos de salas de aula.", 1);
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
		
		ArrayList<Landmark> a = dh.fetchLandmark();
		for(int i = 0; i < a.size(); i++){
			System.out.println("Nome = " + a.get(i).getName() + " ID = " + a.get(i).getId());
		}
		
	}
	
	public void databaseFillerRoute() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		
		int map = 0;
		String instruction = "";

		dh.insertRoute(id, 2, 21, map, 164, instruction);
		dh.insertRoute(id, 21, 23, map, 165, instruction);
		dh.insertRoute(id, 23, 1, map, 50, instruction);
		dh.insertRoute(id, 23, 3, map, 61, instruction);
		dh.insertRoute(id, 1, 3, map, 79, instruction);
		dh.insertRoute(id, 3, 4, map, 123, instruction);
		dh.insertRoute(id, 4, 5, map, 91, instruction);
		dh.insertRoute(id, 5, 34, map, 5, instruction);
		dh.insertRoute(id, 34, 30, map, 56, instruction);
		dh.insertRoute(id, 34, 22, map, 150, instruction);
		dh.insertRoute(id, 34, 16, map, 222, instruction);
		dh.insertRoute(id, 16, 6, map, 4, instruction);
		dh.insertRoute(id, 6, 15, map, 42, instruction);
		dh.insertRoute(id, 15, 2, map, 135, instruction);
		dh.insertRoute(id, 2, 27, map, 75, instruction);
		dh.insertRoute(id, 2, 1, map, 151, instruction);
		dh.insertRoute(id, 22, 1, map, 170, instruction);
		dh.insertRoute(id, 34, 1, map, 255, instruction);
		dh.insertRoute(id, 27, 1, map, 14, instruction);
		dh.insertRoute(id, 2, 14, map, 164, instruction);
		dh.insertRoute(id, 14, 35, map, 127, instruction);
		dh.insertRoute(id, 35, 9, map, 110, instruction);
		dh.insertRoute(id, 35, 10, map, 167, instruction);
		dh.insertRoute(id, 9, 29, map, 75, instruction);
		dh.insertRoute(id, 9, 19, map, 61, instruction);
		dh.insertRoute(id, 16, 20, map, 16, instruction);
		dh.insertRoute(id, 6, 20, map, 77, instruction);
		dh.insertRoute(id, 20, 7, map, 44, instruction);
		dh.insertRoute(id, 7, 31, map, 136, instruction);
		dh.insertRoute(id, 31, 29, map, 107, instruction);
		dh.insertRoute(id, 7, 29, map, 165, instruction);
		dh.insertRoute(id, 29, 26, map, 74, instruction);
		dh.insertRoute(id, 26, 19, map, 69, instruction);
		dh.insertRoute(id, 29, 19, map, 64, instruction);
		dh.insertRoute(id, 19, 10, map, 240, instruction);
		dh.insertRoute(id, 26, 25, map, 276, instruction);
		dh.insertRoute(id, 10, 25, map, 413, instruction);
		dh.insertRoute(id, 10, 13, map, 361, instruction);
		dh.insertRoute(id, 25, 11, map, 126, instruction);
		dh.insertRoute(id, 25, 12, map, 164, instruction);
		dh.insertRoute(id, 11, 12, map, 72, instruction);
		dh.insertRoute(id, 12, 13, map, 209, instruction);
		dh.insertRoute(id, 1, 24, map, 145, instruction);
		dh.insertRoute(id, 24, 17, map, 111, instruction);
		dh.insertRoute(id, 17, 33, map, 54, instruction);
		dh.insertRoute(id, 33, 8, map, 51, instruction);
		dh.insertRoute(id, 8, 32, map, 170, instruction);
		dh.insertRoute(id, 32, 31, map, 177, instruction);
		dh.insertRoute(id, 22, 16, map, 169, instruction);		
		dh.insertRoute(id, 21, 2, map, 164, instruction);
		dh.insertRoute(id, 23, 21, map, 165, instruction);
		dh.insertRoute(id, 1, 23, map, 50, instruction);
		dh.insertRoute(id, 3, 23, map, 61, instruction);
		dh.insertRoute(id, 3, 1, map, 79, instruction);
		dh.insertRoute(id, 4, 3, map, 123, instruction);
		dh.insertRoute(id, 5, 4, map, 91, instruction);
		dh.insertRoute(id, 34, 5, map, 5, instruction);
		dh.insertRoute(id, 30, 34, map, 56, instruction);
		dh.insertRoute(id, 22, 34, map, 150, instruction);
		dh.insertRoute(id, 16, 34, map, 222, instruction);
		dh.insertRoute(id, 6, 16, map, 4, instruction);
		dh.insertRoute(id, 15, 6, map, 42, instruction);
		dh.insertRoute(id, 2, 15, map, 135, instruction);
		dh.insertRoute(id, 27, 2, map, 75, instruction);
		dh.insertRoute(id, 1, 2, map, 151, instruction);
		dh.insertRoute(id, 1, 22, map, 170, instruction);
		dh.insertRoute(id, 1, 34, map, 255, instruction);
		dh.insertRoute(id, 1, 27, map, 14, instruction);
		dh.insertRoute(id, 14, 2, map, 164, instruction);
		dh.insertRoute(id, 35, 14, map, 127, instruction);
		dh.insertRoute(id, 9, 35, map, 110, instruction);
		dh.insertRoute(id, 10, 35, map, 167, instruction);
		dh.insertRoute(id, 29, 9, map, 75, instruction);
		dh.insertRoute(id, 19, 9, map, 61, instruction);
		dh.insertRoute(id, 20, 16, map, 16, instruction);
		dh.insertRoute(id, 20, 6, map, 77, instruction);
		dh.insertRoute(id, 7, 20, map, 44, instruction);
		dh.insertRoute(id, 31, 7, map, 136, instruction);
		dh.insertRoute(id, 29, 31, map, 107, instruction);
		dh.insertRoute(id, 29, 7, map, 165, instruction);
		dh.insertRoute(id, 26, 29, map, 74, instruction);
		dh.insertRoute(id, 19, 26, map, 69, instruction);
		dh.insertRoute(id, 19, 29, map, 64, instruction);
		dh.insertRoute(id, 10, 19, map, 240, instruction);
		dh.insertRoute(id, 25, 26, map, 276, instruction);
		dh.insertRoute(id, 25, 10, map, 413, instruction);
		dh.insertRoute(id, 13, 10, map, 361, instruction);
		dh.insertRoute(id, 11, 25, map, 126, instruction);
		dh.insertRoute(id, 12, 25, map, 164, instruction);
		dh.insertRoute(id, 12, 11, map, 72, instruction);
		dh.insertRoute(id, 13, 12, map, 209, instruction);
		dh.insertRoute(id, 24, 1, map, 145, instruction);
		dh.insertRoute(id, 17, 24, map, 111, instruction);
		dh.insertRoute(id, 33, 17, map, 54, instruction);
		dh.insertRoute(id, 8, 33, map, 51, instruction);
		dh.insertRoute(id, 32, 8, map, 170, instruction);
		dh.insertRoute(id, 31, 32, map, 177, instruction);
		dh.insertRoute(id, 16, 22, map, 169, instruction);  
		
		//Invertendo
		
		dh.insertRoute(id, 21, 2, map, 164, instruction);
		dh.insertRoute(id, 23, 21, map, 165, instruction);
		dh.insertRoute(id, 1, 23, map, 50, instruction);
		dh.insertRoute(id, 3, 23, map, 61, instruction);
		dh.insertRoute(id, 3, 1, map, 79, instruction);
		dh.insertRoute(id, 4, 3, map, 123, instruction);
		dh.insertRoute(id, 5, 4, map, 91, instruction);
		dh.insertRoute(id, 34, 5, map, 5, instruction);
		dh.insertRoute(id, 30, 34, map, 56, instruction);
		dh.insertRoute(id, 22, 34, map, 150, instruction);
		dh.insertRoute(id, 16, 34, map, 222, instruction);
		dh.insertRoute(id, 6, 16, map, 4, instruction);
		dh.insertRoute(id, 15, 6, map, 42, instruction);
		dh.insertRoute(id, 2, 15, map, 135, instruction);
		dh.insertRoute(id, 27, 2, map, 75, instruction);
		dh.insertRoute(id, 1, 2, map, 151, instruction);
		dh.insertRoute(id, 1, 22, map, 170, instruction);
		dh.insertRoute(id, 1, 34, map, 255, instruction);
		dh.insertRoute(id, 1, 27, map, 14, instruction);
		dh.insertRoute(id, 14, 2, map, 164, instruction);
		dh.insertRoute(id, 35, 14, map, 127, instruction);
		dh.insertRoute(id, 9, 35, map, 110, instruction);
		dh.insertRoute(id, 10, 35, map, 167, instruction);
		dh.insertRoute(id, 29, 9, map, 75, instruction);
		dh.insertRoute(id, 19, 9, map, 61, instruction);
		dh.insertRoute(id, 20, 16, map, 16, instruction);
		dh.insertRoute(id, 20, 6, map, 77, instruction);
		dh.insertRoute(id, 7, 20, map, 44, instruction);
		dh.insertRoute(id, 31, 7, map, 136, instruction);
		dh.insertRoute(id, 29, 31, map, 107, instruction);
		dh.insertRoute(id, 29, 7, map, 165, instruction);
		dh.insertRoute(id, 26, 29, map, 74, instruction);
		dh.insertRoute(id, 19, 26, map, 69, instruction);
		dh.insertRoute(id, 19, 29, map, 64, instruction);
		dh.insertRoute(id, 10, 19, map, 240, instruction);
		dh.insertRoute(id, 25, 26, map, 276, instruction);
		dh.insertRoute(id, 25, 10, map, 413, instruction);
		dh.insertRoute(id, 13, 10, map, 361, instruction);
		dh.insertRoute(id, 11, 25, map, 126, instruction);
		dh.insertRoute(id, 12, 25, map, 164, instruction);
		dh.insertRoute(id, 12, 11, map, 72, instruction);
		dh.insertRoute(id, 13, 12, map, 209, instruction);
		dh.insertRoute(id, 24, 1, map, 145, instruction);
		dh.insertRoute(id, 17, 24, map, 111, instruction);
		dh.insertRoute(id, 33, 17, map, 54, instruction);
		dh.insertRoute(id, 8, 33, map, 51, instruction);
		dh.insertRoute(id, 32, 8, map, 170, instruction);
		dh.insertRoute(id, 31, 32, map, 177, instruction);
		dh.insertRoute(id, 16, 22, map, 169, instruction);		
		dh.insertRoute(id, 2, 21, map, 164, instruction);
		dh.insertRoute(id, 21, 23, map, 165, instruction);
		dh.insertRoute(id, 23, 1, map, 50, instruction);
		dh.insertRoute(id, 23, 3, map, 61, instruction);
		dh.insertRoute(id, 1 , 3, map, 79, instruction);
		dh.insertRoute(id, 3, 4, map, 123, instruction);
		dh.insertRoute(id, 4, 5, map, 91, instruction);
		dh.insertRoute(id, 5, 34, map, 5, instruction);
		dh.insertRoute(id, 34, 30, map, 56, instruction);
		dh.insertRoute(id, 34, 22, map, 150, instruction);
		dh.insertRoute(id, 34, 16, map, 222, instruction);
		dh.insertRoute(id, 16, 6, map, 4, instruction);
		dh.insertRoute(id, 6, 15, map, 42, instruction);
		dh.insertRoute(id, 15, 2, map, 135, instruction);
		dh.insertRoute(id, 2, 27, map, 75, instruction);
		dh.insertRoute(id, 2, 1, map, 151, instruction);
		dh.insertRoute(id, 22, 1, map, 170, instruction);
		dh.insertRoute(id, 34, 1, map, 255, instruction);
		dh.insertRoute(id, 27, 1, map, 14, instruction);
		dh.insertRoute(id, 2, 14, map, 164, instruction);
		dh.insertRoute(id, 14, 35, map, 127, instruction);
		dh.insertRoute(id, 35, 9, map, 110, instruction);
		dh.insertRoute(id, 35, 10, map, 167, instruction);
		dh.insertRoute(id, 9, 29, map, 75, instruction);
		dh.insertRoute(id, 9, 19, map, 61, instruction);
		dh.insertRoute(id, 16, 20, map, 16, instruction);
		dh.insertRoute(id, 6, 20, map, 77, instruction);
		dh.insertRoute(id, 20, 7, map, 44, instruction);
		dh.insertRoute(id, 7, 31, map, 136, instruction);
		dh.insertRoute(id, 31, 29, map, 107, instruction);
		dh.insertRoute(id, 7, 29, map, 165, instruction);
		dh.insertRoute(id, 29, 26, map, 74, instruction);
		dh.insertRoute(id, 26, 19, map, 69, instruction);
		dh.insertRoute(id, 29, 19, map, 64, instruction);
		dh.insertRoute(id, 19, 10, map, 240, instruction);
		dh.insertRoute(id, 26, 25, map, 276, instruction);
		dh.insertRoute(id, 10, 25, map, 413, instruction);
		dh.insertRoute(id, 10, 13, map, 361, instruction);
		dh.insertRoute(id, 25, 11, map, 126, instruction);
		dh.insertRoute(id, 25, 12, map, 164, instruction);
		dh.insertRoute(id, 11, 12, map, 72, instruction);
		dh.insertRoute(id, 12, 13, map, 209, instruction);
		dh.insertRoute(id, 1, 24, map, 145, instruction);
		dh.insertRoute(id, 24, 17, map, 111, instruction);
		dh.insertRoute(id, 17, 33, map, 54, instruction);
		dh.insertRoute(id, 33, 8, map, 51, instruction);
		dh.insertRoute(id, 8, 32, map, 170, instruction);
		dh.insertRoute(id, 32, 31, map, 177, instruction);
		dh.insertRoute(id, 22, 16, map, 169, instruction);  

	}

}
