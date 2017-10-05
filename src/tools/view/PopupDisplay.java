package tools.view;

import javax.swing.JOptionPane;

//	/** + enter (above the class) - creates the @author file where you can add things to like @version with the version and date
/**
 * Simple GUI class using JOptionPane
 * @author Kashish Singh
 *	@version 1.0 03.10.2017
 */
	
public class PopupDisplay	//right click + refactor + rename = allows you to rename classes, projects, etc.
{
	/*	/** + enter - creates the java doc for that method
	Use full sentences and be informative */
	
	/**
	 * Displays a popup showing the supplied String to the user.
	 * @param	textToDisplay The text to be displayed
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	/**
	 * Displays a popup to display a question to the user
	 * @param	fromQuestion The question being asked
	 * @return	The user's response to the questions
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}
