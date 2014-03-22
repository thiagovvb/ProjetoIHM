package entities;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Landmark implements Serializable {
	private int id; //Primary Key
	private String acronym;
	private String name;
	private int picture;
	private String description;
	private ArrayList<Integer> directDestinations;
	
	public Landmark(int id, String acronym, String name, int picture, String description){
		this.id = id;
		this.name = name;
		this.acronym = acronym;
		this.picture = picture;
		this.description = description;
		this.directDestinations = null;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAcronym() {
		return acronym;
	}
	
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPicture() {
		return picture;
	}
	
	public void setPicture(int picture) {
		this.picture = picture;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<Integer> getDirectDestinations() {
		return directDestinations;
	}
	
	public void setDirectDestinations(ArrayList<Integer> directDestinations) {
		this.directDestinations = directDestinations;
	}
	
	public int getDestination(int id) {
		return directDestinations.get(id);
	}
	
	public void setDestination(int id, int destination) {
		this.directDestinations.set(id, destination);
	}
	
	public void copyLandmark(int id, String name, int picture, String description){
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Landmark [id=" + id + ", name=" + name + "]";
	}
	
}
