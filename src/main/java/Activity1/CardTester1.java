package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 c1 = new Card1("Seven", "Spades", 7);
		Card1 c2= new Card1("Jack", "Diamonds", 7);
		Card1 c3= new Card1("Ace", "Diamonds", 7);
		String rizz = c1.rank();
		rizz = c2.suit();
	    int gyat = c3.pointValue();
		System.out.print(c3.toString());
		System.out.print(c1.matches(c2));
	}
}
