import java.util.Scanner;
import java.util.Random;

public class HumanPlayer {
	
	private static String name;
	private static int currentState;
	private static String answer;
	Scanner in = new Scanner(System.in);
	Random rnd = new Random();
	
	public int humanTurn(String response){
		if(response.equalsIgnoreCase("Stick")){
		} else if(response.equalsIgnoreCase("Twist")){
			currentState += rnd.nextInt(9+1);
		}
		return currentState; 
	}
	
	public String humanState(int currentState){
		String digit = Integer.toString(currentState);
		answer = ("Your current hand is " + digit);
		return answer;
	}
	
	public String setName(String input){
		name = input;
		return name;
	}
	public String getHand(){
		return answer;
	}
	
	public String getName(){
		return name;
	}
	
	public int getState(){
		return currentState;
	}
	
}
