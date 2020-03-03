public class Tester {
	public static void main(String[] args) {
		Card test1 = new Card("Ace", "Spades", 1);
		Card test2 = new Card("Ace", "Spades", 1);
		Card test3 = new Card("10", "Diamonds", 10);
        System.out.println(test1.suit());
        System.out.println(test1.rank());
        System.out.println(test1.pointValue());
        System.out.println(test1.toString());
        System.out.println(test1.matches(test2));
        System.out.println(test2.matches(test3));

	}
}
