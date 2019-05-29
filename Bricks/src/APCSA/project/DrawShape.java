package APCSA.project;
import java.awt.color.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShape extends JFrame{
   private int frameWidth = 700;
   private int frameHeight = 500;
   Color maroon = new Color(130, 10, 10);
   public DrawShape(){
      setBounds(100, 100, frameWidth, frameHeight);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public void paint(Graphics g){
	  Ball ball = new Ball();
	  g.setColor(Color.white);
      g.fillRect(0, 0, frameWidth, frameHeight);
      g.setColor(maroon);
      int xPos = 30;
      int yPos = 30;
      int width = 65;
      int height = 25;
      for(int r = 0 ; r < 4; r++) {
    	  for(int c = 0; c < 8; c++) {
    		  g.fillRect(xPos, yPos, width, height);
    		  xPos += width + 15;
    	  }
    	  xPos = 30;
    	  yPos += height + 15;
      }
      
      

      
   }
   public static void main(String args[]){
      new DrawShape();
      
   }
}