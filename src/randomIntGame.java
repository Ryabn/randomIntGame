import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class randomIntGame {
    public static void main(String[] args) {
        
        Scanner gameChoice = new Scanner(System.in);
        out.println("Would you like to play game? \n" +
                "(Press \"y\" to continue. Press any other key to leave.)");
        String idea = gameChoice.nextLine();
        idea  = idea.toLowerCase();
        if( idea.equals("y")){
            out.println("Great! So the game we are going to play is a number guessing game");
            out.println("The rules of the game are as follows:  \n" +
                    "    -I will pick a random number ranging from 1 - 100  \n" +
                    "    -You will have to guess the number  \n" +
                    "    -If you are unable to get it in 100 tries, you lose  \n" +
                    "    -The goal of the game is to win in 1 try  \n" +
                    "    -I will record the number of tries you used  \n");
        }
        else{
            System.exit(0);
        }

        try {
            Thread.sleep(10000);
            out.println("Get ready!\n");
            Thread.sleep(2000);
            out.println("Get set! (Don't worry, this game is not timed)\n");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        
		do{
			int failCount = 1;
			Scanner randomInt = new Scanner(System.in);
			Random randomGenerator = new Random();
			int RandomInt = randomGenerator.nextInt(100);
			out.println("Guess what number (1-100) im thinking about?");
			do{
				int choice = randomInt.nextInt();
				if(choice == RandomInt){
					out.println("Good Job, you picked the number I was thinking of!");
					break;
				}
				else if(choice < RandomInt){
					out.println("Sorry! Your guess was too low. Guess again");
					failCount = failCount + 1;
				}
				else if(choice > RandomInt){
					out.println("Sorry! Your guess was too high. Guess again");
					failCount = failCount + 1;
				}
				else{
					out.println("I have no idea how you got to this line of text");
					break;
				}
			}while(failCount < 100);                         																							  
			
			out.println("You tried " + failCount + " amount of times");
			out.println("Would you like to play again? ");
			out.println ("(Press 1 if you would like to play again )" );
			out.println("(Press 2 if you would not like to play again )");
			
			int playAgain = randomInt.nextInt();
			if (playAgain == 2){
				break;
			}

		}while (5 > 3);
		out.println("Thank you for playing! ");
	}
}