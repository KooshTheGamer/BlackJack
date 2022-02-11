public class BlackJackTester
{
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;
    
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;
    
    public static void CardTester() 
    {
    //thanks Koosh...
    
        Card twoHearts = new Card(13, 0);
        System.out.println(twoHearts);
    
        Card aceSpades = new Card(ACE, SPADES);
        System.out.println(aceSpades);
        System.out.println(aceSpades.getValue());
    
        System.out.println(aceSpades.getSuitAsString());
        System.out.println(aceSpades.getRankAsString());
    
        Card nine = new Card(9, DIAMONDS);
        System.out.println(nine);
    
        System.out.println(nine.getRank());
        System.out.println(nine.getValue());
    
        System.out.println("=======");
    
        for (int i = 2; i <= ACE; i++) 
        {
            Card c = new Card(i, CLUBS);
            System.out.println(c);
        }
    }
    
    public static void DeckTester()
    {
        
        Deck deck = new Deck();
        System.out.println("Deck before shuffling");
        deck.print();
        
        deck.shuffle();
        System.out.println("Deck after shuffling");
        deck.print();
        
        System.out.println("========");
        
        System.out.println(deck.deal());
        System.out.println(deck.deal());
    }
    
    public static void HandTester()
    {
        Hand h = new Hand();
        Card c = new Card(10, SPADES);
        Card c2 = new Card(5, SPADES);
        
        h.addCard(c);
        h.addCard(c2);
        System.out.println(h);
        System.out.println("Value: " + h.getValue());
        System.out.println("Busted? " + h.busted());
        
        Hand h2 = new Hand();
        Card c3 = new Card(JACK, CLUBS);
        Card c4 = new Card(ACE, HEARTS);
        h2.addCard(c3);
        h2.addCard(c4);
        System.out.println(h2);
        System.out.println(h2.hasBlackjack());
        
        Hand h3 = new Hand();
        h3.addCard(c4);
        h3.addCard(c3);
        h3.addCard(c2);
        System.out.println("=======");
        System.out.println(h3);
        System.out.println(h3.hasBlackjack());
        System.out.println(h3.busted());
        System.out.println(h3.getValue());
        Card ace = new Card(ACE, SPADES);
        h3.addCard(ace);
        
        System.out.println(h3.getValue());
	}
    
    public static void main(String[] args)
    {
        /*
         * the following tests should succeed when you execute your code
         * uncomment to test each.
         */
         
         
        //CardTester();
        DeckTester();
        //HandTester();

        
    }
}