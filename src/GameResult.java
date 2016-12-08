import java.util.Scanner;

public class GameResult {
	
	boolean continueGame = true;
	Scanner in = new Scanner(System.in);
	HumanPlayer player = new HumanPlayer();
	
	public boolean checkBust(int x){
		if(x <= 21){
			continueGame = true;
		} else {
			continueGame = false;
			System.out.println("You went bust!");
		}
		return continueGame;
	}
	
	public void checkWinner(int x, int y){
		if(x <= 21 && y < x){
			System.out.println(player.getName()+ " has won!!");
		} else if(x <= 21 && y > x && y <= 21){
			System.out.println("Computer has won!!");
		} else if(x > 21 && y <= 21){
			System.out.println("Computer has won!!");
		} else if(x <= 21 && y > 21){
			System.out.println(player.getName()+ " has won!!");
		} else {
			System.out.println("No one has won :'( ");
		}	
	}
	
	public boolean setGame(boolean x){
		continueGame = x;	
		return continueGame;
	}
		
	public boolean getGame(){
		return continueGame;
	}
	
}
