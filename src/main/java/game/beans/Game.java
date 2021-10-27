package game.beans;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 23, 2021
 */
@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	/**
	 * @param player1
	 */
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	public void setComputerPlayerToRandom() {
		Random random = new Random();
		int randNum = random.nextInt(3);
		if (randNum == 3) {
			this.computerPlayer = "rock";
		}
		else if (randNum == 2) {
			this.computerPlayer = "paper";
		}
		else if (randNum == 1) {
			this.computerPlayer = "scissors";
		}
	}
	public String determineWinner () {
		String outcome = "";
		if(this.player1.equals("rock") && this.computerPlayer.equals("rock")) {
			outcome = "It is a tie.";
		}
		else if(this.player1.equals("rock") && this.computerPlayer.equals("paper")) {
			outcome = "The computer won.";
		}
		else if(this.player1.equals("rock") && this.computerPlayer.equals("scissors")) {
			outcome = "You won.";
		}
		else if(this.player1.equals("paper") && this.computerPlayer.equals("rock")) {
			outcome = "You won";
		}
		else if(this.player1.equals("paper") && this.computerPlayer.equals("paper")) {
			outcome = "It is a tie.";
		}
		else if(this.player1.equals("paper") && this.computerPlayer.equals("scissors")) {
			outcome = "The computer won.";
		}
		else if(this.player1.equals("scissors") && this.computerPlayer.equals("rock")) {
			outcome = "The computer won.";
		}
		else if(this.player1.equals("scissors") && this.computerPlayer.equals("paper")) {
			outcome = "You won.";
		}
		else if(this.player1.equals("scissors") && this.computerPlayer.equals("scissors")) {
			outcome = "It is a tie";
		}
		return outcome;
	}
}
