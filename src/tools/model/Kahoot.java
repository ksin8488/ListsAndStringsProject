package tools.model;

public class Kahoot
{
	private int questionCount;		//number of questions
	private int level;				//level of difficulty
	private String creator;			//Name of the creator of the Kahoot
	private boolean isJumble; 		//are the questions mixed up? True or False.
	private String topic;			//creates a topic
	
	public Kahoot()	//constructor is visibility (usually public) and then the class name with ()
	{		//creates initial values
		this.questionCount = 0;
		this.level = 1;
		this.creator = "nobody";
		this.isJumble = false;
		this.topic = "some topic";
	}
	
	public Kahoot(String creator, int questionCount, String topic)
	{
		this();		//calls the default one so others don't have to be re-inputted
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;			//this. makes it so that it doesn't become topic = topic
	}
	
	public String toString()			//method to create a description
	{
		String description = "This Kahoot was mde by " + creator + " and has " + questionCount + " questions.";
		
		return description;
	}

	public String getCreator()
	{
		return creator;
	}
}