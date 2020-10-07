import java.util.ArrayList;

class Producteur extends Thread {
	static final int MAXFILE = 5;
	static final int MAXMESSAGES = 50;
	private ArrayList<String> messages;
	private int nbMessage;

	public Producteur() {
		messages = new ArrayList<String>();
		nbMessage = 0;
	}

	public void run() {
		try {
			while (nbMessage < MAXMESSAGES) {
				insererMessage();
				System.out.println("Message numero " + nbMessage + " produit");
				nbMessage++;
				sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}

	private void insererMessage() {
		while (messages.size() == MAXFILE) {
			System.out.println("File pleine");
		}

		messages.add(new java.util.Date().toString());
	}

	public String recupererMessage() {
		while (messages.size() == 0) {
			System.out.println("File vide");
		}
		String message = (String) messages.get(0);
		messages.remove(0);
		return message;
	}
}
