package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Explanation of the class: a Chatbot model to test String manipulation and use.
 * @author Mikel North
 * @version1.5
 */




public class Chatbot
{
	public String contentBased(String currentInput)
	{
		String processed = "";
		
		if(currentInput.contains("boo"))		
		{
			processed = "ooooh scary";
		}
		else
		{
			processed = "booring";
		}
		
		return processed;
	}
	
	
	
	/**
	 *  this method orders your name to first, middle, and last
	 * @param first
	 * @param middle
	 * @param last
	 * @return the order of your names
	 */
	public String alphabetizeYourName(String first, String middle, String last) // Passing parameters of the name, which are first, middle, and last
	{
		String nameInOrder = ""; // 
				
				if(first.compareTo(middle) < 0) // checking to see if first is before middle
				{
					if(first.compareTo(last) < 0) // checking to see if first is before last
					{
						if(middle.compareTo(last)< 0) // checking to see if middle is before last
						{
							nameInOrder = first + ", " + middle + ", " + last;  // will list the names in alphabetical if order is first, middle then last
						}
						else
						{
							nameInOrder = first + ", " + last + ", " + middle; // will list the names in alphabetical if order is first last then middle
						}
					}	
					else
					{
						nameInOrder = last + ", " + first + ", " + middle; // this will put in alphabetical if order is last, first, then middle
					}
				}
				else
				{
					if(middle.compareTo(last) < 0) // checking to see if middle before last
					{
						if(first.compareTo(last) < 0) // checking to see if first is before last 
						{
							nameInOrder = middle + ", " + first + ", " + last; // will put in alphabetical order if order is middle, first then last
						}
						else
						{
							nameInOrder = middle + ", " + last + ", " + first; // will put in alphabetical order if the order is middle , last then first
						}
					}
					else
					{
						nameInOrder = last + ", " + middle + ", " + first; // will put in alphabetical order if order is last, middle, first
					}
				}
		
				return nameInOrder; // will give you the name in order
	}


	
	
	/**
	 * An ArrayList of Strings that holds the memes for the program
	 */
	private ArrayList<String> myMemes;
	/**
	 * An ArrayList of Strings to hold random topics
	 */
	private ArrayList<String> randomList;
	
	private ArrayList<String> conversationList;
	
	public Chatbot()
	{
		conversationList = new ArrayList<String>();
		
		fillTheConversationList();
		
		randomList = new ArrayList<String>();
		
		fillTheRandomList();
		
		myMemes = new ArrayList<String>();

		fillTheMemeList();

		myCowboy = new ArrayList<String>();

		fillTheCowboyList();
	}
	
	
	public ArrayList<String> getMyMemes()
	{
		return myMemes;
	}
	public ArrayList<String> getRandomList()
	{
		return randomList;
	}
	public ArrayList<String> getMyCowboy()
	{
		return myCowboy;
	}
	/**
	 * Fills the randomList with various Strings for the chatbot.
	 */
	private void fillTheRandomList()
	{
		randomList.add("i like cheese");
		randomList.add("i hate essays");
		randomList.add("i like cereal");
		randomList.add("I am random");
		randomList.add("i like typing");
		randomList.add("I just farted...");
		randomList.add("its so fluffy im gonna die!");
		randomList.add("im feeling fat, and sassy!");
		randomList.add("Im pretty awesome");
		randomList.add("Im eating bacon right now!");
		randomList.add("I can pee in a urinal");
		randomList.add("My nose is a communist");
		randomList.add("What do you think about the magical yellow unicorn who dances on the rainbow with a spoonful of blue cheese dressing?");
		randomList.add("sweg?");
		randomList.add("If the moon was a goat how much sweg?");
		randomList.add("No sheep is quite as crooked as a bed");
		randomList.add("Friendly insects eat pink pineapples, while looking at your mum");
		randomList.add("A fuzzy snake ate the clouds!");
		randomList.add("My nose is a communist");
		randomList.add("The third Prussian to the left has a cat under his helmet");
		randomList.add("Eating poisonous objects is not healthy for healthy people");
		randomList.add("What could be better than a cat on roller skates?");
		randomList.add("I stapled my hand to his desk.");
		randomList.add("yes that's right, there's a midget that's stalking me, and he keeps taking pictures of my watch....");
		
	}
	/**
	 * this method chooses a random item from the random list.
	 * @return A random element from the randomList
	 */
	public String getRandomTopic()
	{
		String randomTopic = "";
		
		double myRandom = Math.random();
		int myRandomListPosition = (int) (myRandom * randomList.size());
		randomTopic = randomList.get(myRandomListPosition);
		
		return randomTopic;
	}
	
	
	
	/**
	 * a list for the chatbot to check for.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
	}

	/**
	 * One or two sentence explanation of the method. Full sentences with
	 * punctuation. checks the currentInput from the user to see if it is a
	 * member of the memeList. It returns true if the input is a member of the
	 * list.
	 * @param currentInput
	 *            Explanation of the variable. The current phrase typed by the
	 *            user.
	 * @return What is returned by the method. in this case the method returns
	 *         Whether or not the input is a meme from the memeList
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all the items in the list, if the input matches a meme,
		// change hasMeme to true.

		if (currentInput != null)
		{
			for (String currentPhrase : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMeme = true;
				}
			}
		}
		return hasMeme;

	}

	private ArrayList<String> myCowboy;

	/**
	 * a list of information for the chatbot to check if cowboys are being talked about.
	 */
	private void fillTheCowboyList()
	{
		myCowboy.add("howdy");
		myCowboy.add("woody");
		myCowboy.add("theres a snake in my boot");
		myCowboy.add("reach for the sky");
		myCowboy.add("sherrif");
		myCowboy.add("gettie up");
		myCowboy.add("lasso");
		myCowboy.add("saddle");
		myCowboy.add("cattle");
		myCowboy.add("stampede");
		myCowboy.add("cowboy");
		myCowboy.add("cowgirl");
		myCowboy.add("yehaw");
		myCowboy.add("leather boots");

	}
	/**
	 * Checks the currentInput form the user to see if it is a memeber of the cowboyList
	 * It returns true if the input is a member of the list.
	 * @param currentInput: the current phrase typed by the user
	 * @return the method returns whether or not the input is a cowboy from the cowboyList.
	 */
	public boolean cowboyChecker(String currentInput)
	{
		boolean hasCowboy = false;
		// loop over all the items in the list, if the input matches a cowboy

		// change hasCowboy to true.

		if (currentInput != null)
		{
			for (String currentPhrase : myCowboy)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasCowboy = true;
				}
			}
		}
		return hasCowboy;

	}
	private void fillTheConversationList()
	{
		ArrayList<String> conversation = new ArrayList<String>();
		
		conversation.add(" hey i want to talk aboud dfsdfkjlsdjflsdkfbnk ");
		conversation.add(" no that was not keyboard mashing");
		conversation.add(" what do you know anyway?");
		
	}
	
	
	public ArrayList<String> topicConversation()
	{
	
		return conversationList;
	}

	/**
	 * starts a conversation a bout sports and particularly soccer.
	 */
	//public void topicConversation()
//	{
//		String answerSport;
//		answerSport = JOptionPane
//				.showInputDialog("what's your favorite sports?");
//		if (answerSport.equalsIgnoreCase("soccer"))
//		{
//			JOptionPane
//					.showMessageDialog(null,
//							"I love soccer! it is my favorite sport. I knew You would be cool!");
//			JOptionPane.showInputDialog("What is your favorite team?");
//			JOptionPane.showInputDialog("Nice! who is your favorite player?");
//
//		}
//		JOptionPane.showInputDialog(" you look like a " + answerSport
//				+ " kind of kid, do you play " + answerSport + " often?");
//		JOptionPane
//				.showInputDialog("do you like to watch or play other sports?");
//		JOptionPane
//				.showInputDialog("so do I especially soccer, but what are some other sports you like?");
//		JOptionPane
//				.showInputDialog("wow, well thats cool, where would you want to play college sports?");
//		JOptionPane
//				.showInputDialog("thats okay... just that school sucks!.... just kidding, thats cool");
//
//	}
}
