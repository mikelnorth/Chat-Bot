package chat.view;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

/**
 * how to see the chatbot.
 * 
 * @author Mikel North
 * @version 1.4
 */
public class ChatbotView
{
	/**
	 * myChatbot is a data member, this is the chatbot everything will go into
	 * this.
	 */
	private Chatbot myChatbot;

	public ChatbotView()
	{
		myChatbot = new Chatbot();

	}

	/**
	 * checking if you want to talk to the chatbot, and then proceeding onto
	 * topicConversation.
	 */
	public void showApp()
	{
		String answer = "keep going";

		while (answer == null || !answer.equals("no"))
		{
			JOptionPane.showMessageDialog(null, myChatbot.getRandomTopic());
			answer = getInput();
			useInput(answer);
		}
		myChatbot.topicConversation();

	}

	/**
	 * starts interacting with the user by asking a question
	 * 
	 * @return what the user currently typed
	 */
	private String getInput()
	{
		String userInput = "";

		userInput = JOptionPane
				.showInputDialog("hey baby, you come here often? ;)");

		return userInput;
	}

	/**
	 * This is taking what the user input and using it to reply
	 * 
	 * @param currentInput
	 *            : the current phrase typed in by the user.
	 */
	private void useInput(String currentInput)
	{
		JOptionPane.showMessageDialog(null, "seriously?");
		if (myChatbot.memeChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "you like memes huh?");
		}

		if (myChatbot.cowboyChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "you like westerns?");
		}
	}
}
