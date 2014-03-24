package entities;

import java.util.ArrayList;

import android.content.Context;

import com.example.ufpbmaps.R;

import dbclasses.DataHandler;

public class DatabaseFiller {

	private Context context;
	private static DatabaseFiller uniqueInstance = null;
	
	private DatabaseFiller() {

	}
	
	public static DatabaseFiller getInstance() {
		if(uniqueInstance == null)
			return new DatabaseFiller();
		return uniqueInstance;
	}
	
	/**
	 * M�todo respons�vel por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm(DataHandler dh) {
		//DataHandler dh = new DataHandler(context);
		
		int id = 0;
		//Landmarks Relevantes
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.img_ca, "Conjunto com  blocos de salas de aula.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Arquitetura, Engenharia de Alimentos, Engenharia de Materiais, Engenharia de Produ��o, Engenharia Civil e " +
				"Ambiental, Engenharia Mec�nica e Engenharia Qu�mica.", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ci�ncias Sociais Aplicadas", R.drawable.img_ccsa, "Neste centro est�o os departamentos de " +
				"Administra��o, Ci�ncias da Informa��o, Economia, Finan�as e Contabillidade, e de Rela��es Internacionais.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educa��o", R.drawable.img_ce, "Neste centro est�o os departamentos de " +
				"Fundamenta��o da Educa��o, Habilita��o Pedag�gica, Metodologia da Educa��o, Psicopedagogia e Ci�ncias das " +
				"Religi�es.", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ci�ncias Humanas, Letras e Artes", R.drawable.img_cchla, "Neste centro est�o os departamentos de " +
				"Ci�ncias Sociais, Filosofia, Hist�ria, Letras Cl�ssicas e Vern�culas, Letras Estrangeiras Modernas, Midias Digitais, Psicologia " +
				"e Servi�o Social.", 1);
		dh.insertLandmark(++id, "Centro de Viv�ncia", "Centro de Viv�ncia", R.drawable.img_centro_de_vivencia, "Neste local pode-se adicionar cr�ditos ao passe legal, " +
				"e solicitar sua carteira de estudante. ", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.img_biblio_central, "Principal biblioteca da Universidade Federal da Para�ba.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ci�ncias Exatas e da Natureza", R.drawable.img_biblio_ccen, "Neste centro est�o os departamentos de " +
				"Biologia Molecular, Geoci�ncias, Sistematica e Ecologia, Estat�stica, F�sica, Matem�tica e Quimica. Bem como o NEPREMAR.", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.img_reitoria, "Central Administrativa da Universidade Federal da Para�ba.", 1);
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
		dh.insertLandmark(++id, "CODISMA", "Cooperativa Cultural Universit�ria da Para�ba Ltda", R.drawable.img_codisma, " ", 1);
		dh.insertLandmark(++id, "Resturante Universit�rio", "Resturante Universit�rio", R.drawable.sem_imagem, "Local designado � alimenta��o dos alunos.", 1);
		dh.insertLandmark(++id, "CI", "Centro de Inform�tica", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Computa��o Cient�fica, Inform�tica e Sistema de Computa��o.", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econ�mica Federal", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.img_ufpb_virtual, "Local destinado � ger�ncia dos cursos � dist�ncia.", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEAR", "Centro de Energias e Alternativas Renov�veis", R.drawable.sem_imagem, "Neste centro est�o os departamentos " +
				"de Energia El�trica e Energias Renov�veis.", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunica��o, Turismo e Artes", R.drawable.sem_imagem, "Neste centro est�o os departamentos de " +
				"Artes C�nicas, Artes Visuais, Comunica��o e Turismo, Educa��o Musical e M�sica", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ci�ncias Jur�dicas", R.drawable.img_ccj, "Neste centro est�o os departamentos de " +
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
		dh.insertLandmark(++id, "DM, DF e DE", "Departamentos de Matem�tica, F�sica e Estat�stica", R.drawable.img_dm, " ", 1);

		//Landmarks n�o relevantes
		dh.insertLandmark(++id, "Rotat�ria ao lado do CCHLA", "Rotat�ria ao lado do CCHLA", R.drawable.sem_imagem, " ", 0);
		dh.insertLandmark(++id, "Rotat�ria pr�xima ao Setor Esportivo", "Rotat�ria pr�xima ao Setor Esportivo", R.drawable.sem_imagem, " ", 0);//*/
		
		ArrayList<Landmark> a = dh.fetchLandmark();
		for(int i = 0; i < a.size(); i++){
			System.out.println("Nome = " + a.get(i).getName() + " ID = " + a.get(i).getId());
		}
		
	}
	
	public void databaseFillerRoute(DataHandler dh) {
		//DataHandler dh = new DataHandler(context);
		int id = 0;
		
		dh.insertRoute(++id, 2, 21, R.drawable.rota_ct_cear, 164, "Siga em dire��o � rotat�ria\nSiga em frente e a Entrada do CEAR estar� � esquerda");
		dh.insertRoute(++id, 21, 23, R.drawable.rota_ccj_cear, 165, "Siga em frente em dire��o � rotat�ria mais distante\nChegando l�, o pr�dio estar� � sua direita");
		dh.insertRoute(++id, 23, 1, R.drawable.rota_ccj_ca, 50, "Atravesse a rua em dire��o aos pr�dios enfileirados em frente ao estacionamento");
		dh.insertRoute(++id, 23, 3, R.drawable.rota_ccj_ccsa, 61, "Atravesse a rua em dire��o ao pr�dio do lado oposto ao estacionamento.");
		dh.insertRoute(++id, 1, 3, R.drawable.rota_ca_ccsa, 79, "Certifique-se que est� entre os primeiros quatro blocos\nAtravesse a rua em dire��o aos pr�dios do lado oposto ao estacionamento");
		dh.insertRoute(++id, 3, 4, R.drawable.rota_ccsa_ce, 123, "Siga em dire��o a rotat�ria mais distantes\nSer�o os pr�dios mais pr�ximos");
		dh.insertRoute(++id, 4, 5, R.drawable.rota_ce_cchla, 91, "Observe a placa denominada CCHLA\nAnde em dire��o a ela.");
		dh.insertRoute(++id, 5, 34, R.drawable.rota_cchla_rotatoria, 58, "Siga em frente at� a rotat�ria mais pr�xima");
		dh.insertRoute(++id, 34, 30, R.drawable.rota_rotatoria_concerthall, 56, "Siga em dire��o � entrada da UFPB\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 34, 22, R.drawable.rota_cta_rotatoria, 150, "Siga em frente na dire��o oposta da entrada da UFPB\nVire � esquerda na primeira rua\n Os pr�dios estar�o � sua esquerda");
		dh.insertRoute(++id, 34, 16, R.drawable.rota_ru_rotatoria, 222, "Siga em frente na dire��o oposta � entrada da UFPB\nO pr�dio estar� � sua esquerda, logo antes do estacionamento");
		dh.insertRoute(++id, 16, 6, R.drawable.rota_ru_centro_de_vivencia, 48, "Note a pra�a coberta em frente ao restaurante\nSiga at� esse ponto");
		dh.insertRoute(++id, 6, 15, R.drawable.rota_centrodevivencia_codisma, 42, "De frente ao resturante, vire � direita");
		dh.insertRoute(++id, 15, 28, R.drawable.rota_codisma_tvufpb, 135, "Siga em linha reta em dire��o ao gazebo\nAtravesse a rua");
		dh.insertRoute(++id, 28, 27, R.drawable.rota_baratao_tvufpb, 75, "Siga em frente na dire��o da Caixa\nVire � direita na primeira entrada");
		dh.insertRoute(++id, 28, 18, R.drawable.rota_tvufpb_caixa, 151, "De costas � entrada, siga � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 22, 18, R.drawable.rota_cta_caixa, 170, "Siga em frente paralelamente � reserva\nAo final da rua, o pr�dio estar� � sua frente");
		dh.insertRoute(++id, 34, 18, R.drawable.rota_caixa_rotatoria, 255, "Siga beirando os limites do campus at� a passarela coberta\nSiga em frente at� a rotat�ria");
		dh.insertRoute(++id, 27, 18, R.drawable.rota_baratao_caixa, 148, "Siga at� a sa�da da rua\nEntre � direita\nO pr�dio estar� na sua direita");
		dh.insertRoute(++id, 28, 14, R.drawable.rota_tvufpb_setordevigilancia, 164, "De costas para o pr�dio, siga � sua esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 14, 35, R.drawable.rota_setordevigilancia_rotatoria, 127, "De costas para o pr�dio, siga � sua esquerda\nA rotat�ria estatr� logo � frente");
		dh.insertRoute(++id, 35, 9, R.drawable.rota_reitoria_rotatoria, 110, "De costas � entrada do campus, siga em frente\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 35, 10, R.drawable.rota_setoresportivo_rotatoria, 167, "De costas para a entrada do campus, siga � esquerda\nA entrada estar� � sua esquerda");
		dh.insertRoute(++id, 9, 29, R.drawable.rota_nti_reitoria, 75, "De costas para a entrada, siga � direita\nAtravesse a rua\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 9, 19, R.drawable.rota_reitoria_ufpbvirtual, 61, "Atravesse o estacionamento em frente ao pr�dio\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 16, 20, R.drawable.rota_bb_ru, 116, "Siga a cal�ada, passando pelo Centro de Viv�ncia\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 6, 20, R.drawable.rota_bb_centrodevivencia, 77, "Dentro do Centro de Viv�ncias, des�a as escadas\nSiga em frente\nNa sa�da � sua direita, siga � esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 20, 7, R.drawable.rota_bb_bibliotecacentral, 44, "Atravesse a rua\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 7, 31, R.drawable.rota_bibliotecacentral_bb, 136, "De costas para o pr�dio, siga � direita\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 31, 29, R.drawable.rota_santander_bibliotecacentral, 107, "De costas para o pr�dio, siga em frente at� chegar � rua\nVire � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 7, 29, R.drawable.rota_nti_santander, 165, "De costas para o pr�dio, siga � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 29, 26, R.drawable.rota_nti_goledafruta, 74, "De costas ao pr�dio, entre � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 26, 19, R.drawable.rota_goledafruta_ufpbvirtual, 69, "Atravesse a rua\nVire � esquerda\nEntre � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 29, 19, R.drawable.rota_nti_ufpbvirtual, 64, "De costas para o pr�dio, siga em frente\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 19, 10, R.drawable.rota_ufpbvirtual_setoresportivo, 240, "De costas para o pr�dio, siga � direita\nEntre � sua direita\nSiga em frente\nA entrada estar� � sua esquerda");
		dh.insertRoute(++id, 26, 25, R.drawable.rota_goledafruta_ceb, 276, "De costas para a lanchonete, siga � direita\nMais � frente, o pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 10, 25, R.drawable.rota_ceb_setoresportivo, 413, "De costas para a entrada, siga � esquerda\nEntre na primeira � direita\nSiga at� o final da rua\nEntre � esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 10, 13, R.drawable.rota_residencia_setoresportivo, 361, "De costas para a entrada, siga � esquerda\nNo fim da rua, o pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 25, 11, R.drawable.rota_ccs_ceb, 126, "De costas para o pr�dio, siga � esquerda\nOs pr�dios estar�o � sua direita");
		dh.insertRoute(++id, 25, 12, R.drawable.rota_ceb_hu, 164, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 11, 12, R.drawable.rota_hu_ccs, 72, "O pr�dio est� � sua frente");
		dh.insertRoute(++id, 12, 13, R.drawable.rota_residencia_hu, 209, "De costas para o pr�dio, siga � direita\nAo fim da rua, o pr�dio estar� � sua frente");
		dh.insertRoute(++id, 1, 24, R.drawable.rota_ca_lando, 145, "Certifique-se que est� no come�o do Bloco A\n Acompanhe-o at� o estacionamento ao final do bloco\nA lanchonete estar� � sua frente");
		dh.insertRoute(++id, 24, 17, R.drawable.rota_ci_lando, 111, "De costas � sa�da para a rua, siga � esquerda\nMais � frente, o pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 17, 33, R.drawable.rota_ci_dmdfde, 54, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 33, 8, R.drawable.rota_dmdfde_ccen, 51, "De costas para o pr�dio, siga � esquerda\nVoc� chegar� na regi�o do Centro");
		dh.insertRoute(++id, 8, 32, R.drawable.rota_ccen_dqdgdcn, 170, "De costas para a Biblioteca Setorial, siga em frente\nOs pr�dios estar�o � sua direita");
		dh.insertRoute(++id, 32, 31, R.drawable.rota_santander_dqdg_dcn, 177, "Siga a pista curvil�nea\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 22, 16, R.drawable.rota_cta_ru, 169, "De costas para o pr�dio, siga � direita\nAo final da rua, entre � esquerda\n Mais � frente, o pr�dio estar� � sua esquerda");		
		
		//Invertendo
		
		dh.insertRoute(++id, 21, 2, R.drawable.rota_ct_cear, 164, "Siga em frente em dire��o � rotat�ria da entrada da UFPB\nEntre � esquerda na rotat�ria\nSiga em frente e o conjunto de pr�dios estar� � sua esquerda");
		dh.insertRoute(++id, 23, 21, R.drawable.rota_ccj_cear, 165, "Da rotat�ria em frente ao pr�dio, siga em dire��o � rotat�ria da entrada da UFPB\nO pr�dio estar� � sua direita, antes de chegar a rotat�ria");
		dh.insertRoute(++id, 1, 23, R.drawable.rota_ccj_ca, 50, "Certifique-se que est� no Bloco A\nAtravesse a rua at� o pr�dio em frente � rotat�ria");
		dh.insertRoute(++id, 3, 23, R.drawable.rota_ccj_ccsa, 61, "Siga at� a rotat�ria mais pr�xima\nAtravesse a rua em dire��o ao pr�dio de frente a ela");
		dh.insertRoute(++id, 3, 1, R.drawable.rota_ca_ccsa, 79, "Atravesse a rua em dire��o ao conjunto de pr�dios enfileirados");
		dh.insertRoute(++id, 4, 3, R.drawable.rota_ccsa_ce, 123, "Observe a placa denominada CCSA\nAnde em dire��o a ela");
		dh.insertRoute(++id, 5, 4, R.drawable.rota_ce_cchla, 91, "Siga na dire��o oposta � rotat�ria mais pr�xima\nSer� o pr�ximo conjunto de pr�dios");
		dh.insertRoute(++id, 34, 5, R.drawable.rota_cchla_rotatoria, 5, "Observe a placa denominada CCHLA\nAnde em dire��o a ela");
		dh.insertRoute(++id, 30, 34, R.drawable.rota_rotatoria_concerthall, 56, "Siga at� a rotat�ria mais pr�xima");
		dh.insertRoute(++id, 22, 34, R.drawable.rota_cta_rotatoria, 150, "Siga em frente em dire��o � principal\nVire � direita\nSiga em frente em dire��o � rotat�ria");
		dh.insertRoute(++id, 16, 34, R.drawable.rota_ru_rotatoria, 222, "Siga em frente na dire��o oposta ao estacionamento\nSer� a primeira rotat�ria, em frente � entrada da UFPB");
		dh.insertRoute(++id, 6, 16, R.drawable.rota_ru_centro_de_vivencia, 48, "Note o conjunto de entradas que levam ao pr�dio cheio de mesas\n� esse pr�dio mesmo");
		dh.insertRoute(++id, 15, 6, R.drawable.rota_centrodevivencia_codisma, 42, "Observe o p�tio coberto\nSiga at� ele");
		dh.insertRoute(++id, 28, 15, R.drawable.rota_codisma_tvufpb, 135, "Atravesse a rua\nSiga em frente em dire��o ao gazebo\nO pr�dio estar� � sua direita, logo antes do Centro de Viv�ncia");
		dh.insertRoute(++id, 27, 28, R.drawable.rota_baratao_tvufpb, 75, "Siga at� a sa�da da rua\nEntre � esquerda\nSiga em frente\nO pr�ido estar� � sua esquerda");
		dh.insertRoute(++id, 18, 28, R.drawable.rota_tvufpb_caixa, 151, "Siga em frente na pista principal\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 18, 22, R.drawable.rota_cta_caixa, 170, "Siga � rua em frente ao pr�dio\nO conjunto de pr�dios estar� � sua direita");
		dh.insertRoute(++id, 18, 34, R.drawable.rota_caixa_rotatoria, 255, "De costas � entrada da UFPB, entre � esquerda\nSiga a passarela coberta\nEntre a direita\nO pr�dio estar� � sua esquerda, em frente ao estacionamento");
		dh.insertRoute(++id, 18, 27, R.drawable.rota_baratao_caixa, 148, "Siga em frente na rua principal\nEntre � esquerda na primeira esquina");
		dh.insertRoute(++id, 14, 28, R.drawable.rota_tvufpb_setordevigilancia, 164, "De costas para o pr�dio, siga � direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 35, 14, R.drawable.rota_setoresportivo_rotatoria, 127, "De costas para a entrada do campus, siga � sua direita\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 9, 35, R.drawable.rota_reitoria_rotatoria, 110, "De costas para o pr�dio, siga � esquerda\nA rotat�ria estar� logo � frente");
		dh.insertRoute(++id, 10, 35, R.drawable.rota_setoresportivo_rotatoria, 167, "De costas para a entrada, siga � direita\nA rotat�ria estar� logo � frente");
		dh.insertRoute(++id, 29, 9, R.drawable.rota_nti_reitoria, 75, "Atravesse a rua\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 19, 9, R.drawable.rota_reitoria_ufpbvirtual, 61, "Atravesse o estacionamento em frente ao pr�dio\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 20, 16, R.drawable.rota_bb_ru, 116, "De costas para o pr�dio, siga � direita\nO pr�dio esta�ra � sua frente");
		dh.insertRoute(++id, 20, 6, R.drawable.rota_bb_centrodevivencia, 77, "De costas para o pr�dio, siga � direita\nA entrada do pr�dio estar� � sua direita");
		dh.insertRoute(++id, 7, 20, R.drawable.rota_bb_bibliotecacentral, 44, "Atravesse a rua\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 31, 7, R.drawable.rota_santander_bibliotecacentral, 136, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 29, 31, R.drawable.rota_nti_santander, 107, "De costas para o pr�dio, siga � esquerda\nEntre � esquerda na primeira entrada\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 29, 7, R.drawable.rota_nti_bibliotecacentral, 165, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 26, 29, R.drawable.rota_nti_goledafruta, 74, "De costas para � lanchonete, siga � esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 19, 26, R.drawable.rota_goledafruta_ufpbvirtual, 69, "De costas para o pr�dio, vire � esquerda\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 19, 29, R.drawable.rota_nti_ufpbvirtual, 64, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua frente");
		dh.insertRoute(++id, 10, 19, R.drawable.rota_ufpbvirtual_setoresportivo, 240, "De costas para a entrada, siga � direita\nEntre � esquerda na primeira rua\nSiga em frente\nO pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 25, 26, R.drawable.rota_goledafruta_ceb, 276, "De costas para o pr�dio, siga � direita\nMais � frente, o pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 25, 10, R.drawable.rota_ceb_setoresportivo, 413, "De costas para o pr�dio, siga � direita\nEntre na primeira � direita\nSiga at� o fim da rua\nEntre � esquerda\nMais � frente, a entrada estar� � sua direita");
		dh.insertRoute(++id, 13, 10, R.drawable.rota_residencia_setoresportivo, 361, "De costas para o pr�dio, siga � direita\nMais � frente, o pr�dio estar� � sua direita");
		dh.insertRoute(++id, 11, 25, R.drawable.rota_ccs_ceb, 126, "De costas para o pr�dio, siga � esquerda\nEntre � esquerda\nMais � frente, o pr�dio estar� � sua direita");
		dh.insertRoute(++id, 12, 25, R.drawable.rota_ceb_hu, 164, "De costas para o pr�dio, siga � esquerda\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 12, 11, R.drawable.rota_hu_ccs, 72, "De costas para o pr�dio, siga � esquerda\nOs pr�dios estar�o � sua frente");
		dh.insertRoute(++id, 13, 12, R.drawable.rota_residencia_hu, 209, "De costas para o pr�dio, siga � direita\nEntre na primeira � esquerda\n Mais � frente, o pr�dio estar� � sua esquerda");
		dh.insertRoute(++id, 24, 1, R.drawable.rota_ca_lando, 145, "Siga at� o estacionamento\nO conjunto de pr�dios estar� � sua frente");
		dh.insertRoute(++id, 17, 24, R.drawable.rota_ci_lando, 111, "De costas para o pr�dio, siga � direita\nMais � frente, o pr�dio estar� � sua direita");
		dh.insertRoute(++id, 33, 17, R.drawable.rota_ci_dmdfde, 54, "De costas para o pr�dio, o pr�dio estar� � sua frente");
		dh.insertRoute(++id, 8, 33, R.drawable.rota_dmdfde_ccen, 51, "De costas para a Biblioteca Setorial, siga � esquerda\nO pr�dio estar� � sua direita");
		dh.insertRoute(++id, 32, 8, R.drawable.rota_ccen_dqdgdcn, 170, "De costas para os p�tios, siga � esquerda\nVoc� chegar� na regi�o do Centro");
		dh.insertRoute(++id, 31, 32, R.drawable.rota_santander_dqdg_dcn, 177, "De costas para o pr�dio, vire � direita\nA entrada para os pr�dios estar� � sua direita");
		dh.insertRoute(++id, 16, 22, R.drawable.rota_cta_ru, 169, "De costas para o restaurante, siga � direita\nEntre na primeira � direita\nOs pr�dios estar�o � sua esquerda");		
	
		
	}

}
