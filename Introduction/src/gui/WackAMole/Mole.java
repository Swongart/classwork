package gui.WackAMole;

import gui.Components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y,.9, "resources/sampleImages/pika.png");
	}

//	public Mole(int x, int y, int w, int h, String imageLocation) {
//		super(x, y, w, h, imageLocation);
//		// TODO Auto-generated constructor stub
//	}
//
//	public Mole(int x, int y, double scale, String imageLocation) {
//		super(x, y, scale, imageLocation);
//		// TODO Auto-generated constructor stub
//	}


	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}


	public void setAppearanceTime(int screenTime) {
		// TODO Auto-generated method stub
		appearanceTime=screenTime;
	}

}
