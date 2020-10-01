/**
 * @author Monareng T 
 *  Class: Goal (ConcreteProduct)
 */
package Products;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Goal {

	private int x;
	private int y;
	private int playerScore;
	private int radius = 60; 
	
	public Goal(int x, int y)
	{
		this.x = x;
		this.y = y;
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}



	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}



	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}



	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 
	 * @return the playerScore
	 */
	public int getPlayerScore() {

        return playerScore;

   }
	
	public int getRadius()
	{
		return radius;
	}
	
	
	//Function to update score and set location
	/**
	 * 
	 * @param player
	 */
	public void update(Player player)
	{
		
		if(((player.getX() > this.getX()) && (player.getX() < this.getX() + this.getRadius() - 5 ) && (player.getY() > this.getY() - 5) &&(player.getY() < this.getY() + this.getRadius() -10)))
    	{
    		 setX(GetRandomNumber(15, 700));
    		 setY(GetRandomNumber(20, 450));
    		  playerScore = playerScore + 1;
    		      		  
        	}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawOval(x, y, radius /2, radius + 10);
		
		g.setColor(Color.YELLOW);
		g.drawString(toPlayer(), 0, 10);
		
	}
	
	public int GetRandomNumber(int min , int max)
	{
		Random rand = new Random();
		int Num = rand.nextInt(max) + min;
		return Num;
	}
	
	public String toPlayer() {

        String retVal = "";

        retVal = "Player Score: " + playerScore;

        return retVal;

    }
	
	
}
