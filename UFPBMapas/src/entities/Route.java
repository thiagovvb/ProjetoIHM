package entities;

import java.util.ArrayList;

import android.widget.ImageView;

public class Route {
	private String sourceId; //Primary Key A
	private String destinationId; //Primary Key B
	private ImageView map;
	private ArrayList<Step> allTurns;
	
	public Route(String id, String sourceId, String destinationId, ImageView map, ArrayList<Step> allTurns) {
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.map = map;
		this.allTurns = allTurns;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public ImageView getMap() {
		return map;
	}

	public void setMap(ImageView map) {
		this.map = map;
	}

	public ArrayList<Step> getAllTurns() {
		return allTurns;
	}

	public void setAllTurns(ArrayList<Step> allTurns) {
		this.allTurns = allTurns;
	}
	
	public void copyRoute(String id, String sourceId, String destinationId, ImageView map, ArrayList<Step> allTurns) {
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
