package gui.WackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.Components.Component;

public class Player extends Component implements PlayerInterface {
	private int score;
	
	public Player() {
		super(20, 20, 100, 100);
		
	}

	public void increaseScore(int i) {
		score+=1;
		update();

	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(new Color(200,220,255));
		g.fillOval(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawOval(0,0,99,99);
		g.drawString("Score= "+score, 40, 55);
		
	}

}
