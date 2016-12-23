package gui.SampleGames;

import gui.GUIApplication;
import gui.Screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	//FIELDS\
	public static MouseFollower game; // only ONE exists
	public static CoordinateScreen cs;
	public static MyScreen myScreen;

	
	public MouseFollower(int width, int height) {
		super(width, height);
		
	}

	
	public void initScreen() {
		cs= new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
		myScreen = new MyScreen(getWidth(), getHeight());
		
	}

	public static void main(String[] args) {
		game =new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
