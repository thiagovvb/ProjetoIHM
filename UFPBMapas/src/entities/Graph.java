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
	
	public String toString() {
		return "Grafo com " + route.size() + " rotas.";
	}
	
	public void dijkstra(int source, int destination) {
		System.out.println("Começou Dijkstra, source = " + source + " e dest = " + destination);
		dist = new int[landmark.size()];
		System.out.println("DIST SIZE = " + dist.length);
		System.out.println("Gerou dist com size = " + landmark.size());
		prev = new int[landmark.size()];
		System.out.println("Gerou prev");
		ArrayList<Integer> q = new ArrayList<Integer>();
		System.out.println("Gerou q");
		for (Landmark l : landmark) {
			dist[l.getId() - 1] = Integer.MAX_VALUE;
			prev[l.getId() - 1] = -1;
			q.add(l.getId() - 1);
		}
		System.out.println("Preencheu dist, prev e q");
		dist[source] = 0;
		System.out.println("Dist 0 é 0");
		while(q.size() == 0) {
			int i = -1;
			int u = Integer.MAX_VALUE;
			for(Route r : route){
				u = Math.min(u, r.getDist());
				if(r.getDist() <= u)
					i = r.getSourceId();
			}
			q.remove(i-1);
			if(dist[i-1] == Integer.MAX_VALUE)
				break;
			for(Route r : route){
				if(r.getSourceId() == i){
					int v = r.getDestinationId();
					int alt = dist[i-1] + r.getDist();
					if(alt < dist[v-1]) {
						dist[v-1] = alt;
						prev[v-1] = u;
						q.remove(v-1);
					}
				}
			}
		}
		System.out.println("Acabou Dijkstra");
	}
}