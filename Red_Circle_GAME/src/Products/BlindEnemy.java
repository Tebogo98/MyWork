/**
 * @author Monareng T
 * Class:  BlindEnemy  (ConcreteProduct)
 * Inherits AbstractEnemy
 */
package Products;
import java.awt.Color;
import java.awt.Graphics;

import Enemy.AbstractEnemy;
import GUIResources.RedCircle;
public class BlindEnemy extends AbstractEnemy{
private int radius = 40;
	
//Constructor
/**
 * Constructor
 * @param x
 * @param y
 */
	public BlindEnemy(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		xVelocity = -10;
		yVelocity = 10;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
        x = x + xVelocity;

        y = y + yVelocity;
        
        if (x < 0) {

            xVelocity = 7;           

        }
        else if (x + radius > RedCircle.WINDOW_WIDTH - 26) {

            xVelocity = -7;
                }

        if (y < 0) {

            yVelocity = 7;

        }
        else if (y + radius > RedCircle.WINDOW_HEIGHT - 28) {

            yVelocity = -7;

        }
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.PINK);

        g.fillOval(x, y, radius, radius);

		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public void setYVelocity(int speed) {
		// TODO Auto-generated method stub
		yVelocity  = speed;
		
	}

	@Override
	public void setXVelocity(int speed) {
		// TODO Auto-generated method stub
		xVelocity = speed;
	}

	@Override
	public void checkCollision(Player player) {
		// TODO Auto-generated method stub
		if (this.x > player.getX() && this.x < player.getX() + player.getWidth()) {

            if (this.y > player.getY() && this.y < player.getY() + player.getHeight()) {

                //ball has collided with player
 
        setXVelocity(0);
        setYVelocity(0);
        player.setXVelocity(0);
        player.setYVelocity(0);

            }

        }
	}
	private void reverseDirectionX() {

        xVelocity = -xVelocity;

    }

 

    private void reverseDirectionY() {

        yVelocity = -yVelocity;

    }
    
    public void hitWall() {

        if (this.y < 30) {

            reverseDirectionY();

        }

    }

}
