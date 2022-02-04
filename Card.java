public class Card 
{
    //testing from home lol
    //now testing from school
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2; 
    private static final int CLUBS = 3; 

    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;

    //INSTANCE VARIABLES.
    private int rank;
    private int suit;
    private int value; 

    private String[] ranks = {"X", "X", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private String[] suits = {"H", "D", "S", "C"};


    //constuctor 
    public Card(int r, int s)
    {
        rank = r;
        suit = s;
    }


    //getter methods. 
    public int getRank()
    {
        return rank; 
    }
    
    public int getSuit()
    {
        return suit;
    }

     /**
     * This returns the value of the card as an integer.
     * 
     * For facecards the value is 10, which is different
     * than their rank underlying value. For aces the default
     * value is 11.
     * 
     * @return The value of the card as an int.
     */
    public int getValue()
    {
        int value = rank;
        if(rank > 10)
        {
            value = 10;
        }
        
        if(rank == ACE)
        {
            value = 11;
        }
        
        return value;
    }
    
    /**
     * This utility method converts from a rank integer to a String.
     * 
     * @param r	The rank.
     * @return	String version of rank.
     */
    public String rankToString(int r)
    {
        return ranks[r];
    }
    
    /**
     * This utility method converts from a suit integer to a String.
     * 
     * @param s	The suit.
     * @return	String version of suit.
     */
    public String suitToString(int s)
    {
        return suits[s];
    }
    
    /**
     * Return the String version of the suit.
     * 
     * @return String version of suit.
     */
    public String getSuitAsString()
    {
        return suitToString(suit);
    }
    
    /**
     * Return the String version of the rank.
     * 
     * @return String version of the rank.
     */
    public String getRankAsString()
    {
        return rankToString(rank);
    }
        
    public String toString()
    {
        //Get suit for rank
        String rankString = ranks[rank];
        //get suit for the suite 
        String suitString = suits[suit];
        //combine both 
        return rankString + suitString; 
    }
}
