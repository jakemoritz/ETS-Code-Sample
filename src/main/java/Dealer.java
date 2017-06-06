import java.util.Random;

// Holds deck array of cards, performs methods on deck
public class Dealer {

	private Card[] deck;
	int lastCardIndex = 51;

	public Dealer() {
		this.deck = generateDeck();
	}

	// Builds deck of unique cards based on Suit and Value enum types
	private Card[] generateDeck() {
		Card[] deck = new Card[52];

		int count = 0;
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				Card card = new Card(suit, value);
				deck[count++] = card;
			}
		}

		return deck;
	}

	// Shuffles deck array elements (Fisher-Yates shuffle implementation)
	public void shuffle() {
		Random random = new Random();

		for (int i = deck.length - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);
			Card card = deck[index];

			deck[index] = deck[i];
			deck[i] = card;
		}
	}

	// Remove and return a card from the deck
	public Card dealOneCard() {
		// Check if deck is empty
		if (lastCardIndex >= 0) {
			Card card = deck[lastCardIndex];
			deck[lastCardIndex] = null;

			lastCardIndex--;
			return card;
		}

		return null;
	}

	public Card[] getDeck() {
		return deck;
	}

}
