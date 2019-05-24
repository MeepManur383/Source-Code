package APCSA.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShape extends JFrame{
   private int frameWidth = 700;
   private int frameHeight = 500;
   public DrawShape(){
      setBounds(100, 100, frameWidth, frameHeight);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public void paint(Graphics g){
      g.setColor(Color.black);
      g.fillRect(0, 0, frameWidth, frameHeight);
      g.setColor(Color.white);
      g.fillRect(30, 40, 100, 50);
      g.setColor(Color.cyan);
      //g.fillOval(150, 150, 200, 200);
      for(int i = 0; i < 500; i++){
         g.fillOval(150 + i, 150 + i, 200, 200);
      }
   }
   public static void main(String args[]){
      new DrawShape();
   }
}