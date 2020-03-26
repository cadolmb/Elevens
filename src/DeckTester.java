/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck = new Deck(new String[] {"ace", "six", "jack"}, new String[] {"spades", "clubs", "diamonds"}, new int[] {1, 6, 11});

		System.out.println(deck.toString());
		deck.deal();
		System.out.println(deck.toString());


		String[] ranks = {"jack", "queen", "king"};
 		String[] suits = {"blue", "red"};
 		int[] pointValues = {11, 12, 13};
 		Deck d = new Deck(ranks, suits, pointValues);
	}
}
