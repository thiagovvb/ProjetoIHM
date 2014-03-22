package entities;

import java.util.ArrayList;

public class DBRoutes {

	private ArrayList<Route> routes;
	private static DBRoutes uniqueInstance = null;
	
	/**
	 * Construtor da classe
	 */
	private DBRoutes(){
		routes = new ArrayList<Route>();
	}
	
	public static DBRoutes getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new DBRoutes();
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
	public void addRoute(int id, int sourceId, int destinationId, int map, String instruction){
		Route aux = new Route(id, sourceId, destinationId, map, instruction);
		routes.add(aux);
	}
	
	/**
	 * Método para obtter uma route do bando de dados
	 * @param id
	 * @return
	 */
	public Route getRoute(int id){
		return routes.get(id-1);
	}
	
	/**
	 * Método que retorna o bando de dados
	 * @return
	 */
	public int DBsize(){
		return routes.size();		
	}
}
