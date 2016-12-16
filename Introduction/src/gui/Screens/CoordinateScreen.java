package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.Action;
import gui.Components.Button;
import gui.Components.TextLabel;
import gui.Components.Visible;


public class CoordinateScreen extends Screen implements MouseMotionListener{

	public Button button;
	private TextLabel text;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button=new Button(20,100,80,40,"Button", new Color(100,100,250), new Action()){
			public void act(){
				
			}
		};
			
		
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx= e.getX(); // get mouse X coord
		int my= e.getY(); // get mouse Y coord
		text.setText("Mouse at: "+mx+", "+my);
		
		
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
