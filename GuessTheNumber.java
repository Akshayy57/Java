import java.util.Random;
import java.util.Scanner;

class Game{
	int userInput;
	int compInput;
	int userGuesses;

	public Game(){
		Random rand = new Random();
		compInput = rand.nextInt(100);
	}

	public void greet(){
		System.out.println("Welcome to the Guessing Game.");
		System.out.println("Enter number between 1-100");
	}

	public void setUserInput(int userInput) {
		this.userInput = userInput;
	}

	public int isCorrect(){
		if (userInput > compInput){
			return 1;
		} else if (userInput < compInput) {
			return -1;
		} else {
			return 0;
		}
	}

	public void counter(){
		userGuesses++;
	}
}

public class GuessTheNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game a1 = new Game();
		a1.greet();

		while (true) {
			int n = sc.nextInt();
			a1.setUserInput(n);

			if (a1.isCorrect() == 0){
				a1.counter();
				System.out.println("Guessed Successfully in " + a1.userGuesses);
				break;
			} else if (a1.isCorrect() == -1) {
				System.out.println("Guess a Higher number");
				a1.counter();
			} else if (a1.isCorrect() == 1) {
				System.out.println("Guess a Lower Number");
				a1.counter();
			}
		}

	}
}