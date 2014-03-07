package entities;

import android.widget.ImageView;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Landmark implements Serializable {
	private int id; //Primary Key
	private String name;
	private ImageView picture;
	private String description;
	
	public Landmark(int id, String name, ImageView picture, String description){
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ImageView getPicture() {
		return picture;
	}
	public void setPicture(ImageView picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void copyLandmark(int id, String name, ImageView picture, String description){
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
