package entities;

import java.util.ArrayList;

import dbclasses.DataHandler;

import android.content.Context;

public class Graph {
	private Context context;
	private ArrayList<Landmark> landmark;
	private ArrayList<Route> route;
	private int[] dist;
	private int[] prev;
	private static Graph uniqueInstance = null;
	
	private Graph() {
		System.out.println("Começou Graph");
		DataHandler dh = new DataHandler(context);
		dh.open();
		System.out.println("Gerou e abriu dh");
		landmark = dh.fetchLandmark();
		System.out.println("Fetchou landmarks");
		route = dh.fetchRoute();
		System.out.println("Fetchou routes");
		dh.close();
		System.out.println("Fechou dh");
		System.out.println("Acabou Graph");
	}
	
	public static Graph getInstance() {
		if(uniqueInstance == null)
			uniqueInstance = new Graph();
		return uniqueInstance;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public void setDist(int[] dist) {
		this.dist = dist;
	}

	public void setPrev(int[] prev) {
		this.prev = prev;
	}

	public ArrayList<Landmark> getAllLandmarks() {
		return landmark;
	}
	
	public void setAllLandmarks(ArrayList<Landmark> landmark) {
		this.landmark = landmark;
	}
	
	public Landmark getLandmark(int id) {
		return landmark.get(id);
	}
	
	public void setLandmark(int id, Landmark landmark) {
		this.landmark.set(id, landmark);
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
	
	public Route getRoute(int source, int destination) {
		for(Route r : route) {
			if(r.getSourceId() == source && r.getDestinationId() == destination) {
				return r;
			}
		}
		return null;
	}
	
	public void setRoute(int id, Route route) {
		this.route.set(id, route);
	}
	
	public int[] getDist() {
		return dist;
	}
	
	public int getDistSize(){
		return dist.length;
	}
	
	public int[] getPrev() {
		return prev;
	}
	
	public int getPrevSize(){
		return prev.length;
	}
	
	public ArrayList<Integer> getConnectedTo(int id) {
		ArrayList<Integer> con = new ArrayList<Integer>();
		for(Route r : route) {
			if(r.getSourceId() == id) {
				con.add(r.getDestinationId());
			}
		}
		return con;
	}
		
	public String toString() {
		return "Grafo com " + route.size() + " rotas.";
	}
	
	public void dijkstra(int source) {
		System.out.println("Começou Dijkstra, source = " + source);
		int[] ids = new int[landmark.size()];
		dist = new int[landmark.size()];
		prev = new int[landmark.size()];
		ArrayList<Integer> q = new ArrayList<Integer>();
		
		for (Landmark l : landmark) {
			ids[l.getId() - 1] = l.getId();
			dist[l.getId() - 1] = Integer.MAX_VALUE;
			prev[l.getId() - 1] = -1;
			q.add(l.getId());
		}
		
		dist[source-1] = 0;
				
		while(q.size() > 0) {
			int i = -1;
			int u = Integer.MAX_VALUE;
			for(int j = 0; j < dist.length; j++){
				if(dist[j] < u) {
					i = j+1;
					u = dist[j];
				}
			}
			
			q.remove(i-1);
			
			if(dist[i-1] == Integer.MAX_VALUE)
				break;
			
			ArrayList<Integer> connected = getConnectedTo(i);
			
			for(Integer v : connected){
				int alt = dist[i-1] + getRoute(i, v).getDist();
				if(alt < dist[v-1]) {
					dist[v-1] = alt;
					prev[v-1] = i;
				}
			}
		}
		System.out.println("Acabou Dijkstra");
	}
}