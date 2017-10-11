package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;			//must add because Kahoot class is in a different file
import tools.view.PopupDisplay;		//let's you add GUI Displays

public class Controller
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	public Controller()
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
		changeTheList();
		listPractice();
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
			
//			for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)	//use currentCreator if you comment out the lines below the currentCreator = my... that mean the same thing.
//			{
//				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex +1));	//letter by letter traversal of a string
//			}
			
//			String topic = currentKahoot.getTopic();
//			
//			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)	//does the same as loop above but just backwards ((10, 9, 8, 7, etc.)
//				{
//					popup.displayText(topic.substring(letter, letter + 1));
//				}

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
	

	private void changeTheList()
	{
		popup.displayText("The current list size is:" + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);	//takes out the 3rd index of the list (so the 4th item)
		popup.displayText("I removed Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);	//moves the first kahoot to the spot where removed was
		
		popup.displayText("The list is still: " +myKahoots.size() + " items big.");
		removed = myKahoots.set(2, new Kahoot());		//set's the removed to spot 2 in place of whatever was already there
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with on by: " + myKahoots.get(2).getCreator());
		
		/*Visual idea of how the Kahoots are moving around to just help me organize things
		 * 01234 - how it starts
		 * 0123 - 3 from before is moved and everything after shifts up an index (0124) is the order of content
		 * 01234 - 3 is now where 0 is and 0 and the rest have been shifted down (30124)
		 * 012345 - new Kahoot() is moved into the 2nd index and everything else past shifts down (350124)
		 */
	}
	
	private void listPractice()
	{	Kahoot removed = myKahoots.remove(2);	//removes the kahoot from spot 2 and is stored as "removed"
		myKahoots.add(removed);		//Takes the kahoot that is in "removed" and adds it to the end of the list
		popup.displayText("I removed Kahoot by " + removed.getCreator());
		myKahoots.add(new Kahoot("Alec", 20, "Twenty Questions"));		//creates a new Kahoot that it pops onto the end of the list
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		
		/* Visual reference/guide for the myKahoot() list changes in listPractice()
		 * 012345 - # of indexes starting (350124 is the order of what's inside)
		 * 01234 - object from index 2 is removed (35124)
		 * 012345 - added a brand new object to the list that is placed at the end (351246)
		 */
		
		for(int index = 0; index < myKahoots.size(); index++)
		{
			popup.displayText(myKahoots.get(index).toString()); 		//Displays the new list from first to last
		}
		
		for(int index = myKahoots.size() - 1; index >= 0; index--)
		{
			popup.displayText(myKahoots.get(index).toString()); 		//Displays the new list from last to first
		}
		
		
	}
	
	public PopupDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>)myKahoots;	//have to tell the program for myKahoots TO BE an array list
	}
}
