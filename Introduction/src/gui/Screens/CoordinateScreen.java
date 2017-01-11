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
import gui.Components.MovingComponent;
import gui.Components.TextArea;
import gui.Components.TextLabel;
import gui.Components.Visible;
import gui.SampleGames.MouseFollower;


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

		button = new Button(20,240,80,40,"Button", new Color(100,100,250), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		//picture= new Graphic(50,50,.5,"resources/sampleImages/pika.png");
		viewObjects.add(button);
		text= new TextLabel(20,200,500,40,"Some text");
		viewObjects.add(text);
		area=new TextArea(20,200,500,40,"This is really long text. It prints over multiple times, as you can see.");
		viewObjects.add(area);

		pika= new Graphic(30,30,100,100, "resources/sampleImages/pika.png");
		viewObjects.add(pika);
		MovingComponent c = new MovingComponent(20,29,100,100);
		viewObjects.add(c);
		c.setVy(2);
		c.setVx(1);
		c.play();
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
	//get coordinates of mouse
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	// tracks movement and clicking
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if(button.isHovered(m.getX(), m.getY())){;
		button.act();
		}
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
