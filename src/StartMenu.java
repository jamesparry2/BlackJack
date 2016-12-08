import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class StartMenu implements ActionListener {
		
	private JFrame frame;
	private JButton buttonPlay;
	private JLabel titleLabel;
	private JLabel image;
	private ImageIcon icon;
	private JPanel buttonPanel;
	private JButton readMe;
	private GamePage page;
	private HumanPlayer player = new HumanPlayer();

	public void display() {	
		
	// Initialising all the objects	
	frame = new JFrame("Blackjack");
	buttonPlay = new JButton("Let's Play!");
	titleLabel = new JLabel("BlackJack!!");
	readMe = new JButton("Instructions");
	icon = new ImageIcon("C:/Users/James/Desktop/Ownprojects/blackjack.jpeg");
	image = new JLabel(icon);
	
	
	buttonPanel = new JPanel();	
	buttonPanel.add(buttonPlay);
	buttonPanel.add(readMe);
	
	//Manipulating the titleLabel object
	Font newone = new Font("Courier New", Font.ITALIC | Font.BOLD, 40);
	titleLabel.setFont(newone);
	titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
	titleLabel.setVerticalAlignment(SwingConstants.TOP); 
	/*
	 * titleLable.setFont(new Font("Courier New", Font.ITALIC, 40);
	 * 
	 * This would be another way to manipulate the font size(as seen in line 39/40, but the other way shows more
	 * of the steps in a clear and easy to read way
	 */
	
	
	//Defining the JFrame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.getContentPane().setBackground(Color.CYAN);
	frame.add(BorderLayout.NORTH, titleLabel);
	frame.add(BorderLayout.CENTER, image);
	frame.add(BorderLayout.SOUTH, buttonPanel);
	frame.setSize(1000,835);
	frame.setVisible(true);
	
	//Calling ActionListeners to create events for the buttons
	buttonPlay.addActionListener(this);
	readMe.addActionListener(this);
	
	}
	
	//Creates the events on the start menu (Not properly OO at the moment)
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == buttonPlay){
			String name = JOptionPane.showInputDialog("Please enter your name");
			player.setName(name);
			frame.setVisible(false);
			page = new GamePage();
			page.gamePage();
		} 
		if(event.getSource() == readMe){
			Instructions pageLoad = new Instructions();
			pageLoad.deployPage();
			frame.setVisible(false);
		}
	}
	
	public JFrame getFrame(){
		return frame;
	}
	//The ActionEvent to start the game can also be implement like
	/*
	 * buttonPlay.addActionListener(new ActionListener(){
	 * 		public void actionPerformed(ActionEvent event){
	 * 		Code goes here
	 *		}
	 *		});
	 */
}
