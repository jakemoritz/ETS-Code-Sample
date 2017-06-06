import java.util.Random;

public class Dealer {

	private Card[] deck;
	int lastCardIndex = 51;

	public Dealer() {
		this.deck = generateDeck();
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = deck.length - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);

			Card card = deck[index];

			deck[index] = deck[i];
			deck[i] = card;
		}
	}

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

	public Card dealOneCard() {
		if (lastCardIndex >= 0) {
			Card card = deck[lastCardIndex];
			deck[lastCardIndex] = null;
			System.out.println(card);

			lastCardIndex--;
			return card;
		}

		return null;
	}

	public Card[] getDeck() {
		return deck;
	}

}
