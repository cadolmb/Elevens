/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */

	private static final String[] STANDARD_RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	private static final String[] STANDARD_SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};

	private static final int[] STANDARD_POINTVALUES = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	public static void main(String[] args) {

		Deck d = new Deck(STANDARD_RANKS, STANDARD_SUITS, STANDARD_POINTVALUES);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal 30 Cards ****");
		for (int i = 0; i < 30; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 30 Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal rest of cards ****");
		for (int i = 0; i < 22; i++) {
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

		System.out.println("**** Reshuffle deck ****");
		d.shuffle();
		System.out.println();
		System.out.println();

		System.out.println("**** After reshuffle ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
	}
}
