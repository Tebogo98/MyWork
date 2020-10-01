/**
 * @author Monareng T
 * Class: FileHandler
 */
package File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JDialog;

public class FileHandler {

	
	public static String ReadInstructions(File instructions)
	{
		String Instruct = "";
		if(!instructions.exists()) { Instruct = "";}
		
		Scanner scn = null;
		try
		{
			scn = new Scanner(instructions);
			if (!scn.hasNext()) {Instruct = "";}
			while(scn.hasNext())
			{
				Instruct = Instruct + scn.nextLine() + "\n";
			}
			
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(scn != null)
			{
				scn.close();
			}
		}
		
		return Instruct;
		//System.out.println(Instruct); 
		
		
	}
}
