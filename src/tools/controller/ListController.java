package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;		//must add because Kahoot class is in a different file

public class ListController
{
	private List<Kahoot> myKahoots;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();		//use array list instead because using list is too vague
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();		//new class constructor
		myKahoots.add(myFirstKahoot);
	}
	
	private void FillTheList()		//private helper method
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
