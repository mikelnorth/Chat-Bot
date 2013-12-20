package chat.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.ChatbotController;
import chat.model.Chatbot;
/**
 * this is the setup of everything inside of the frame.
 * @author mnor4913
 * version 1.2
 */
public class ChatbotPanel extends JPanel
{
	private ChatbotController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private Chatbot appBot;
	private JScrollPane textPane;
	private int clickCount;
	
	/**
	 * this is the setup of the buttons.
	 * @param baseController
	 */
	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getMyChatbot();
		
		submitButton = new JButton("submit this to the Chatbot!");
		userInputField = new JTextField(30);
		
		chatArea = new JTextArea(10, 30);
		textPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		clickCount = 0;
		
		setupPanel();
		setupLayout();
		setupListeners();

		startChat();
	}
	/**
	 * this starts a conversation in the chat bot by pulling a random topic and talking about it.
	 */
	private void startChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}
	/**
	 *  this is adding the buttons to the frame and adding color
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
		this.setBackground(Color.green);
		
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	/**
	 * these are the coordinates of everything in the frame
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 17, SpringLayout.SOUTH, userInputField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 144, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 17, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 102, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{

			
			/**
			 * this is what happens when I click the button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				String currentInput = userInputField.getText();
				if(clickCount % 7 ==0)
				{
					String currentConversation = baseController.processConversation();
					if(currentConversation.length() != 0)
					{
						chatArea.append(currentConversation);
						clickCount--;
					}
				}
				else if(clickCount % 11 == 0)
				{
					chatArea.append(baseController.processMeme(currentInput));
				}
				else
				{
					chatArea.append("\n" + currentInput);
					chatArea.append("\n" + appBot.getRandomTopic());
				}
			}

		});
	}
}
