package entities;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Route>	 route;
	private static Graph uniqueInstance = null;
	
	public static Graph getInstance() {
		if(uniqueInstance == null)
			return new Graph();
		return uniqueInstance;
	}
	
	public ArrayList<Route> getAllRoutes() {
		return route;
	}
	
	public void setAllRoutes(ArrayList<Route> route) {
		this.route = route;
	}
	
	public Route getRoute(int id) {
		return route.get(id);
	}
	
	public void setRoute(int id, Route route) {
		this.route.set(id, route);
	}
	
	public String toString() {
		return "Grafo com " + route.size() + " rotas.";
	}
}