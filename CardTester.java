public class CardTester 
{
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;
    
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;
    
    public static void main(String[] args){
        /*the following tests should succeed when you execute your code
        uncomment to test each. */
        
        Card twoHearts = new Card(13, 0);
        System.out.println(twoHearts);

        Card aceSpades = new Card(ACE, SPADES);
        System.out.println(aceSpades);
        
    }
}
