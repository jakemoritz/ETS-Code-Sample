import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deck;

	public Deck() {
		super();
		this.deck = generateDeck();
	}

	static void shuffle() {

	}

	private ArrayList<Card> generateDeck() {
		ArrayList<Card> deck = new ArrayList<>();

		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				Card card = new Card(suit, value);
				deck.add(card);
			}
		}

		return deck;
	}

}
