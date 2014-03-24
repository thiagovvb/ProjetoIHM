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
	 * Método responsável por preencher o bando de dados de landmarks
	 */
	public void databaseFillerLdm(DataHandler dh) {
		//DataHandler dh = new DataHandler(context);
		
		int id = 0;
		//Landmarks Relevantes
		dh.insertLandmark(++id, "CA", "Central de Aulas", R.drawable.img_ca, "Conjunto com  blocos de salas de aula.", 1);
		dh.insertLandmark(++id, "CT", "Centro de Tecnologia", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Arquitetura, Engenharia de Alimentos, Engenharia de Materiais, Engenharia de Produção, Engenharia Civil e " +
				"Ambiental, Engenharia Mecânica e Engenharia Química.", 1);
		dh.insertLandmark(++id, "CCSA", "Centro de Ciências Sociais Aplicadas", R.drawable.img_ccsa, "Neste centro estão os departamentos de " +
				"Administração, Ciências da Informação, Economia, Finanças e Contabillidade, e de Relações Internacionais.", 1);
		dh.insertLandmark(++id, "CE", "Centro de Educação", R.drawable.img_ce, "Neste centro estão os departamentos de " +
				"Fundamentação da Educação, Habilitação Pedagógica, Metodologia da Educação, Psicopedagogia e Ciências das " +
				"Religiões.", 1);
		dh.insertLandmark(++id, "CCHLA", "Centro de Ciências Humanas, Letras e Artes", R.drawable.img_cchla, "Neste centro estão os departamentos de " +
				"Ciências Sociais, Filosofia, História, Letras Clássicas e Vernáculas, Letras Estrangeiras Modernas, Midias Digitais, Psicologia " +
				"e Serviço Social.", 1);
		dh.insertLandmark(++id, "Centro de Vivência", "Centro de Vivência", R.drawable.img_centro_de_vivencia, "Neste local pode-se adicionar créditos ao passe legal, " +
				"e solicitar sua carteira de estudante. ", 1);
		dh.insertLandmark(++id, "Biblioteca Central", "Biblioteca Central", R.drawable.img_biblio_central, "Principal biblioteca da Universidade Federal da Paraíba.", 1);
		dh.insertLandmark(++id, "CCEN", "Centro de Ciências Exatas e da Natureza", R.drawable.img_biblio_ccen, "Neste centro estão os departamentos de " +
				"Biologia Molecular, Geociências, Sistematica e Ecologia, Estatística, Física, Matemática e Quimica. Bem como o NEPREMAR.", 1);
		dh.insertLandmark(++id, "Reitoria", "Reitoria da UFPB", R.drawable.img_reitoria, "Central Administrativa da Universidade Federal da Paraíba.", 1);
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
		dh.insertLandmark(++id, "CODISMA", "Cooperativa Cultural Universitária da Paraíba Ltda", R.drawable.img_codisma, " ", 1);
		dh.insertLandmark(++id, "Resturante Universitário", "Resturante Universitário", R.drawable.sem_imagem, "Local designado à alimentação dos alunos.", 1);
		dh.insertLandmark(++id, "CI", "Centro de Informática", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Computação Científica, Informática e Sistema de Computação.", 1);
		dh.insertLandmark(++id, "Caixa", "Caixa Econômica Federal", R.drawable.sem_imagem, " ", 1);
		dh.insertLandmark(++id, "UFPB Virtual", "UFPB Virtual", R.drawable.img_ufpb_virtual, "Local destinado à gerência dos cursos à distância.", 1);
		dh.insertLandmark(++id, "BB", "Banco do Brasil", R.drawable.sem_imagem, "", 1);
		dh.insertLandmark(++id, "CEAR", "Centro de Energias e Alternativas Renováveis", R.drawable.sem_imagem, "Neste centro estão os departamentos " +
				"de Energia Elétrica e Energias Renováveis.", 1);
		dh.insertLandmark(++id, "CCTA", "Centro de Comunicação, Turismo e Artes", R.drawable.sem_imagem, "Neste centro estão os departamentos de " +
				"Artes Cênicas, Artes Visuais, Comunicação e Turismo, Educação Musical e Música", 1);
		dh.insertLandmark(++id, "CCJ", "Centro de Ciências Jurídicas", R.drawable.img_ccj, "Neste centro estão os departamentos de " +
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
		dh.insertLandmark(++id, "DM, DF e DE", "Departamentos de Matemática, Física e Estatística", R.drawable.img_dm, " ", 1);

		//Landmarks não relevantes
		dh.insertLandmark(++id, "Rotatória ao lado do CCHLA", "Rotatória ao lado do CCHLA", R.drawable.sem_imagem, " ", 0);
		dh.insertLandmark(++id, "Rotatória próxima ao Setor Esportivo", "Rotatória próxima ao Setor Esportivo", R.drawable.sem_imagem, " ", 0);//*/
		
		ArrayList<Landmark> a = dh.fetchLandmark();
		for(int i = 0; i < a.size(); i++){
			System.out.println("Nome = " + a.get(i).getName() + " ID = " + a.get(i).getId());
		}
		
	}
	
	public void databaseFillerRoute(DataHandler dh) {
		//DataHandler dh = new DataHandler(context);
		int id = 0;
		
		int map = 0;
		String instruction = "";

		dh.insertRoute(id, 2, 21, map, 164, "Siga em direção à rotatória\nSiga em frente e a Entrada do CEAR estará à esquerda");
		dh.insertRoute(id, 21, 23, map, 165, "Siga em frente em direção à rotatória mais distante\nChegando lá, o prédio estará à sua direita");
		dh.insertRoute(id, 23, 1, map, 50, "Atravesse a rua em direção aos prédios enfileirados em frente ao estacionamento");
		dh.insertRoute(id, 23, 3, map, 61, "Atravesse a rua em direção ao prédio do lado oposto ao estacionamento.");
		dh.insertRoute(id, 1, 3, map, 79, "Certifique-se que está entre os primeiros quatro blocos\nAtravesse a rua em direção aos prédios do lado oposto ao estacionamento");
		dh.insertRoute(id, 3, 4, map, 123, "Siga em direção a rotatória mais distantes\nSerão os prédios mais próximos");
		dh.insertRoute(id, 4, 5, map, 91, "Observe a placa denominada CCHLA\nAnde em direção a ela.");
		dh.insertRoute(id, 5, 34, map, 58, "Siga em frente até a rotatória mais próxima");
		dh.insertRoute(id, 34, 30, map, 56, "Siga em direção à entrada da UFPB\nO prédio estará à sua direita");
		dh.insertRoute(id, 34, 22, map, 150, "Siga em frente na direção oposta da entrada da UFPB\nVire à esquerda na primeira rua\n Os prédios estarão à sua esquerda");
		dh.insertRoute(id, 34, 16, map, 222, "Siga em frente na direção oposta à entrada da UFPB\nO prédio estará à sua esquerda, logo antes do estacionamento");
		dh.insertRoute(id, 16, 6, map, 48, "Note a praça coberta em frente ao restaurante\nSiga até esse ponto");
		dh.insertRoute(id, 6, 15, map, 42, "De frente ao resturante, vire à direita");
		dh.insertRoute(id, 15, 28, map, 135, "Siga em linha reta em direção ao gazebo\nAtravesse a rua");
		dh.insertRoute(id, 28, 27, map, 75, "Siga em frente na direção da Caixa\nVire à direita na primeira entrada");
		dh.insertRoute(id, 28, 18, map, 151, "De costas à entrada, siga à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 22, 18, map, 170, "Siga em frente paralelamente à reserva\nAo final da rua, o prédio estará à sua frente");
		dh.insertRoute(id, 34, 18, map, 255, "Siga beirando os limites do campus até a passarela coberta\nSiga em frente até a rotatória");
		dh.insertRoute(id, 27, 18, map, 148, "Siga até a saída da rua\nEntre à direita\nO prédio estará na sua direita");
		dh.insertRoute(id, 28, 14, map, 164, "De costas para o prédio, siga à sua esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 14, 35, map, 127, "De costas para o prédio, siga à sua esquerda\nA rotatória estatrá logo à frente");
		dh.insertRoute(id, 35, 9, map, 110, "De costas à entrada do campus, siga em frente\nO prédio estará à sua direita");
		dh.insertRoute(id, 35, 10, map, 167, "De costas para a entrada do campus, siga à esquerda\nA entrada estará à sua esquerda");
		dh.insertRoute(id, 9, 29, map, 75, "De costas para a entrada, siga à direita\nAtravesse a rua\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 9, 19, map, 61, "Atravesse o estacionamento em frente ao prédio\nO prédio estará à sua frente");
		dh.insertRoute(id, 16, 20, map, 16, "Siga a calçada, passando pelo Centro de Vivência\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 6, 20, map, 77, "Dentro do Centro de Vivências, desça as escadas\nSiga em frente\nNa saída à sua direita, siga à esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 20, 7, map, 44, "Atravesse a rua\nO prédio estará à sua frente");
		dh.insertRoute(id, 7, 31, map, 136, "De costas para o prédio, siga à direita\nO prédio estará à sua frente");
		dh.insertRoute(id, 31, 29, map, 107, "De costas para o prédio, siga em frente até chegar à rua\nVire à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 7, 29, map, 165, "De costas para o prédio, siga à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 29, 26, map, 74, "De costas ao prédio, entre à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 26, 19, map, 69, "Atravesse a rua\nVire à esquerda\nEntre à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 29, 19, map, 64, "De costas para o prédio, siga em frente\nO prédio estará à sua direita");
		dh.insertRoute(id, 19, 10, map, 240, "De costas para o prédio, siga à direita\nEntre à sua direita\nSiga em frente\nA entrada estará à sua esquerda");
		dh.insertRoute(id, 26, 25, map, 276, "De costas para a lanchonete, siga à direita\nMais à frente, o prédio estará à sua esquerda");
		dh.insertRoute(id, 10, 25, map, 413, "De costas para a entrada, siga à esquerda\nEntre na primeira à direita\nSiga até o final da rua\nEntre à esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 10, 13, map, 361, "De costas para a entrada, siga à esquerda\nNo fim da rua, o prédio estará à sua esquerda");
		dh.insertRoute(id, 25, 11, map, 126, "De costas para o prédio, siga à esquerda\nOs prédios estarão à sua direita");
		dh.insertRoute(id, 25, 12, map, 164, "De costas para o prédio, siga à esquerda\nO prédio estará à sua frente");
		dh.insertRoute(id, 11, 12, map, 72, "O prédio está à sua frente");
		dh.insertRoute(id, 12, 13, map, 209, "De costas para o prédio, siga à direita\nAo fim da rua, o prédio estará à sua frente");
		dh.insertRoute(id, 1, 24, map, 145, "Certifique-se que está no começo do Bloco A\n Acompanhe-o até o estacionamento ao final do bloco\nA lanchonete estará à sua frente");
		dh.insertRoute(id, 24, 17, map, 111, "De costas à saída para a rua, siga à esquerda\nMais à frente, o prédio estará à sua esquerda");
		dh.insertRoute(id, 17, 33, map, 54, "De costas para o prédio, siga à esquerda\nO prédio estará à sua frente");
		dh.insertRoute(id, 33, 8, map, 51, "De costas para o prédio, siga à esquerda\nVocê chegará na região do Centro");
		dh.insertRoute(id, 8, 32, map, 170, "De costas para a Biblioteca Setorial, siga em frente\nOs prédios estarão à sua direita");
		dh.insertRoute(id, 32, 31, map, 177, "Siga a pista curvilínea\nO prédio estará à sua direita");
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
		
		dh.insertRoute(id, 21, 2, map, 164, "Siga em frente em direção à rotatória da entrada da UFPB\nEntre à esquerda na rotatória\nSiga em frente e o conjunto de prédios estará à sua esquerda");
		dh.insertRoute(id, 23, 21, map, 165, "Da rotatória em frente ao prédio, siga em direção à rotatória da entrada da UFPB\nO prédio estará á sua direita, antes de chegar a rotatória");
		dh.insertRoute(id, 1, 23, map, 50, "Certifique-se que está no Bloco A\nAtravesse a rua até o prédio em frente à rotatória");
		dh.insertRoute(id, 3, 23, map, 61, "Siga até a rotatória mais próxima\nAtravesse a rua em direção ao prédio de frente a ela");
		dh.insertRoute(id, 3, 1, map, 79, "Atravesse a rua em direção ao conjunto de prédios enfileirados");
		dh.insertRoute(id, 4, 3, map, 123, "Observe a placa denominada CCSA\nAnde em direção a ela");
		dh.insertRoute(id, 5, 4, map, 91, "Siga na direção oposta à rotatória mais próxima\nSerá o próximo conjunto de prédios");
		dh.insertRoute(id, 34, 5, map, 5, "Observe a placa denominada CCHLA\nAnde em direção a ela");
		dh.insertRoute(id, 30, 34, map, 56, "Siga até a rotatória mais próxima");
		dh.insertRoute(id, 22, 34, map, 150, "Siga em frente em direção à principal\nVire à direita\nSiga em frente em direção à rotatória");
		dh.insertRoute(id, 16, 34, map, 222, "Siga em frente na direção oposta ao estacionamento\nSerá a primeira rotatória, em frente à entrada da UFPB");
		dh.insertRoute(id, 6, 16, map, 48, "Note o conjunto de entradas que levam ao prédio cheio de mesas\nÉ esse prédio mesmo");
		dh.insertRoute(id, 15, 6, map, 42, "Observe o pátio coberto\nSiga até ele");
		dh.insertRoute(id, 28, 15, map, 135, "Atravesse a rua\nSiga em frente em direção ao gazebo\nO prédio estará à sua direita, logo antes do Centro de Vivência");
		dh.insertRoute(id, 27, 28, map, 75, "Siga até a saída da rua\nEntre à esquerda\nSiga em frente\nO préido estará à sua esquerda");
		dh.insertRoute(id, 18, 28, map, 151, "Siga em frente na pista principal\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 18, 22, map, 170, "Siga à rua em frente ao prédio\nO conjunto de prédios estará à sua direita");
		dh.insertRoute(id, 18, 34, map, 255, "De costas à entrada da UFPB, entre à esquerda\nSiga a passarela coberta\nEntre a direita\nO prédio estará à sua esquerda, em frente ao estacionamento");
		dh.insertRoute(id, 18, 27, map, 148, "Siga em frente na rua principal\nEntre à esquerda na primeira esquina");
		dh.insertRoute(id, 14, 28, map, 164, "De costas para o prédio, siga à direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 35, 14, map, 127, "De costas para a entrada do campus, siga à sua direita\nO prédio estará à sua direita");
		dh.insertRoute(id, 9, 35, map, 110, "De costas para o prédio, siga à esquerda\nA rotatória estará logo à frente");
		dh.insertRoute(id, 10, 35, map, 167, "De costas para a entrada, siga à direita\nA rotatória estará logo à frente");
		dh.insertRoute(id, 29, 9, map, 75, "Atravesse a rua\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 19, 9, map, 61, "Atravesse o estacionamento em frente ao prédio\nO prédio estará à sua frente");
		dh.insertRoute(id, 20, 16, map, 16, "De costas para o prédio, siga à direita\nO prédio esta´ra à sua frente");
		dh.insertRoute(id, 20, 6, map, 77, "De costas para o prédio, siga à direita\nA entrada do prédio estará à sua direita");
		dh.insertRoute(id, 7, 20, map, 44, "Atravesse a rua\nO prédio estará à sua frente");
		dh.insertRoute(id, 31, 7, map, 136, "De costas para o prédio, siga à esquerda\nO prédio estará à sua frente");
		dh.insertRoute(id, 29, 31, map, 107, "De costas para o prédio, siga à esquerda\nEntre à esquerda na primeira entrada\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 29, 7, map, 165, "De costas para o prédio, siga à esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 26, 29, map, 74, "De costas para à lanchonete, siga à esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 19, 26, map, 69, "De costas para o prédio, vire à esquerda\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 19, 29, map, 64, "De costas para o prédio, siga à esquerda\nO prédio estará à sua frente");
		dh.insertRoute(id, 10, 19, map, 240, "De costas para a entrada, siga à direita\nEntre à esquerda na primeira rua\nSiga em frente\nO prédio estará à sua esquerda");
		dh.insertRoute(id, 25, 26, map, 276, "De costas para o prédio, siga à direita\nMais à frente, o prédio estará à sua esquerda");
		dh.insertRoute(id, 25, 10, map, 413, "De costas para o prédio, siga à direita\nEntre na primeira à direita\nSiga até o fim da rua\nEntre à esquerda\nMais à frente, a entrada estará à sua direita");
		dh.insertRoute(id, 13, 10, map, 361, "De costas para o prédio, siga à direita\nMais à frente, o prédio estará à sua direita");
		dh.insertRoute(id, 11, 25, map, 126, "De costas para o prédio, siga à esquerda\nEntre à esquerda\nMais à frente, o prédio estará à sua direita");
		dh.insertRoute(id, 12, 25, map, 164, "De costas para o prédio, siga à esquerda\nO prédio estará à sua direita");
		dh.insertRoute(id, 12, 11, map, 72, "De costas para o prédio, siga à esquerda\nOs prédios estarão à sua frente");
		dh.insertRoute(id, 13, 12, map, 209, "De costas para o prédio, siga à direita\nEntre na primeira à esquerda\n Mais à frente, o prédio estará à sua esquerda");
		dh.insertRoute(id, 24, 1, map, 145, "Siga até o estacionamento\nO conjunto de prédios estará á sua frente");
		dh.insertRoute(id, 17, 24, map, 111, "De costas para o prédio, siga à direita\nMais à frente, o prédio estará à sua direita");
		dh.insertRoute(id, 33, 17, map, 54, "De costas para o prédio, o prédio estará à sua frente");
		dh.insertRoute(id, 8, 33, map, 51, "De costas para a Biblioteca Setorial, siga à esquerda\nO prédio estará à sua direita");
		dh.insertRoute(id, 32, 8, map, 170, "De costas para os pátios, siga à esquerda\nVocê chegará na região do Centro");
		dh.insertRoute(id, 31, 32, map, 177, "De costas para o prédio, vire à direita\nA entrada para os prédios estará à sua direita");
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
		dh.insertRoute(id, 18, 27, map, 148, instruction);
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
