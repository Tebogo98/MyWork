/**
 * @author Monareng T
 * Class:  ChaserOval  (ConcreteProduct)
 */
package Products;
import java.awt.Color;
import java.awt.Graphics;

import Enemy.AbstractEnemy;

public class ChaserOval extends AbstractEnemy{
	
	 private int y ;
     private int x ;
    
        private int xVelocity = 0;
	    private int width = 10;

	    private int height = 40;

	  //Constructor
	    /**
	     * Constructor
	     * @param x
	     * @param y
	     */
	    public ChaserOval( int x,  int y)
	    {
	    	super(x,y);
	    	
	    	this.x = x;
	    	this.y = y;
	    }
	    

	    @Override
	    public void update() {

	    	if(x <= 0)
	    	{
	    		xVelocity = 3;
	    	}else if(x >= 750)
	    	{
	    		xVelocity = -3;
	    	}
            x = x + xVelocity;
	 	
	    		
	    }
	    
	       
   
	    @Override
	    public void paint(Graphics g) {

	        g.setColor(Color.GREEN);

	        g.fillRect(x + 14, y + 14, height  , height);    

	    }
	    
	    
	    @Override
	    public int getX() {

	        return x;

	       
	    }

	 

	    @Override
	    public int getY() {

	        return y;

	    }

	 

	    @Override
	    public int getWidth() {

	        return width;

	    }

	 

	    @Override
	    public int getHeight() {

	        return height;

	    }
	    
	    @Override
	 	    public void setXVelocity(int speed)
	    {
	    	
	    	xVelocity = speed; 
	    }
	    
	    @Override
	 	    public void checkCollision(Player player)
	 	    {
	 	    	if((player.getX() > this.x) &&  (player.getX() < this.x + 40) && (player.getY() > this.y) && (player.getY() < this.y + 40))
	 	    	{
	 	    		player.setXVelocity(0);
	 	    		player.setYVelocity(0);
	 	    		this.setXVelocity(0);
	 	    		
	 	    	}
	 	    }


		@Override
		public void setYVelocity(int speed) {
			yVelocity = speed;
			
		}
}
