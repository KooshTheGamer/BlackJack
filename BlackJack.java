import java.nio.ReadOnlyBufferException;
import java.util.*;


// stopped at 16:00
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
            
            String playAgain = readLine.nextLine();
            System.out.println("Would you like to play again? (Y/N)");
            readLine.close();
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
        while(true)
        {
            String playerMove = readLine.nextLine();
            System.out.println("What's your move? (hit/stand?) ");
            readLine.close();
            if(playerMove.equalsIgnoreCase("hit") || playerMove.equalsIgnoreCase("stand") )
            {
                return playerMove;
            }
            System.out.println("Try again, invalid input");
            
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
        while(true)
        {
            Scanner readLine = new Scanner(System.in);
            System.out.println("Dealer's hand");
            System.out.println(dealer);
            
            int value = dealer.getValue();
            System.out.println("Dealer's hand has value " + value);
            readLine.nextLine();
            System.out.println("Enter to continue...");
            readLine.close();
            if(value < 17)
            {
                System.out.println("Dealer hits");
                Card c = deck.deal();
                dealer.addCard(c);
                
                System.out.println("Dealer card was " + c);
                
                if(dealer.busted())
                {
                    System.out.println("Dealer busted!");
                    break;
                }
            }
            else
            {
                System.out.println("Dealer stands.");
                break;
            }
        }
        
    }
    
     /**
     * Play a player turn by asking the player to hit
     * or stand.
     * 
     * Return whether or not the player busted.
     */
    private static boolean playerTurn(Hand player, Deck deck)
    {
        String move = getPlayerMove();
        
        System.out.println("Move: " + move);
        
        if(move.equals("hit"))
        {
            Card c = deck.deal();
            System.out.println("You're card was: " + c);;
            player.addCard(c);
            System.out.println("Player's Hand");
            System.out.println(player);

            if(player.busted())
            {
                return true;
            }
        }
        else //chose stand 
        {
            return false;
        }
        return false;

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
        if(player.busted())
        {
            return false;
        }
        
        if(dealer.busted())
        {
            return true;
        }
        
        return player.getValue() > dealer.getValue();
    }
    
    //checks if theres a tie if both player and dealer have the same val
    private static boolean push(Hand player, Hand dealer)
    {
        return player.getValue() == dealer.getValue();
    }
    /**
     * Find the winner between the player hand and dealer
     * hand. Return how much was won or lost.
     */
    private static double findWinner(Hand dealer, Hand player, int bet)
    {
        if(playerWins(player, dealer))
        {
            System.out.println("Player wins!");
            
            if(player.hasBlackjack())
            {
                return 1.5 * bet;
            }
            
            return bet;
        }
        else if(push(player, dealer))
        {
            System.out.println("You push");
            return 0;
        }
        else
        {
            System.out.println("Dealer wins");
            return -bet;
        }
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
     
    private static double playRound(double bankroll)
    {
        Scanner readLine = new Scanner(System.in);
        String bet1 = readLine.nextLine();
        System.out.println("What is your bet? ");
        readLine.close();
        int bet = Integer.parseInt(bet1);
        Deck deck = new Deck();
        deck.shuffle();
        
        Hand player = new Hand();
        Hand dealer = new Hand();
        
        player.addCard(deck.deal());
        dealer.addCard(deck.deal());
        player.addCard(deck.deal());
        dealer.addCard(deck.deal());
        
        System.out.println("Player's Hand");
        System.out.println(player);
        
        
        System.out.println("Dealer's hand");
        //System.out.println(dealer);????
        dealer.printDealerHand();
        
        boolean playerBusted = playerTurn(player, deck);
        
        if(playerBusted)
        {
            System.out.println("You busted :(");
        }

        readLine.nextLine();
        System.out.println("Enter for dealer turn...");
        readLine.close();
        dealerTurn(dealer, deck);
        
        double bankrollChange = findWinner(dealer, player, bet);
        
        bankroll += bankrollChange;
        
        System.out.println("New bankroll: " + bankroll);
        
        return bankroll;
    }
    
    
}