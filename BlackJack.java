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
    
    public static void CardTester() {

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

        for (int i = 2; i <= ACE; i++) {
            Card c = new Card(i, CLUBS);
            System.out.println(c);
        }
    }
    
    public static void DeckTester(){
        
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
    
    public static void main(String[] args){
        /*
         * the following tests should succeed when you execute your code
         * uncomment to test each.
         */
         
         
        //CardTester();
        //DeckTester();
        
    }





}