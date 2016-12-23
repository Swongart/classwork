package gui.Components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
	
	//FIELDS
	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;

	public Graphic(int x, int y, String imageLocation) {
	this.x=x;
	this.y=y;
	loadedImages=false;
	loadImages(imageLocation,0,0);
		
	}
	/**
	 * Full size graphics constructor
	 * @param w
	 * @param h
	 * @param imageLocation
	 */
	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.x=x;
		this.y=y;
		loadedImages=false;
		loadImages(imageLocation,w,h);
			
		}
	/**
	 * Scaled size graphics constructor
	 * @param w
	 * @param h
	 * @param imageLocation
	 */
	public Graphic(int x, int y, double scale, String imageLocation) {
		this.x=x;
		this.y=y;
		loadedImages=false;
		loadImages(imageLocation,scale);
			
		}

	private void loadImages(String imageLocation, double scale) {
		try{
			//get the full size image
			ImageIcon icon= new ImageIcon(imageLocation);
			int newWidth=(int)(icon.getIconWidth()*scale);
			int newHeight=(int)(icon.getIconHeight()*scale);
			image= new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight, 0,0,icon.getIconWidth(),icon.getIconHeight(),null);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	private void loadImages(String imageLocation, int w, int h) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w<=0&& h<=0){
				//use fullsize icon
				image= new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//use graphics2D tool to copy the icon.
				Graphics2D g=image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				//use custom size icon
				image= new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//This is how you crop
				/**
				 * image to draw
				 * xCoord of destination
				 * yCoord of destination
				 * width of destination
				 * height of destination
				 * xCoord of target
				 * yCoord of target
				 * width of target
				 * height of target
				 * null
				 */
				g.drawImage(icon.getImage(),0, 0, w, h, 0, 0, icon.getIconWidth(),icon.getIconHeight(), null);
			}
			loadedImages=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public BufferedImage getImage() {
		
		return null;
	}

	public int getX() {
		
		return x;
	}

	public int getY() {
		
		return y;
	}

	public int getWidth() {
		
		return image.getWidth();
	}

	public int getHeight() {
		
		return image.getHeight();
	}

	public boolean isAnimated() {
		
		return false;
	}

	public void update() {
		
		
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}


}
