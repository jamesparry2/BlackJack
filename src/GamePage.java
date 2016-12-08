import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePage implements ActionListener {

	JFrame mainPage;
	JPanel titleSeg;
	JPanel gameSection;
	JPanel optionSection;
	JTextField input;
	JButton submit;
	BackgroundMain page;
	static Blackjack game;
	static GameResult game2;
	
	public void gamePage(){
		
		input = new JTextField(15);
		submit = new JButton("Enter");
		
		optionSection = new JPanel();
		optionSection.add(input);
		optionSection.add(submit);
		
		page = new BackgroundMain();
		
		mainPage = new JFrame("Blackjack - ingame");
		mainPage.add(BorderLayout.CENTER, page);
		mainPage.setSize(1280,900);
		mainPage.setResizable(false);
		mainPage.getContentPane().setBackground(Color.BLACK);
		mainPage.add(BorderLayout.SOUTH, optionSection);
		mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPage.setVisible(true);
		
		submit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == submit ){
			game = new Blackjack();
			String in = input.getText();
			game.playGame(in);
			input.setText("");
		}
	}
}
