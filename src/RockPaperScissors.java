import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // variables for the game
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int playerOne;
        int playerTwo;

        int playerOneWins = 0;
        int playerTwoWins = 0;
        int ties = 0;

        int rounds;
        boolean gameOver = false;
        
        while(!gameOver){
            System.out.println("Please enter the number of rounds you would like to play");
            System.out.println("The number of rounds has to be between 1 and 10:");
            rounds = input.nextInt();

            if(rounds<1 || rounds>10){
                System.out.println("Number of rounds has to be between 1 and 10");
            }else{
                int currentRound = 1;
                while(currentRound<=rounds){
                    System.out.println("Please enter your move");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");
                    System.out.println("4. Quit game");

                    playerOne = input.nextInt();

                    if(playerOne >= 1 && playerOne<=3){
                        playerTwo = random.nextInt(3)+1;
                        // send the player moves to the checkWinner() function
                        int result = checkWinner(playerOne, playerTwo);
                        if(result==0){
                            System.out.println("Round is a tie");
                            ties++;
                        }else if(result==1){
                            System.out.println("You won this round");
                            playerOneWins++;
                        }else{
                            System.out.println("Computer won this round");
                            playerTwoWins++;
                        }

                        currentRound++;
                    }else if(playerOne == 4){
                        gameOver = true;
                        break;
                    }else{
                        break;
                    }
                }

                // check winner
                if(playerOneWins > playerTwoWins){
                    System.out.println("Player one won the game");
                }else if(playerOneWins < playerTwoWins){
                    System.out.println("Player two won the game");
                }else{
                    System.out.println("Game is a tie");
                }

                // print game stats
                System.out.println("Player one won " + playerOneWins + " rounds");
                System.out.println("Player two won " + playerTwoWins + " rounds");
                System.out.println("There were " + ties + " rounds during the game"); 
                
                // check if the program should ask the player to play again or not.
                if(!gameOver){
                    System.out.println("Would you like to play again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int choice = input.nextInt();
                    if(choice == 1){
                        gameOver = false;
                    }else{
                        gameOver = true;
                        // reset game variables.
                        playerOneWins = 0;
                        playerTwoWins = 0;
                        ties = 0;
                    }
                }
            }
        }
        input.close();
    }

    /**
     * checks the winner of the rock paper scissors game
     * the inputs for the actions are: 1 for rock, 2 for paper, 3 for scissors
     * if the two choices aren't equal and player one hasn't won, then player two has won
     * @param playerOne an integer that represents the first players move.
     * @param playerTwo an integer that represents the second players move.
     * @return 0 if the game is a tie, 1 if player one won, 2 if player two won.
     */
    public static int checkWinner(int playerOne, int playerTwo){
        if(playerOne == playerTwo){
            return 0;
        }else if(playerOne == 1 && playerTwo == 3){
            return 1;
        }else if(playerOne == 2 && playerTwo == 1){
            return 1;
        }else if(playerOne == 3 && playerTwo==2){
            return 1;
        }else{
            return 2;
        }
    }
}