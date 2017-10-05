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
			
			for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)	//use currentCreaor if you comment out the lines below the currentCreator = my... that mean the same thing.
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex +1));	//letter by letter traversal of a string
			}
			
			String topic = currentKahoot.getTopic();
			
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)	//does the same as loop above but just backwards ((10, 9, 8, 7, etc.)
				{
					popup.displayText(topic.substring(letter, letter + 1));
				}

		}
	}
	
	private void fillTheList()		//private helper method
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");		//make a kahoot called fiftyStates that is made by Kashish with 50 questions
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");		//DEREK WHY WOULD YOU DO THIS?!?! (maximum of int is around 2147483647)
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the animals");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		myKahoots.add(fiftyStates);	
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
