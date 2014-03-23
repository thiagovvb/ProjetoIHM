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
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		//Landmarks Relevantes
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.ca, "Conjunto com 8 blocos de salas de aula.", 1);
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
	}
	
	public void databaseFillerRoute() {
		DataHandler dh = new DataHandler(context);
		dh.open();
		int id = 0;
		
		/*
		 dh.insertRoute(id, “CT”, “CPER”, map, 164, instruction);
			dh.insertRoute(id, “CPER”, “CCJ”, map, 165, instruction);
			dh.insertRoute(id, “CCJ”, “CA”, map, 50, instruction);
			dh.insertRoute(id, “CCJ”, “CCSA”, map, 61, instruction);
			dh.insertRoute(id, “CA”, “CCSA”, map, 79, instruction);
			dh.insertRoute(id, “CCSA”, “CE”, map, 123, instruction);
			dh.insertRoute(id, “CE”, “CCHLA”, map, 91, instruction);
			dh.insertRoute(id, “CCHLA”, “Rotatória CCHLA”, map, 58, instruction);
			dh.insertRoute(id, “Rotatória CCHLA”, “Concert Hall”, map, 56, instruction);
			dh.insertRoute(id, “Rotatória CCHLA”, “CTA”, map, 150, instruction);
			dh.insertRoute(id, “Rotatória CCHLA”, “RU”, map, 222, instruction);
			dh.insertRoute(id, “RU”, “Centro de Vivência”, map, 48, instruction);
			dh.insertRoute(id, “Centro de Vivência”, “CODISMA”, map, 42, instruction);
			dh.insertRoute(id, “CODISMA”, “TV UFPB”, map, 135, instruction);
			dh.insertRoute(id, “TV UFPB”, “Baratão”, map, 75, instruction);
			dh.insertRoute(id, “TV UFPB”, “Caixa”, map, 151, instruction);
			dh.insertRoute(id, “CTA”, “Caixa”, map, 170, instruction);
			dh.insertRoute(id, “Rotatória CCHLA”, “Caixa”, map, 255, instruction);
			dh.insertRoute(id, “Baratão”, “Caixa”, map, 148, instruction);
			dh.insertRoute(id, “TV UFPB”, “Setor de Vigilância”, map, 164, instruction);
			dh.insertRoute(id, “Setor De Vigilância”, “Rotatória Setor Esportivo”, map, 127, instruction);
			dh.insertRoute(id, “Rotatória Setor Esportivo”, “Reitoria”, map, 110, instruction);
			dh.insertRoute(id, “Rotatória Setor Esportivo”, “Setor Esportivo”, map, 167, instruction);
			dh.insertRoute(id, “Reitoria”, “NTI”, map, 75, instruction);
			dh.insertRoute(id, “Reitoria”, “UFPB Virtual”, map, 61, instruction);
			dh.insertRoute(id, “RU”, “Banco do Brasil”, map, 16, instruction);
			dh.insertRoute(id, “Centro de Vivência”, “Banco do Brasil”, map, 77, instruction);
			dh.insertRoute(id, “Banco do Brasil”, “Biblioteca Central”, map, 44, instruction);
			dh.insertRoute(id, “Biblioteca Central”, “Santander”, map, 136, instruction);
			dh.insertRoute(id, “Santander”, “NTI”, map, 107, instruction);
			dh.insertRoute(id, “Biblioteca Central”, “NTI”, map, 165, instruction);
			dh.insertRoute(id, “NTI”, “Gole da Fruta”, map, 74, instruction);
			dh.insertRoute(id, “Gole da Fruta”, “UFPB Virtual”, map, 69 instruction);
			dh.insertRoute(id, “NTI”, “UFPB Virtual”, map, 64, instruction);
			dh.insertRoute(id, “UFPB Virtual”, “Setor Esportivo”, map, 240, instruction);
			dh.insertRoute(id, “Gole da Fruta”, “CEB”, map, 276, instruction);
			dh.insertRoute(id, “Setor Esportivo”, “CEB”, map, 413, instruction);
			dh.insertRoute(id, “Setor Esportivo”, “Residência”, map, 361, instruction);
			dh.insertRoute(id, “CEB”, “CCS”, map, 126, instruction);
			dh.insertRoute(id, “CEB”, “HU”, map, 164, instruction);
			dh.insertRoute(id, “CCS”, “HU”, map, 72, instruction);
			dh.insertRoute(id, “HU”, “Residência”, map, 209, instruction);
			dh.insertRoute(id, “CA”, “Lanchonete do Lando”, map, 145, instruction);
			dh.insertRoute(id, “Lanchonete do Lando”, “CI”, map, 111, instruction);
			dh.insertRoute(id, “CI”, DM, DF, DE”, map, 54, instruction);
			dh.insertRoute(id, “DM, DF, DE”, “CCEN”, map, 51, instruction);
			dh.insertRoute(id, “CCEN”, “DQ, DG, DCN”, map, 170, instruction);
			dh.insertRoute(id, “DQ, DG, DCN”, “Santander”, map, 177, instruction);
			dh.insertRoute(id, “CTA”, “RU”, map, 169, instruction);		
			dh.insertRoute(id, “CPER”, “CT”, map, 164, instruction);
			dh.insertRoute(id, “CCJ”, “CPER”, map, 165, instruction);
			dh.insertRoute(id, “CA”, “CCJ”, map, 50, instruction);
			dh.insertRoute(id, “CSAJ”, “CCJ”, map, 61, instruction);
			dh.insertRoute(id, “CCSA”, “CA”, map, 79, instruction);
			dh.insertRoute(id, “CE”, “CCSA”, map, 123, instruction);
			dh.insertRoute(id, “CCHLA”, “CE”, map, 91, instruction);
			dh.insertRoute(id, “Rotatória CCHLA”, “CCHLA”, map, 58, instruction);
			dh.insertRoute(id, “Concert Hall”, “Rotatória CCHLA”, map, 56, instruction);
			dh.insertRoute(id, “CTA”, “Rotatória CCHLA”, map, 150, instruction);
			dh.insertRoute(id, “RU”, “Rotatória CCHLA”, map, 222, instruction);
			dh.insertRoute(id, “Centro de Vivência”, “RU”, map, 48, instruction);
			dh.insertRoute(id, “CODISMA”, “Centro de Vivência”, map, 42, instruction);
			dh.insertRoute(id, “TV UFPB”, “CODISMA”, map, 135, instruction);
			dh.insertRoute(id, “Baratão”, “TV UFPB”, map, 75, instruction);
			dh.insertRoute(id, “Caixa”, “TV UFPB”, map, 151, instruction);
			dh.insertRoute(id, “Caixa”, “CTA”, map, 170, instruction);
			dh.insertRoute(id, “Caixa”, “Rotatória CCHLA”, map, 255, instruction);
			dh.insertRoute(id, “Caixa”, “Baratão”, map, 148, instruction);
			dh.insertRoute(id, “Setor de Vigilância”, “TV UFPB”, map, 164, instruction);
			dh.insertRoute(id, “Rotatória Setor Esportivo”, “Setor De Vigilância”, map, 127, instruction);
			dh.insertRoute(id, “Reitoria”, “Rotatória Setor Esportivo”, map, 110, instruction);
			dh.insertRoute(id, “Setor Esportivo”, “Rotatória Setor Esportivo”, map, 167, instruction);
			dh.insertRoute(id, “NTI”, “Reitoria”, map, 75, instruction);
			dh.insertRoute(id, “UFPB Virtual”, “Reitoria”, map, 61, instruction);
			dh.insertRoute(id, “Banco do Brasil”, “RU”, map, 16, instruction);
			dh.insertRoute(id, “Banco do Brasil”, “Centro de Vivência”, map, 77, instruction);
			dh.insertRoute(id, “Biblioteca Central”, “Banco do Brasil”, map, 44, instruction);
			dh.insertRoute(id, “Santander”, “Biblioteca Central”, map, 136, instruction);
			dh.insertRoute(id, “NTI”, “Santander”, map, 107, instruction);
			dh.insertRoute(id, “NTI”, “Biblioteca Central”, map, 165, instruction);
			dh.insertRoute(id, “Gole da Fruta”, “NTI”, map, 74, instruction);
			dh.insertRoute(id, “UFPB Virtual”, “Gole da Fruta”, map, 69 instruction);
			dh.insertRoute(id, “UFPB Virtual”, “NTI”, map, 64, instruction);
			dh.insertRoute(id, “Setor Esportivo”, “UFPB Virtual”, map, 240, instruction);
			dh.insertRoute(id, “CEB”, “Gole da Fruta”, map, 276, instruction);
			dh.insertRoute(id, “CEB”, “Setor Esportivo”, map, 413, instruction);
			dh.insertRoute(id, “Residência”, “Setor Esportivo”, map, 361, instruction);
			dh.insertRoute(id, “CCS”, “CEB”, map, 126, instruction);
			dh.insertRoute(id, “HU”, “CEB”, map, 164, instruction);
			dh.insertRoute(id, “HU”, “CCS”, map, 72, instruction);
			dh.insertRoute(id, “Residência”, “HU”, map, 209, instruction);
			dh.insertRoute(id, “Lanchonete do Lando”, “CA”, map, 145, instruction);
			dh.insertRoute(id, “CI”, “Lanchonete do Lando”, map, 111, instruction);
			dh.insertRoute(id, “DM, DF, DE”, “CI”, map, 54, instruction);
			dh.insertRoute(id, “CCEN”, “DM, DF, DE”, map, 51, instruction);
			dh.insertRoute(id, “DQ, DG, DCN”, “CCEN”, map, 170, instruction);
			dh.insertRoute(id, “Santander”, “DQ, DG, DCN”, map, 177, instruction);
			dh.insertRoute(id, “RU”, “CTA”, map, 169, instruction);  
		 */
	}

}
