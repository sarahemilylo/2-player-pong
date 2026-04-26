import java.awt.*;
import javax.swing.*;

public class JPong extends JPanel{
	// Properties
	int intBallX = 620;
	int intBallY = 340;
	int intBallDeltaX = 10;
	int intBallDeltaY = 10;
	int intAPaddleY = 320;
	int intBPaddleY = 320;
	int intScore1 = 0;
	int intScore2 = 0;
	
	// Methods
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// Background
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1280, 720);
		
		// Ball
		g.setColor(Color.WHITE);
		g.fillOval(intBallX, intBallY, 40, 40);
		
		// Paddle 1
		g.setColor(Color.WHITE);
		g.fillRect(30, intAPaddleY, 15, 80);
		
		// Paddle 2
		g.setColor(Color.WHITE);
		g.fillRect(1235, intBPaddleY, 15, 80);
		
		// Scores
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 36));
		g.drawString("Player 1: " + intScore1, 100, 50);
		g.drawString("Player 2: " + intScore2, 950, 50);
		
		// Center Line 
		g.setColor(new Color(200, 200, 200));
		for(int intCount = 0; intCount < 720; intCount += 30){
			g.fillRect(635, intCount, 10, 20);
		}
	}
	
	// Constructor
	public JPong(){
		super();
	}

}
