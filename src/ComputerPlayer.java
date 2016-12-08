import java.util.Random;

public class ComputerPlayer {
	
	private static int AIScore;
	private Random rnd = new Random();
	
	public void computerTurn(){
		if(AIScore <= 18){
			AIScore += rnd.nextInt(9+1);
		}
	}
	
	public int getAI(){
		return AIScore;
	}
}
