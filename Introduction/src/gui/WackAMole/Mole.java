package gui.WackAMole;

import gui.Components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y,.9, "resources/sampleImages/pika.png");
	}


	public int getAppearanceTime() {
		return appearanceTime;
	}


	public void setAppearanceTime(int screenTime) {
		appearanceTime=screenTime;
	}

}
