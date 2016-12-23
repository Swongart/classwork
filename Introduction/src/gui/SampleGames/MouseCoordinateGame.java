package gui.SampleGames;

import gui.GUIApplication;


public class MouseCoordinateGame extends GUIApplication {

	public static MouseCoordinateGame game;
	public static TextScreen coordinateScreen;
	
	
	private boolean coordMode;
	
	public static void main(String[] args){
		game = new MouseCoordinateGame(500, 500);
		Thread app = new Thread(game);
		app.start();
	}
	
	public MouseCoordinateGame(int width, int height) {
		super(width, height);
		coordMode = true;
	}


	

}
