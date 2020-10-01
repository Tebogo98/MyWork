/**
 * @author Monareng T
 * Class: GamePanel
 */
 package GUIResources;

 import java.awt.Color;

 import java.awt.Graphics;
 import java.awt.event.ActionEvent;

 import java.awt.event.ActionListener;

 import java.awt.event.KeyEvent;

 import java.awt.event.KeyListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 import javax.swing.Timer;

import Factory.ConcreteObjects;
import Products.BlindEnemy;
import Products.ChaserOval;
import Products.EnemyVertical;
import Products.Goal;
import Products.Player;
 
public class GamePanel extends JPanel implements ActionListener, KeyListener {

    Player player = new ConcreteObjects().createPlayer();
      Goal goal = new ConcreteObjects().createGoal(100, 350);     
    EnemyVertical EV1 = new ConcreteObjects().createEnemyVertical(100, 0);
    EnemyVertical EV = new ConcreteObjects().createEnemyVertical(350, 0);
    EnemyVertical EV2 = new ConcreteObjects().createEnemyVertical(600, 0);
    EnemyVertical IV = new ConcreteObjects().createEnemyVertical(212, 550);
    EnemyVertical IV1 = new ConcreteObjects().createEnemyVertical(462, 550);
    EnemyVertical IV2 = new ConcreteObjects().createEnemyVertical(5, 550); 
      ChaserOval CO = new ConcreteObjects().createChaserOval(0, 350);
      ChaserOval CO1 = new ConcreteObjects().createChaserOval(0, 200);
      ChaserOval CO2 = new ConcreteObjects().createChaserOval(0, 50);
      ChaserOval CO3 = new ConcreteObjects().createChaserOval(750, 125);
      ChaserOval CO4 = new ConcreteObjects().createChaserOval(750, 425);
      BlindEnemy be = new ConcreteObjects().createBlindEnemy(400, 400);

      //Constructor
      /**
       * Constructor
       */
    public GamePanel() {
	   	
        Timer time = new Timer(50, this);

        time.start();

        this.addKeyListener(this);

        this.setFocusable(true);
        
      
        

    }

    
 
    //Function to update state of game
    /**
     * Function to update state of game
     * update() - void
     */

    private void update() {
 	
    	//Call update functions for all objects
    	    CO.update();
            be.update();
    	    CO1.update();
    	    CO2.update();
    	    CO3.update();
    	    CO4.update();
    	    EV.update();
    	    EV1.update();
    	    EV2.update();
    	    IV.update();
    	    IV1.update();
    	    IV2.update();
        player.update();
	    goal.update(player);            
	    
	    //Game Win Condition
            if(goal.getPlayerScore() == 10)
            {
            	CO.setXVelocity(0);
            	CO1.setXVelocity(0);
            	CO2.setXVelocity(0);
            	CO3.setXVelocity(0);
            	CO4.setXVelocity(0);
            	be.setXVelocity(0);
            	
            	be.setYVelocity(0);
            	EV.setYVelocity(0);
            	EV1.setYVelocity(0);
            	EV2.setYVelocity(0);
            	IV.setYVelocity(0);
            	IV1.setYVelocity(0);
            	IV2.setYVelocity(0);
            }
    //Check collisions between player and enemy objects
   	
    	player.checkCollision(CO);
    	player.checkCollision(CO1);
    	player.checkCollision(CO2);
    	player.checkCollision(CO3);
    	player.checkCollision(CO4);
   	    player.checkCollision(EV);
   	 player.checkCollision(EV1);
   	player.checkCollision(EV2);
   	player.checkCollision(IV);
   	player.checkCollision(IV1);
   	player.checkCollision(IV2);
         be.checkCollision(player);
         be.hitWall();   
                

    }

 
    //Function to paint objects onto panel
    /**
     * Function to paint objects onto panel
     *paintComponent(g) - void
     *@param Graphics
     */

    public void paintComponent(Graphics g) {

        g.setColor(Color.GRAY);

        g.fillRect(0, 0, RedCircle.WINDOW_WIDTH, RedCircle.WINDOW_HEIGHT);



        be.paint(g);
        player.paint(g);       
        goal.paint(g);
        	CO.paint(g);
        	CO1.paint(g);
        	CO2.paint(g);
        	CO3.paint(g);
        	CO4.paint(g);
    	EV.paint(g);
    	EV1.paint(g);
    	EV2.paint(g);
    	IV.paint(g);
    	IV1.paint(g);
    	IV2.paint(g);
        g.setColor(Color.ORANGE);

        g.drawLine(0, 30, RedCircle.WINDOW_WIDTH, 30);
        g.drawLine(RedCircle.WINDOW_WIDTH / 2, 30, RedCircle.WINDOW_WIDTH /2, RedCircle.WINDOW_HEIGHT);

        g.drawOval((RedCircle.WINDOW_WIDTH ) / 2 - 30, RedCircle.WINDOW_HEIGHT / 2 - 30, 60, 60);


    }

 
//Function to update game after actions are performed
/**
 * Function to update game after actions are performed
 * actionPerformed(e) - void
 * @param ActionEvent
 */
    public void actionPerformed(ActionEvent e) {

        update();
        
        repaint();

    }

 

  //Events that occur when user interacts with controls 
    /**
     * //Events that occur when user interacts with controls 
     * keyPressed(e)- void
     * @param KeyEvent
     */
    public void keyPressed(KeyEvent e) {
    	
    		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
    	    	
    	 		player.setXVelocity(-12); 	
    	 	   player.checkCollision(CO);
    	 	  player.checkCollision(CO1);
    	 	 player.checkCollision(CO2);
    	 	 player.checkCollision(CO3);
    	 	player.checkCollision(CO4);
    	 	  player.checkCollision(EV);    	
    	 	  player.checkCollision(EV1);
    	 	 player.checkCollision(EV2);
    		 player.checkCollision(IV);
    		 player.checkCollision(IV1);
    		 player.checkCollision(IV2);
    		 be.checkCollision(player);
                
    	}
    		if(e.getKeyCode() == KeyEvent.VK_RIGHT) 
    		{
    			player.setXVelocity(12);
    			   player.checkCollision(CO);
    			   player.checkCollision(CO1);
    			   player.checkCollision(CO2);
    			   player.checkCollision(CO3);
    	    	 	player.checkCollision(CO4);
    			   player.checkCollision(EV);
    			   player.checkCollision(EV1);
    			   player.checkCollision(EV2);
    			   player.checkCollision(IV);
    	    		 player.checkCollision(IV1);
    	    		 player.checkCollision(IV2);
    			   be.checkCollision(player);
    	     		}

        if (e.getKeyCode() == KeyEvent.VK_UP) {

        	 player.setYVelocity(-12);
      	   player.checkCollision(CO);
      	 player.checkCollision(CO1);
      	player.checkCollision(CO2);
      	 player.checkCollision(CO3);
 	 	player.checkCollision(CO4);
      	 player.checkCollision(EV);
      	player.checkCollision(EV1);
      	player.checkCollision(EV2);
      	player.checkCollision(IV);
		 player.checkCollision(IV1);
		 player.checkCollision(IV2);
      	be.checkCollision(player);

    	     	
        
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            player.setYVelocity(12);      
     	   player.checkCollision(CO);
     	  player.checkCollision(CO1);
     	 player.checkCollision(CO2);
     	 player.checkCollision(CO3);
 	 	player.checkCollision(CO4);
     	  player.checkCollision(EV);
     	 player.checkCollision(EV1);
       	player.checkCollision(EV2);
       	player.checkCollision(IV);
		 player.checkCollision(IV1);
		 player.checkCollision(IV2);
     	be.checkCollision(player);


        }

    }


//Events that occur when controls are released
    /**
     * //Events that occur when controls are released
     * keyReleased(e) - void
     * @param KeyEvent
     */
    public void keyReleased(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN ||keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {

            player.setYVelocity(0); 
         	
            player.setXVelocity(0);

            
        }

    }

 

    public void keyTyped(KeyEvent e) {

    }
    

}
