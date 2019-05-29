package APCSA.project;
import java.awt.Color;
import java.awt.Graphics;
public class Brick {
	private int strength;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
    private int value;
	private boolean intact = true;
	
	public Brick(int strength, int xPos, int yPos, int width, int height, int value) {
		this.strength = strength;
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.value = value;
	}
	public void draw(Graphics g) {
		if(!intact){
         g.setColor(Color.black);
         g.fillRect(xPos, yPos, width, height);
      }
      g.setColor(Color.red);
		g.fillRect(xPos, yPos, width, height);
	}
	public boolean getState() {
		return intact;
	}
   public void hitBrick(){
      strength --;
      if(strength == 0){
         intact = false;
      }
   }
   public int getValue(){
      return value;
   }
   
   public int getXPos(){
      return xPos;
   }
   public int getYPos(){
      return yPos;
   }
   public int getStrength(){
      return strength;
   }


	
}