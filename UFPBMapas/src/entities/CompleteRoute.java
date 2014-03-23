package entities;

import java.util.ArrayList;

import android.content.Context;

public class CompleteRoute {
	private ArrayList<Route> completeRoute;

	public CompleteRoute(Context context) {
		completeRoute = new ArrayList<Route>();
	}
	
	public ArrayList<Route> getCompleteRoute() {
		return completeRoute;
	}

	public void setCompleteRoute(ArrayList<Route> completeRoute) {
		this.completeRoute = completeRoute;
	}
	
	public Route getRoute(int id) {
		return completeRoute.get(id);
	}
	
	public void setRoute(int id, Route route) {
		this.completeRoute.set(id, route);
	}
	
	public void create(int source, int destination) {
		Graph.getInstance().dijkstra(source, destination);
		int j = Graph.getInstance().getDist().length;
		int aux = destination;
		//eu acho que este laço vai dar infinito
		while(aux != source) {
			for(int i = 0; i < j; i++) {
				completeRoute.add(Graph.getInstance().getRoute(Graph.getInstance().getPrev()[aux], aux));
				aux = Graph.getInstance().getPrev()[aux];
			}
		}
	}
}
