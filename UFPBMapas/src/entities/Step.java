package entities;

import android.widget.ImageView;

public class Step {
	private int order;
	private String instruction;
	private ImageView picture;
	private String description;
	
	public Step(int order, String instruction, ImageView picture, String description) {
		this.order = order;
		this.instruction = instruction;
		this.picture = picture;
		this.description = description;
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
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
	
	public void copyStep(int order, String instruction, ImageView picture, String description) {
		this.order = order;
		this.instruction = instruction;
		this.picture = picture;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Step [order=" + order + ", instruction=" + instruction + "]";
	}
}
