package project2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class App extends JPanel implements ActionListener {

	private JPanel buttonJp, ResultsJp;
	private JLabel jlStatus, jlMatches, jlAtempts, jlScores;
	private JButton continueB, endGame;

	/**JPanels:
	 * @buttonJp represents and instance of the Button Panel class
	 * @resultsJP
	 * @continueB button is design to flip the cards back over so their matchable images are hidden
	 * @endGame button is to One to end the game. (Remember to confirm the choice before exiting)
	 */
	public App() {
		setLayout(new BorderLayout());
		buttonJp = new ButtonPanel();
		ResultsJp = new JPanel(new GridLayout(2,3));	// created an instance of a JPanel

		jlScores = new JLabel("Scores: ");
		jlStatus = new JLabel("Status: ");
		jlMatches = new JLabel("Matches: ");
		jlAtempts = new JLabel("Atempts: ");

		endGame = new JButton("End Game");
		continueB = new JButton("Continue");

		continueB.addActionListener(this);
		endGame.addActionListener(this);

		//first row of labels and buttons onn the Results JPanel
		ResultsJp.add(jlStatus);
		ResultsJp.add(jlMatches);
		ResultsJp.add(continueB);

		//secondd row of labels and buttons inside of the panell
		ResultsJp.add(jlAtempts);
		ResultsJp.add(jlScores);
		ResultsJp.add(endGame);

		add(buttonJp, BorderLayout.CENTER); // Adds Button panel to to the Animal JPanel
		add(ResultsJp, BorderLayout.NORTH);

	}//End Memory Matching game constructor Jpanel Constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("INSIDE ACTION PERFORMED");
		JButton btnClicked = (JButton)e.getSource();

		if(btnClicked.equals(continueB)) {
			System.out.println("The Game Has Continued");
		}

		if(btnClicked.equals(endGame)) {
			System.out.println("the game has ended");
		}

	} // end of action performed method




	private class ButtonPanel extends JPanel implements ActionListener, CardBehaviors {

		private Card [][] cards;

		/** this Constructor initializes and sets the look of the button panel
		 * the button-panel will have a GridLayout that will be set to 3x4
		 * and then the displayBoard() method is called in order to populate
		 * the 2d-array of "Card" data types
		 * 
		 */
		ButtonPanel() {

			setLayout(new GridLayout(3,4)); // sets the layout of the button
			cards = new Card[3][4];		  // sets the length of Jbtns to the length of "btnFaces" (String)
			displayBoard();

		} // End of Button Panel Constructor

		private void displayBoard(){ //populates the array of jButtons
			for(int i = 0; i< 3; i++){
				for( int j=0; j< 4; j++){
					cards[i][j] = new Card("pictures/back.png");
					cards[i][j].addActionListener(this);
					cards[i][j].setEnabled(true);
					add(cards[i][j]);
				}
			}
		}

		@Override
		public void hideCard() {
			for(int i = 0; i< 3; i++){
				for( int j=0; j< 4; j++){
					if(cards[i][j] != cards[i][j]) {
						
					}
				}
			}
		}

		@Override
		public void showCard() {
			for(int i = 0; i< 3; i++){
				for( int j=0; j< 4; j++){
					if(cards[i][j] == cards[i][j]) {
						
					}
				}
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("INSIDE ACTION PERFORMED");
			JButton btnClicked = (JButton)e.getSource();

		} // end of action performed method

		

	} // End of Button Panel Class


}// End of Animal Jpanel