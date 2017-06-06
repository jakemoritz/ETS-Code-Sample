import java.util.ArrayList;
import java.util.Random;

public class Dealer {

	private ArrayList<Card> deck;

	public Dealer() {
		this.deck = generateDeck();
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = deck.size() - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);

			Card card = deck.get(index);

			deck.set(index, deck.get(i));
			deck.set(i, card);
		}
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

	public Card dealOneCard() {
		if (!deck.isEmpty()) {
			Card card = deck.remove(deck.size() - 1);
			System.out.println(card);
			return card;
		}

		return null;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

}
