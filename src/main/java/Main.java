
public class Main {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();

		dealer.shuffle();

		for (int i = dealer.getDeck().length; i >= 0; i--) {
			dealer.dealOneCard();
		}
	}

}
