import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chose [r]ock, [p]aper, [s]cissors: ");
        String PlayerMove = scanner.nextLine();

        if (PlayerMove.equals("r") || PlayerMove.equals("rock")) {

            PlayerMove = ROCK;

        } else if (PlayerMove.equals("p") || PlayerMove.equals("paper")) {

            PlayerMove = PAPER;

        } else if (PlayerMove.equals("s") || PlayerMove.equals("Scissors")) {

            PlayerMove = SCISSORS;

        } else {
            System.out.println("Invalid Input. Try Again...");

            return;

        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = PAPER;
                break;
            case 3:
                computerMove = SCISSORS;
                break;
        }
        System.out.printf("The computer chose %s%n",computerMove);
        if (PlayerMove.equals(ROCK) && computerMove.equals(SCISSORS)||
             PlayerMove.equals(PAPER)&&computerMove.equals(ROCK)||
              PlayerMove.equals(SCISSORS) && computerMove.equals(PAPER)){
            System.out.println("You win.");

        } else if (computerMove.equals(ROCK) && PlayerMove.equals(SCISSORS)||
                computerMove.equals(PAPER)&&PlayerMove.equals(ROCK)||
                computerMove.equals(SCISSORS) && PlayerMove.equals(PAPER)) {
            System.out.println("You lose.");

        }else {
            System.out.println("The game was a draw.");
        }


    }

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";




    }
