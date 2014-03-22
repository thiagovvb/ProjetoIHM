package entities;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Route implements Serializable {
	private int id;
	private int sourceId; //Primary Key A
	private int destinationId; //Primary Key B
	private int map;
	private String instruction;
	
	public Route(int id, int sourceId, int destinationId, int map, String instruction) {
		this.id = id;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.map = map;
		this.instruction = instruction;
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

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
	public void copyRoute(int id, int sourceId, int destinationId, int map, String instruction) {
		this.id = id;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.map = map;
		this.instruction = instruction;
	}

	@Override
	public String toString() {
		return "Route [sourceId=" + sourceId + ", destinationId="
				+ destinationId + "]";
	}	
}
