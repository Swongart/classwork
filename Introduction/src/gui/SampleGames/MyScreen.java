package gui.SampleGames;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Action;

import gui.Screen;
import gui.Components.Button;
import gui.Components.Action;
import gui.Components.Graphic;
import gui.Components.Visible;

public class MyScreen extends Screen implements MouseListener{
	private Graphic link;
	private Button back;
	

	public MyScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
//		link = new Graphic (200,200,25,"resources/sampleImages/pika.png");
//		back= new Button(50,50,100,60,"Back",Color.GRAY,new Action(){
//			public void act(){
//				MouseFollower.game.setScreen(MouseFollower.cs);
//			}
//		});
		
		viewObjects.add(link);
		viewObjects.add(back);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public MouseListener getMouseListener(){
		return this;
	}

}
