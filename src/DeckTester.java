/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
        System.out.println("Cards are now being shuffled...");
        String[]ranks2= new String[52];
        String[]suits2= new String [52];
        int []pointValues2 = new int [52];

        for (int i=0; i<52; i++){
            String rank = "";
            String suit = "";

            if ((i+1)%13 == 12){
                rank = "Queen";
            }
            if ((i+1)%13 == 11){
                rank = "Jack";
            }
            if ((i+1)%13==0){
                rank = "King";
            }
            if ((i+1)%13==1){
                rank= "Ace";
            }
            if (i<26){
                suit="Diamond";
            }
            else if (i<13){
                suit = "Heart";
            }
            else if (i<39){
                suit = "Clubs";
            }
            else{
                suit = "Spades";
            }

            suits2[i]=suit;
            ranks2[i]=rank;
            pointValues2[i]=((i+1)%13);
        }

        Deck m = new Deck (suits2, ranks2, pointValues2);
        System.out.println(m);
    }

}
