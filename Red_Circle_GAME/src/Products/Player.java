/**
 * @author Monareng T
 * Class:  Player   (ConcreteProduct)
 */
package Products;
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JOptionPane;

import Enemy.AbstractEnemy;

import GUIResources.RedCircle;


public class Player {

    private int y = RedCircle.WINDOW_HEIGHT / 2;
    private int x = RedCircle.WINDOW_WIDTH / 2;
    private RedCircle rc = null;
    private int yVelocity = 0;
    private int xVelocity = 0;

    private int width = 55;

    private int height = 55;

     
//Constructor
    /**
     * Constructor
     */
    public Player() {

    }

 

    public void update() {
       hitWall();
        y = y + yVelocity;
        x = x + xVelocity;
     	
        
      	
      
    	
    }
    
 

 

    public void paint(Graphics g) {

        g.setColor(Color.YELLOW);

        g.fillOval(x + 14, y + 14, width  , height);
       

    }

 

    public void setYVelocity(int speed) {

        yVelocity = speed;

    }
    public void setXVelocity(int speed)
    {
    	
    	xVelocity = speed;
    }

 

    public int getX() {

        return x;

    }

 

    public int getY() {

        return y;

    }

 

    public int getWidth() {

        return width;

    }

 

    public int getHeight() {

        return height;

    }
    
    public void hitWall()
    {
    	if(x <= 0)
        {
         	setXVelocity(0);
         	setXVelocity(1);
         } 
    	 if(x +width > (750))
         {
         	setXVelocity(0);
         	setXVelocity(-1);
         }
    	 
    	 if(y <= 0 )
    	 {
    		 setYVelocity(0);
    		 setYVelocity(1);
    	 }
    	 if(y + height >= 550 )
    	 {
    		 setYVelocity(0);
    		 setYVelocity(-1);
    	 }
    }
    
    //Function to check collision with all kinds of enemies 
    public void checkCollision(AbstractEnemy co) 
    {
    	if(((this.x > co.getX()  ) && (this.x < co.getX() + 40 ) && (this.y > co.getY()) &&(this.y < co.getY() + 40)))
    	{
    		setXVelocity(0);
    		setYVelocity(0);
    		co.setXVelocity(0);
    		co.setYVelocity(0);
    		JOptionPane.showMessageDialog(null, "GAME OVER!!! \n You collided with one of the enemy objects");
    		rc = new RedCircle();
    		rc.exit();
    		
    		
    	}
    }
    
 
    	 
}
