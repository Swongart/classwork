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
	private ButtonInterfaceSharonWong[] button;
	private ProgressInterfaceSharonWong progress;
	private ArrayList<MoveInterfaceSharonWong> sequence;
	
	/*
	 * int roundNumber
		boolean acceptingInput
		int sequenceIndex
		int lastSelectedButton
	
	*/
	private int roundNum;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int last;
	
	
	public SimonScreenSharonWong(int width, int height) {
		super(width, height);
		
		Thread simonStart = new Thread(this);
		simonStart.start();
	}

	@Override
	public void run() {
		label.setText("");
	    nextRound();

	}

	private void nextRound() {
		acceptingInput = false;
		roundNum++;
		sequence.add(randomMove());
		ProgressInterfaceSharonWong.setRound(roundNum);
		ProgressInterfaceSharonWong.setSequenceSize(sequence.size());
		changeText("Simon's turn");
		playSequence();
		changeText("Your turn");
		acceptingInput = true;
		sequenceIndex = 0;
		
	}

	private void playSequence() {
		
		ButtonInterfaceSharonWong b = null;
		for(int i =0; i<sequence.size();i++){
			if(b != null){
				b.dim();
			}
			b = ((ButtonInterfaceSharonWong)sequence).getButton();
			b.highlight();
			try {
				Thread.sleep((long) (1000*(5.0)/roundNum));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		b.dim();
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceSharonWong>();
		//add 2 moves to start
		last = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNum = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
		
	}

	private MoveInterfaceSharonWong randomMove() {
		ButtonInterfaceSharonWong b;
		//code that randomly selects a ButtonInterfaceX
		int rand = (int)(Math.random()*button.length);
		//if its equal then select rand again
		while(rand == last){
			rand = (int) (Math.random()*button.length);
		}
		last = rand;
		
		return getMove(b);
	}

	private MoveInterfaceSharonWong getMove(ButtonInterfaceSharonWong b) {
		// TODO Auto-generated method stub
		return null;
	}

	

	private void addButtons() {
		
		int numberOfButtons = 5;
		Color[] buttonColor = {Color.blue, Color.red,Color.pink,Color.orange,Color.yellow};
		//place all buttons
		for(int i =0; i < numberOfButtons; i++){
			final ButtonInterfaceSharonWong b = getAButton();
			b.setColor(buttonColor[i]);
			b.setX(100+(i*20));
			b.setY(100+(i*20));
			b.setAction(new Action(){
				
				public void act(){
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						if(b == sequence.get(sequenceIndex).getButton()){
							sequenceIndex++;
						}else{
							ProgressInterfaceSharonWong.getOver();
						}
						if(sequenceIndex == sequence.size()){
							Thread nextRound = new Thread(SimonScreenSharonWong.this);
							nextRound.start(); 
						}
					}
				}
			});
			viewObjects.add(b);
		}
	}

	
	private void changeText(String string) {
		try{
			label.setText(string);
			Thread.sleep(500);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private ButtonInterfaceSharonWong getAButton() {
		// TODO Auto-generated method stub
		return null;
	}
	private ProgressInterfaceSharonWong getProgress() {
		// TODO Auto-generated method stub
		return null;
	}	
}


