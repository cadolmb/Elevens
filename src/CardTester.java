/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceOfSpades = new Card("Ace", "Spades", 1);
		Card queenOfHearts = new Card("Queen", "Hearts", 12);
		Card sevenOfDiamonds = new Card("Seven", "Diamonds", 7);

		System.out.println(aceOfSpades.toString());
		System.out.println(sevenOfDiamonds.suit());
		System.out.println(queenOfHearts.rank());
	}
}
