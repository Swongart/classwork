package gui.simon;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.Action;

import gui.Components.ClickableScreen;
import gui.Components.TextLabel;
import gui.Components.Visible;

public class SimonScreenSharonWong extends ClickableScreen implements Runnable {
	//fields

	private TextLabel label;
	private ButtonInterfaceSharonWong button;
	private ProgressInterfaceSharonWong progress;
	private ArrayList<MoveInterfaceSharonWong> order;
	
	/*
	 * int roundNumber
		boolean acceptingInput
		int sequenceIndex
		int lastSelectedButton
	
	*/
	private int roundNum;
	private boolean correct;
	private int orderIndex;
	private int last;
	
	
	
	public SimonScreenSharonWong(int width, int height) {
		super(width, height);
		
		Thread simonStart = new Thread(this);
		simonStart.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		order = new ArrayList<MoveInterfaceSharonWong>();
		//add 2 moves to start
		last = -1;
		order.add(randomMove());
		order.add(randomMove());
		roundNum = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
		
	}

	private MoveInterfaceSharonWong randomMove() {
		ButtonInterfaceSharonWong b;
		//code that randomly selects a ButtonInterfaceX
		return getMove(b);
	}

	private MoveInterfaceSharonWong getMove(ButtonInterfaceSharonWong b) {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceSharonWong getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons=5;
		
		Color blue = Color.blue;
		Color red = Color.red;
		Color black = Color.black;
		Color orange = Color.orange;
		Color pink = Color.pink;
		//place all buttons
		for(int i =0; i < numberOfButtons; i++){
			//b is an object that is a button interface
			final ButtonInterfaceSharonWong b = getAButton();
			b.setColor(Color.GRAY);
			b.setX(100+(i*10));
			b.setY(100+(i*10));
			b.setAction(new Action(){
				public void act(){
					if(correct){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
							}
						});
					}
				}
			});
		}
	}

	private ButtonInterfaceSharonWong getAButton() {
		// TODO Auto-generated method stub
		return null;
	}
		
}


