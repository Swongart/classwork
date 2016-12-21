package gui.Screens;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.Action;
import gui.Components.Button;
import gui.Components.Graphic;
import gui.Components.TextArea;
import gui.Components.TextLabel;
import gui.Components.Visible;


public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	public Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic pika;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,"Button", new Color(100,100,250), new Action(){
			public void act(){
				
			}
		});
		viewObjects.add(button);
			text= new TextLabel(20,200,500,40,"Some text");
			viewObjects.add(text);
			area=new TextArea(20,200,500,40,"This is really long text. It prints over multiple times, as you can see.");
			viewObjects.add(area);
		
				pika= new Graphic(30,30,100,100, "resources/sampleImages/pika.png");
		viewObjects.add(pika);
		//TextLabel text = new TextLabel(20, 200, 500, 40, "Some text");
		//viewObjects.add(text);
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

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
