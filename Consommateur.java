
class Consommateur extends Thread {
	static final int MAXMESSAGES = 50;
	private int nbMessage;

	Producteur producteur;

	Consommateur(Producteur p) {
		producteur = p;
		nbMessage++;
	}

	public void run() {
		try {
			while (nbMessage < MAXMESSAGES) {
				String message = producteur.recupererMessage();
				System.out.println("Message numero " + nbMessage + " recu : " + message);
				nbMessage++;
				sleep(2000);
			}
		} catch (InterruptedException e) {
		}
	}
}