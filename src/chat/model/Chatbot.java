package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part * of the project. * @author Cody
 * Henrichsen * @version 1.0 10/14/15
 */
public class Chatbot {
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * * Creates an instance of the Chatbot with the supplied username. * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName) {
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>(); 
	}

	private void buildMemesList() 
	{
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("wus poppin B");
		memesList.add("bruh");
		memesList.add("one does not simply");
		memesList.add("prank'd");
		memesList.add("like a boss");
		memesList.add("rage face");
		memesList.add("troll face");
		memesList.add("deal with it");
		memesList.add("xD");
		memesList.add("shrek");
		memesList.add("bottle flip");
		
		 
	}

	private void buildPoliticalTopicList() 
	
	{
		politicalTopicList.add("election");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("liberal");
		politicalTopicList.add("convervative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("11/8/2016");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("immigration");
		politicalTopicList.add("build a wall");
		politicalTopicList.add("emails");
		politicalTopicList.add("grab em");
		politicalTopicList.add("");
		
		
	}

	/**
	 * * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput) 
	{
		boolean hasLength = false; 
		
		if (currentInput != null && !currentInput.equals(""))
		{
			hasLength = true;
		}
		
		return hasLength;
	}

	/**
	 * * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether it
	 *            matches the content area.
	 */
	public boolean contentChecker(String currentInput) 
	{
	    boolean hasContent = false;
	    
	    if (currentInput.contains(content))
	    {
	    	
	    }
	    
		return hasContent;
	}

	/**
	 * * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean checkedPoliticalTopic = false;
		if(politicalTopicList.size() ==0)
		{
			buildPoliticalTopicList();
		}
		for (String politicalTopic : politicalTopicList)
		{
			if(currentInput.contains(politicalTopic))
			{
				checkedPoliticalTopic = true;
			}
		}
		return checkedPoliticalTopic;
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput) 
	{
		boolean checkedMeme = false;
		if(memesList.size() ==0)
		{
			buildMemesList();
		}
		for (String meme : memesList)
		{
			if(currentInput.contains(meme))
			{
				checkedMeme = true;
			}
			
		}
		
		
		return checkedMeme;
	}

	/**
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName() {
		return null;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent() {
		return null;
	}

	/**
	 * * Getter method for the memesList object. * @return The reference to the
	 * meme list.
	 */
	public ArrayList<String> getMemesList() {
		return null;
	}

	/**
	 * * Getter method for the politicalTopicList object. * @return The
	 * reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList() {
		return null;
	}

	/**
	 * * Updates the content area for this Chatbot instance. * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content) {
	}

}