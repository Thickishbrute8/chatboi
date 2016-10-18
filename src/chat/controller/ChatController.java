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
		String response = "words";
				
				while(smartBot.lengthChecker(response))
				{
					
					response = display.collectResponse("Whatchu wanna talk about fam?");
				}
	}
}
