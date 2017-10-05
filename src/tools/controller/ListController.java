package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;			//must add because Kahoot class is in a different file
import tools.view.PopupDisplay;		//let's you add GUI Displays

public class ListController
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();		//use array list instead because using list is too vague
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();		//new class constructor
		myKahoots.add(myFirstKahoot);
		fillTheList();		//creates an instance just by calling it
		showTheList();		//created after fillTheList but it doesn't matter as it's what's called first matters
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for(int index = 0; index < myKahoots.size(); index++)		//standard list loop let's you go through the list
		{
			currentCreator = myKahoots.get(index).getCreator();		//does the same thing as the 2 comments below. No efficancy computer wise other than ease to programmer
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());	//use the get command to get the index of the Kahoot and show it as a string with the .toString we made
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop+= 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex +1));	//letter by letter traversal of a string
			}
		}
	}
	
	private void fillTheList()		//private helper method
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);		//make a kahoot called fiftyStates that is made by Kashish with 50 questions
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);		//DEREK WHY WOULD YOU DO THIS?!?! (maximum of int is around 2147483647)
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama", 44);
		myKahoots.add(fiftyStates);	
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
