package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatController 
{
	private Chatbot smartBot;
	private ChatViewer display;
	
	public ChatController()
	{
		smartBot = new Chatbot("intelligent chat machine");
		display = new ChatViewer();
	}
	
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
				
				while(smartBot.lengthChecker(response))
				{
				    display.displayMessage(useChatbotCheckers(response));
					response = display.collectResponse("Oh, you want to talk about " + response +"? Tell me more fam...");
				}

	}
	
	private String useChatbotCheckers(String input)
	{
		String checkedInput = " " ;
		
	if(smartBot.memeChecker(input))
	{
		checkedInput += "\nso you like bad meems pal?\n";
	}
	
	/** if(smartBot.contentChecker(input))
	{
		checkedInput += "\n you know my secret topic fam\n"; 
	}
/** 
 * 
 */
	if(checkedInput.length() ==0)
	{
		checkedInput = "I have no idea what you mean about" + input;
	}
	
		return checkedInput;
	}
}

