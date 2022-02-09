import java.util.*;

/*Your hand class should...
*Have a list of cards
*Be able to compute the hand's value
*Be able to add a card to the hand
*Be able to determine if the hand is a blackjack, busted, or a five-card-charlie
*Return a String version.*/


public class Hand 
{
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;
    
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;
    
    // This represents the list of cards in the hand.
    private ArrayList<Card> cards;
    
     /**
     * This constructor sets up our hand by initializing our
     * ArrayList.
     */
    public Hand()
    {
        cards = new ArrayList<>();
    }
    
     
    /**
     * This adds a card to our hand.
     * 
     * @param c The card to add to the hand.
     */
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    
    
    /**
     * This returns the value of the hand as an integer.
     * 
     * The value of the hand is the sum of the values
     * of the individual cards. There is also an adjustment
     * made for the value of an ace, which can be 11 or 1
     * depending on the situation.
     * 
     * @return The value of the hand.
     */
    public int getValue()
    {
        int handValue = 0;
        
        for(Card c: cards)
        {
            handValue += c.getValue();
        }
        return handValue; 
    }
    
    /**
     * Return if this hand has a blackjack.
     * 
     * @return If the hand is a blackjack.
     */
    
    public boolean hasBlackjack()
    {
        return getValue() == 21 && cards.size() == 2;
    } 
    
    
    
    
    /**
     * Return if the hand busted, which means has a value
     * greater than 21.
     * 
     * @return If the hand busted.
     */
    public boolean busted()
    {
        return getValue() > 21;
    }
    
    /**
     * Return if the hand is a five-card-charlie, which means
     * contained five cards.
     * 
     * @return If the hand was a five-card charlie.
     */
    public boolean fiveCardCharlie()
    {
        return cards.size() == 5;
    }
    
    /**
     * Return a String representation of the hand, including showing
     * the value.
     */
    public String toString()
    {
        String output = "";

        for(Card c: cards)
        {
            output += c + " ";
        }
        output += "(" + getValue() + ")";

        return output;
    }

}
