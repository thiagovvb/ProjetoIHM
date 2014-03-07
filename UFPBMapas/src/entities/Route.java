package entities;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Route implements Serializable {
	private int id;
	private int sourceId; //Primary Key A
	private int destinationId; //Primary Key B
	private int map;
	private ArrayList<Step> allTurns;
	
	public Route(int id, int sourceId, int destinationId, int map, ArrayList<Step> allTurns) {
		this.id = id;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.map = map;
		this.allTurns = allTurns;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public int getMap() {
		return map;
	}

	public void setMap(int map) {
		this.map = map;
	}

	public ArrayList<Step> getAllTurns() {
		return allTurns;
	}

	public void setAllTurns(ArrayList<Step> allTurns) {
		this.allTurns = allTurns;
	}
	
	public void copyRoute(int id, int sourceId, int destinationId, int map, ArrayList<Step> allTurns) {
		this.id = id;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.map = map;
		this.allTurns = allTurns;
	}

	@Override
	public String toString() {
		return "Route [sourceId=" + sourceId + ", destinationId="
				+ destinationId + "]";
	}	
}
