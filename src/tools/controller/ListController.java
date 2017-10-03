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
		for(int index = 0; index < myKahoots.size(); index++)
		{
			popup.displayText(myKahoots.get(index).toString());	//use the get command to get the index of the Kahoot and show it as a string with the .toString we made
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
