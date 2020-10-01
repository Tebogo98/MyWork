/**
 * @author Monareng T
 * Class: RedCircle 
 */
package GUIResources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class RedCircle extends JFrame{
	  public final static int WINDOW_WIDTH = 800;

	    public final static int WINDOW_HEIGHT = 600;

	    private JFileChooser fileChooser = new JFileChooser(new File("data"));

	    private GamePanel pnlGame = null;
	    
	    public RedCircle() {

			pnlGame = new GamePanel();
			
	    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	    	
	        setResizable(false);
	       
	        JMenuBar MenuBar = new JMenuBar();
		    
		    JMenu GameMenu = new JMenu("GameMenu");
		    
		    MenuBar.add(GameMenu);

	        JMenuItem exitItem = new JMenuItem("Exit");
			exitItem.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e)
				{
					// Perform exit actions
					WindowEvent winEvent = new WindowEvent(RedCircle.this, WindowEvent.WINDOW_CLOSING);
					dispatchEvent(winEvent);
				}
			});

			 GameMenu.add(exitItem);
			    
		 	    setJMenuBar(MenuBar);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
             add(new GamePanel());  
	        
	        setVisible(true);

}
	    
	    public void getPanel(GamePanel gp)
	    {
	    	this.add(gp);
	    	setVisible(true);
	    }
	    
	    public void exit()
	    {
	    	WindowEvent winEvent = new WindowEvent(RedCircle.this, WindowEvent.WINDOW_CLOSING);
			dispatchEvent(winEvent);	
	    }
}
