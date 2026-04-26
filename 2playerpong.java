// 2 Player Pong
// Left - controlled by W (up) & S (down) keys; Right - controlled by mouse

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class 2playerpong implements ActionListener, MouseMotionListener, MouseListener, KeyListener{
	// Properties
	JFrame theFrame = new JFrame("Pong!");
	JPong thePanel = new JPong();
	Timer theTimer = new Timer(1000/60, this);
	
	// Methods
	public void actionPerformed(ActionEvent evt){
		// Animate Ball
		thePanel.repaint();
		thePanel.intBallX += thePanel.intBallDeltaX;
		thePanel.intBallY += thePanel.intBallDeltaY;
		
		// Bounce off Top & Bottom Walls
		if(thePanel.intBallY > 680 || thePanel.intBallY < 0){
			thePanel.intBallDeltaY *= -1;
		}
		
		// Player 2 Scores if ball goes off left
		if(thePanel.intBallX < 0){
			thePanel.intScore2 += 1;
			thePanel.intBallX = 620;
			thePanel.intBallY = 340;
			thePanel.intBallDeltaX = 10;
			thePanel.intBallDeltaY = 10;
		}

		// Player 1 Scores if ball goes off right side
		if(thePanel.intBallX > 1240){
			thePanel.intScore1 += 1;
			thePanel.intBallX = 620;
			thePanel.intBallY = 340;
			thePanel.intBallDeltaX = -10;
			thePanel.intBallDeltaY = 10;
		}
		
		// Bounce off Paddle A (Left Paddle)
		if(thePanel.intBallX <= 45 && (thePanel.intBallX + 40) >= 30 && (thePanel.intBallY + 40) >= thePanel.intAPaddleY && thePanel.intBallY <= (thePanel.intAPaddleY + 80)){
			thePanel.intBallDeltaX = Math.abs(thePanel.intBallDeltaX);
			int intDifference = (thePanel.intBallY + 20) - (thePanel.intAPaddleY + 40); // difference of center of ball
			thePanel.intBallDeltaY = intDifference/4;
		}
		
		// Bounce off Paddle B (Right Paddle)
		if((thePanel.intBallX + 40) >= 1235 && thePanel.intBallX <= 1250 && (thePanel.intBallY + 40) >= thePanel.intBPaddleY && thePanel.intBallY <= (thePanel.intBPaddleY + 80)){
			thePanel.intBallDeltaX = -Math.abs(thePanel.intBallDeltaX);
			int intDifference = (thePanel.intBallY + 20) - (thePanel.intBPaddleY + 40); // difference of center of ball
			thePanel.intBallDeltaY = intDifference/4;
		}
	}
	
	public void keyReleased(KeyEvent evt){
	}
	
	public void keyPressed(KeyEvent evt){
		// Player 1 Uses Keys
		if(evt.getKeyChar() == 'w'){
			// Prevent From Going Off Screen
			if(thePanel.intAPaddleY > 0){
				thePanel.intAPaddleY -= 20;
			}
		}else if(evt.getKeyChar() == 's'){
			// Prevent From Going Off Screen
			if(thePanel.intAPaddleY < 640){
				thePanel.intAPaddleY += 20;
			}
		}
	}
	
	public void keyTyped(KeyEvent evt){
	}
	
	public void mouseMoved(MouseEvent evt){
		// Player 2 Uses Mouse
		thePanel.intBPaddleY = evt.getY() - 20;
	}
	
	public void mouseDragged(MouseEvent evt){ 
	}
	
	public void mouseExited(MouseEvent evt){
		theTimer.stop();
	}
	
	public void mouseEntered(MouseEvent evt){
		theTimer.start();
	}
	
	public void mouseReleased(MouseEvent evt){
	}

	public void mousePressed(MouseEvent evt){
	}
	
	public void mouseClicked(MouseEvent evt){	
	}
	
	// Constructor
	public 2playerpong(){
		// Set Panel 
		thePanel.setPreferredSize(new Dimension(1280, 720));
		thePanel.addMouseMotionListener(this);
		thePanel.addMouseListener(this);
		
		// Set Frame
		theFrame.setContentPane(thePanel);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.pack();
		theFrame.setVisible(true);
		theFrame.addKeyListener(this);
		
		// Start Timer
		theTimer.start();
	}
	
	// Main Program
	public static void main(String[] args){
		new 2playerpong();
	}
} 
