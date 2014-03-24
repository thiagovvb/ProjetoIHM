package entities;

import java.io.Serializable;
import java.util.ArrayList;

import android.content.Context;

@SuppressWarnings("serial")
public class CompleteRoute implements Serializable {
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
		System.out.println("Começou create");
		Graph.getInstance().dijkstra(source);
		int j = Graph.getInstance().getDistSize();
		int aux = destination;
		while(aux != source) {
			for(int i = 0; i < j; i++) {
				completeRoute.add(0,
						Graph.getInstance().getRoute(
								Graph.getInstance().getPrev()[aux-1], aux));
				aux = Graph.getInstance().getPrev()[aux-1];
				if(aux == source) break;
			}
		}
		System.out.println("Acabou create");
	}
}
