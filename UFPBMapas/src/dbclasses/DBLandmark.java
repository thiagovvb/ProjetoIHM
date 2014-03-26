package dbclasses;

import java.util.ArrayList;

import entities.Landmark;

public class DBLandmark {

	private static ArrayList<Landmark> landmarks;
	private static DBLandmark uniqueInstance = null;
	
	/**
	 * Construtor da classe
	 */
	private DBLandmark(){
		landmarks = new ArrayList<Landmark>();
	}
	
	public static DBLandmark getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new DBLandmark();
		}
		return uniqueInstance;
	}

	/**
	 * Método para adicionar um elemento ao banco de dados
	 * @param id
	 * @param name
	 * @param picture
	 * @param description
	 */
	public void addLdm(int id, String acronym, String name, int picture, String description, int relevant){
		Landmark aux = new Landmark(id, acronym, name, picture, description, relevant);
		landmarks.add(aux);
	}
	
	/**
	 * Método para obtter um landmark do bando de dados
	 * @param id
	 * @return
	 */
	public Landmark getLdm(int id){
		return landmarks.get(id-1);
	}
	
	/**
	 * Método que retorna o bando de dados
	 * @return
	 */
	public int DBsize(){
		return landmarks.size();		
	}
}
