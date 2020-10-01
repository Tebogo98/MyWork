/**
 * @author Monareng T
 * Class:  AbstractEnemy  (Abstract Class)
 */
package Enemy;
import java.awt.Graphics;

import Products.Player;


public abstract class AbstractEnemy {

	protected int y ;
	protected int x ;
	protected int yVelocity = 0;
	protected int xVelocity = 0;
	protected int width = 10;
	protected int height = 40;
   
    public AbstractEnemy(int x, int y)
    {
    	
    	this.x = x;
    	this.y = y;
    }
    
    public abstract void update();
    public abstract void paint(Graphics g);
  
    public abstract int getX() ;
    public abstract int getY() ;
     public abstract int getWidth() ;
    public abstract int getHeight() ;
    public abstract void setYVelocity(int speed) ;
    public abstract void setXVelocity(int speed);
    public abstract void checkCollision(Player player);
    
   
}
