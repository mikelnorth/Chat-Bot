package chat.controller;

import java.util.ArrayList;

import chat.model.Chatbot;
import chat.view.ChatbotFrame;
import chat.view.ChatbotView;
/**
 * calls everything so it can be seen and used. starts the program.
 * @author Mikel North
 * @version 1.3 10/31/13 Removed old popup GUI, reference to Chatbot
 */
public class ChatbotController
{
	/**
	 * calls myView which shows you the program.
	 */

	private Chatbot myChatbot;
	private ChatbotFrame appFrame;
	
	
	public ChatbotController()
	{

		myChatbot = new Chatbot();
	}
	public Chatbot getMyChatbot()
	{
		return myChatbot;
	}

	/**
	 * Starts the program by calling it.
	 */
	public void start()
	{
//		myView.showApp();
		appFrame = new ChatbotFrame(this);
	}
	/**
	 *  This is a helper that communicates with chatbot and the view
	 * @param conversationList is a list of things to talk about
	 * @return a part of the current conversation
	 */
	private String conversationHelper(ArrayList<String> conversationList)
	{
		String currentConversationPiece = "";
		
		if(conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
		}
		
		return currentConversationPiece;
	}
	/**
	 * the setup for the conversation
	 * @return the current conversation being had
	 */
	public String processConversation()
	{
		String currentConversation = "";
		
		currentConversation = conversationHelper(myChatbot.topicConversation());
		
		
		return currentConversation;
	}
	/**
	 * Randomly bringing up a topic
	 * @param currentInput
	 * @return
	 */
	public String processMeme(String currentInput)
	{
		String memeResponse = "you dont like memes?";
		
		if(myChatbot.memeChecker(currentInput))
		{
			memeResponse = currentInput + " is a cool meme";
		}
		
		return memeResponse;
	}
	
//	public String processCowboy(String currentInput)
//	{
//		String cowboyResponse = "Howdy partner";
//		
//		if(myCowboy.cowboyChecker(currentInput))
//		{
//		String cowboyResponse = currentInput + " You are a cowboy?";
//		}
//	}
//	
//	return cowboyResponse;
}
