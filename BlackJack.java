import java.nio.ReadOnlyBufferException;
import java.util.*;

public class BlackJack
{
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;
    
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;

    // The starting bankroll for the player.
    private static final int STARTING_BANKROLL = 100;
    
    
    
    
        /**
     * Play the blackjack game. Initialize the bankroll and keep
     * playing rounds as long as the user wants to.
     */
    public static void main(String[] args){
        Scanner readLine = new Scanner(System.in);  // Create a Scanner object
        double bankroll = STARTING_BANKROLL;
        System.out.println("Starting bankroll: " + bankroll);
   
        while(true)
        {
            bankroll = playRound(bankroll);
            
            String playAgain = readLine.nextLine("Would you like to play again? (Y/N)");
            if(playAgain.equalsIgnoreCase("N"))
            {
                break;
            }
        }
        
        System.out.println("Thanks for playing!");
    }
        
    
    

    /**
     * Ask the player for a move, hit or stand.
     * 
     * @return A lowercase string of "hit" or "stand"
     * to indicate the player's move.
     */
    private static String getPlayerMove()
    {
        Scanner readLine = new Scanner(System.in);
        String playerMove = readLine.nextLine();
        System.out.println("What's your move? (hit/stand?) ");
        while(true)
        {
            if(playerMove.equals("hit") || playerMove.equals("stand") )
            {
                return playerMove.toLowerCase();
            }
            else
            {
                return "Try again, invalid input";
            }    
        }    
    }
    
    /**
     * Play the dealer's turn.
     * 
     * The dealer must hit if the value of the hand is less
     * than 17. 
     */
    
    private static void dealerTurn(Hand dealer, Deck deck)
    {
        return
        
    }
    
     /**
     * Play a player turn by asking the player to hit
     * or stand.
     * 
     * Return whether or not the player busted.
     */
    private static boolean playerTurn(Hand dealer, Deck deck)
    {
        
        return;
    }
    

    /**
     * Determine if the player wins. 
     * 
     * If the player busted, they lose. If the player did 
     * not bust but the dealer busted, the player wins.
     * 
     * Then check the values of the hands.
     * 
     */
    private static boolean playerWins(Hand player, Hand dealer)
    {
        return;
    }
    
    
    /**
     * Find the winner between the player hand and dealer
     * hand. Return how much was won or lost.
     */
    private static double findWinner(Hand dealer, Hand player, int bet)
    {
        return;
    }
    
        /**
     * This plays a round of blackjack which includes:
     * - Creating a deck
     * - Creating the hands
     * - Dealing the round
     * - Playing the player turn
     * - Playing the dealer turn
     * - Finding the winner
     */
     
    private double playRound(double bankroll)
    {
        return; 
    }
    
    
}