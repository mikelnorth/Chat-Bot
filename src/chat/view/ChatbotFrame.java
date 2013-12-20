package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatbotController;
/**
 *  this is the frame of the chat bot that gives you the structure of the pop up box.
 * @author mnor4913
 * version 1.0
 */
public class ChatbotFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatbotPanel basePanel;
	/**
	 *  starts the frame 
	 * @param baseController
	 */
	public ChatbotFrame(ChatbotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	/**
	 * gives the dementions of the frame and if you are able to see it or not.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
