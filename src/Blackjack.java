
public class Blackjack {
	
	HumanPlayer player = new HumanPlayer();
	ComputerPlayer AI = new ComputerPlayer();
	GameResult test = new GameResult();	
	static String starter = "";
	private String input;
	GamePage in = new GamePage();
	
	public void playGame(String letBeMeFree){
		player.humanTurn(letBeMeFree);
		System.out.println(player.humanState(player.getState()));
		AI.computerTurn();
		test.checkBust(player.getState());
		if(letBeMeFree.equalsIgnoreCase("Stick") || test.getGame() == false){
			test.setGame(false);
			System.out.println(AI.getAI() + " was the AI's score");
			test.checkWinner(player.getState(), AI.getAI());
		}
	}	
	
	public String setStartDialog(String start){
		starter = start;
		return starter;
	}
	public String setInput(String in){
		input = in;
		return input;	
	}
}
