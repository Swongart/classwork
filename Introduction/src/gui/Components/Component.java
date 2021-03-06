package gui.Components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Component implements Visible {
	//FIELDS
	public int x;
	public int y;
	public int w;
	public int h;
	private BufferedImage image;

	public Component(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.image=new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
	}


	public BufferedImage getImage() {

		return image;
	}
	

	public int getX() {
		
		return x;
	}


	public int getY() {
		
		return y;
	}


	public int getWidth() {
		return w;
	}


	public int getHeight() {
		
		return h;
	}


	public boolean isAnimated() {
		return false;
	}


	public void update() {
		update(image.createGraphics());

	}
	public abstract void update(Graphics2D g);
	
	//Deletes image to start over
	public Graphics2D clear(){
		image=new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		return image.createGraphics();
	}

}
