/**
 * @author Monareng T
 * Class:  EnemyVertical  (ConcreteProduct)
 */
package Products;
import java.awt.Color;
import java.awt.Graphics;

import Enemy.AbstractEnemy;


public class EnemyVertical extends AbstractEnemy{

	//Constructor
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public EnemyVertical(int x, int y) {
		super(x, y);
		this.x = x;
    	this.y = y;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	
		if(y <= 0 )
		{
			yVelocity = 7;
		}
		else if(y >= 550)
		{
			yVelocity  = -7; 
		}
		y = y + yVelocity;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(x + 25, y + 25, height, height);
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
	public void setYVelocity(int speed) {
	 
	        yVelocity = speed;

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
	
}
