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
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		//Landmarks Relevantes
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.ca, "Conjunto com  blocos de salas de aula.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Arquitetura, Engenharia de Alimentos, Engenharia de Materiais, Engenharia de Produção, Engenharia Civil e " +
				"Ambiental, Engenharia Mecânica e Engenharia Química.", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ciências Sociais Aplicadas", R.drawable.ccsa, "Neste centro estão os departamentos de " +
				"Administração, Ciências da Informação, Economia, Finanças e Contabillidade, e de Relações Internacionais.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educação", R.drawable.ce, "Neste centro estão os departamentos de " +
				"Fundamentação da Educação, Habilitação Pedagógica, Metodologia da Educação, Psicopedagogia e Ciências das " +
				"Religiões.", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ciências Humanas, Letras e Artes", R.drawable.cchla, "Neste centro estão os departamentos de " +
				"Ciências Sociais, Filosofia, História, Letras Clássicas e Vernáculas, Letras Estrangeiras Modernas, Midias Digitais, Psicologia " +
				"e Serviço Social.", 1);
		dh.insertLandmark(++id, "Centro de Vivência", "Centro de Vivência", R.drawable.centro_de_vivencia, "Neste local pode-se adicionar créditos ao passe legal, " +
				"e solicitar sua carteira de estudante. ", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.biblio_central, "Principal biblioteca da Universidade Federal da Paraíba.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ciências Exatas e da Natureza", R.drawable.biblio_ccen, "Neste centro estão os departamentos de " +
				"Biologia Molecular, Geociências, Sistematica e Ecologia, Estatística, Física, Matemática e Quimica. Bem como o NEPREMAR.", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.reitoria, "Central Administrativa da Universidade Federal da Paraíba.", 1);
		dh.insertLandmark(++id, "Setor Esportivo", "Setor Esportivo", R.drawable.sem_imagem, "Área destina ao cursos de Licenciatura em Educação Física.", 1);
		dh.insertLandmark(++id, "CCS", "Centro de Ciências da Saúde", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Ciências Farmaceuticas, Clínica e Odontologia Social, Educação Física, Enfermagem Clínica, Fisiologia e Patologia, Enfermagem, Saúde Pública " +
				"e Psiquiatria, Fisioterapia, Fonoaudiologia, Nutrição, Morfologia, Odontologia Restauradora, Terapia Ocupacional. Bem como a Escola Técnica de Saúde.", 1);
		dh.insertLandmark(++id, "HULW", "Hospital Universitário Lauro Wanderley", R.drawable.sem_imagem, "O HULW oferece as especializações Latu-Sensu em Residência " +
				"Médica nas áreas de Anestesiologia, Clínica médica, Cirurgia Geral, Ginecologia e Obstetrícia, Pediatria, Oftalmologia e Terapia Intensiva e Doenças " +
				"Infecto-Contagiosas além de disponibilizar campo de prática na profissionalização dos cursos de Medicina, Enfermagem, Fisioterapia, Nutrição, Farmácia, " +
				"Odontologia, Serviço Social, Psicologia, Educação Física, Comunicação Social entre outros.", 1);
		dh.insertLandmark(++id, "Residência Universitária", "Residência Universitária", R.drawable.sem_imagem, "Condomínio onde residem os estudantes que não possuem família " +
				"na cidade de João Pessoa.", 1);
		dh.insertLandmark(++id, "Setor de Vigilância", "Setor de Vigilância", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "CODISMA", "Cooperativa Cultural Universitária da Paraíba Ltda", R.drawable.codisma, " ", 1);
		dh.insertLandmark(++id, "Resturante Universitário", "Resturante Universitário", R.drawable.sem_imagem, "Local designado à alimentação dos alunos.", 1);
		dh.insertLandmark(++id, "CI", "Centro de Informática", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Computação Científica, Informática e Sistema de Computação.", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econômica Federal", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.ufpb_virtual, "Local destinado à gerência dos cursos à distância.", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEAR", "Centro de Energias e Alternativas Renováveis", R.drawable.sem_imagem, "Neste centro estão os departamentos " +
				"de Energia Elétrica e Energias Renováveis.", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunicação, Turismo e Artes", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Artes Cênicas, Artes Visuais, Comunicação e Turismo, Educação Musical e Música", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ciências Jurídicas", R.drawable.ccj, "Neste centro estão os departamentos de " +
				"Direito Privado, Direito Público e Direito Processual e Prática Jurídica.", 1);
		dh.insertLandmark(++id, "Lando", "Lanchonete do Lando", R.drawable.sem_imagem, "Lanchonete próxima ao departamento de Física.", 1);
		dh.insertLandmark(++id, "CEB", "Cantina Elefante Branco", R.drawable.sem_imagem, "Lanchonete próxima ao departamento de Odontologia.", 1);
		dh.insertLandmark(++id, "Gole da Fruta", "Gole da Fruta", R.drawable.sem_imagem, "Lanchonete próxima à UFPB Virtual.", 1);
		dh.insertLandmark(++id, "Baratão", "Depósito O Baratão", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "TV UFPB", "TV UFPB", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "NTI", "Núcleo da Tecnologia da Informação", R.drawable.sem_imagem, "Este núcleo oferece suporte na área de Informatica.", 1);
		dh.insertLandmark(++id, "Concert Hall", "Concert Hall Radegundis Feitosa", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "Santander", "Banco Santander", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "DQ, DG e DCN", "Departamentos de Química, Geografia e Ciências Naturais", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "DM, DF e DE", "Departamentos de Matemática, Física e Estatística", R.drawable.dm, " ", 1);

		//Landmarks não relevantes
		dh.insertLandmark(++id, "Rotatória ao lado do CCHLA", "Rotatória ao lado do CCHLA", R.drawable.sem_imagem, " ", 0);
		dh.insertLandmark(++id, "Rotatória próxima ao Setor Esportivo", "Rotatória próxima ao Setor Esportivo", R.drawable.sem_imagem, " ", 0);//*/
		
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
