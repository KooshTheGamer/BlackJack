public class Card 
{
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
