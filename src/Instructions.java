import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Instructions implements ActionListener {
	
	private JFrame frame;
	private String input;
	private static JTextField trial =  new JTextField(20);
	private JPanel titleSegment;
	private JPanel detailsSegment;
	private JPanel bottomButtons;
	private JButton mainMenu;
	private JLabel title;
	private JTextArea area;
	private StartMenu mainPage;
	private Blackjack jack;
	private String text = ("To play the game you need to try achive 21 without going \n"
			+ "above the threshold(21), if you do go above this you will lose. \n"
			+ "\n"
			+ "There can be 5 possible outcomes\n"
			+ "\n"
			+ "1:)Where you win by having a higher value than the AI without\n"
			+ "breaching the 21 threshold!.\n"
			+ "2:)You win by having the AI breach the treshhold and you have not.\n"
			+ "3:)The AI wins by having a higher value and not breaching the threshold.\n"
			+ "4:)The AI wins by you having breached the threshold.\n"
			+ "5:)Both can lose if you both breach the threshold.!!");
	
	
	public void deployPage(){
		
		frame = new JFrame("Instructions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBackground(Color.LIGHT_GRAY);
		
		title = new JLabel("Instructions!!");
		
		mainMenu = new JButton("Main Page");
		
		titleSegment = new JPanel();
		titleSegment.add(title);
		frame.add(BorderLayout.NORTH, titleSegment);
		
		detailsSegment = new JPanel();
		area = new JTextArea(10,5);
		area.setText(text);
		area.setBackground(Color.GRAY);
		area.setForeground(Color.RED);
		area.setEnabled(false);
		detailsSegment.add(area);
		frame.add(BorderLayout.CENTER, detailsSegment);
		
		bottomButtons = new JPanel();
		bottomButtons.add(mainMenu);
		//bottomButtons.add(trial);
		frame.add(BorderLayout.SOUTH, bottomButtons);
		
		mainMenu.addActionListener(this);	
		//trial.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == mainMenu){
			frame.setVisible(false);
			mainPage = new StartMenu();
			mainPage.display();
		}
		//This is created to show that I can get information for a JTextBox
		if(e.getSource() == trial){
			jack = new Blackjack();
			input = trial.getText();		
			jack.setStartDialog(input);
		}
	}
}
