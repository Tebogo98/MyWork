/**
 * @author Monareng T
 * Class: MenuSystems
 */
package GUIResources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import File.FileHandler;

public class MenuSystem extends JFrame{
	
	
	private JFileChooser fileChooser = new JFileChooser(new File("data"));
	
	public MenuSystem()
	{
		setSize(80, 60);

		
	    setResizable(false);

	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    	        JMenuBar MenuBar = new JMenuBar();
	    
	    JMenu GameMenu = new JMenu("GameMenu");
	    MenuBar.add(GameMenu);
	    JMenuItem startGame = new JMenuItem("New Game");
	  
	    startGame.addActionListener(new ActionListener()
	    		{

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
	      
	              			//RedCircle rc = new RedCircle();
	              										
	 						}	        	
	    		});
	    
	    GameMenu.add(startGame);
	    GameMenu.add(new JSeparator());
	    
	    JMenuItem GetInstructions = new JMenuItem("Game Instructions");
	    GetInstructions.addActionListener(new ActionListener() 
	    {
	    	
	     
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				File myInstructions = new File("src/Instructions.txt");  //set file path to path of instructions 
				FileHandler fh = new FileHandler();
				JOptionPane.showMessageDialog(null, fh.ReadInstructions(myInstructions)); // Use file handler created to get instruction
				
			}
	    	
	    	
	    });
	    
	    GameMenu.add(GetInstructions);
	 	    setJMenuBar(MenuBar);

	    setVisible(true);
	}
	

}
