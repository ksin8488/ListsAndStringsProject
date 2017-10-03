package tools.model;

public class Kahoot
{
	private int questionCount;		//number of questions
	private int level;				//level of difficulty
	private String creator;			//Name of the creator of the Kahoot
	private boolean isJumble; 		//are the questions mixed up? True or False.
	
	public Kahoot()	//constructor is visibility (usually public) and then the class name with ()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "nobody";
		this.isJumble = false;
	}
	
	public Kahoot(String creator, int questionCount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}
	
	public String toString()
	{
		String description = "This Kahoot was mde by " + creator + " and has " + questionCount + " questions.";
		
		return description;
	}
}
