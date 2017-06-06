
public class Main {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();

		dealer.shuffle();

		for (int i = dealer.getDeck().size(); i >= 0; i++) {
			dealer.dealOneCard();
		}

		System.out.println();
	}

}
