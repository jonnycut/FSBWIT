public class Crypto {

	private char[] key; // geheimer Schl�ssel

	// Erzeugt ein Array der Laenge length mit zufaelligen 
	// Charwerten aus dem Array digits und speichert es
	// im Attribut key
	private void generateKey(int length) {

		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		char[] puffer = new char[length];
		
		for (int i = 0; i<= length -1 ; i++){
			
			int randomZahl = (int) (Math.random()*digits.length);			
			puffer[i] = digits[randomZahl];
			key = puffer;
			
					
		}
		

	}

	// Nimmt einen String entgegen und verkn�pft jedes Zeichen des Strings mit
	// dem jeweiligen Wert (Index) im geheimen Schl�ssel �ber ein XOR.
	// Liefert den verschl�sselten Text als String zur�ck.
	public String encrypt(String message) {

		generateKey(message.length());
		int[] geheimeMessage = new int[message.length()];
		String geheimTextString = "";

		for (int i = 0; i < message.length(); i++) {
			geheimeMessage[i] = key[i] ^ message.charAt(i);
			geheimTextString += (char) geheimeMessage[i];
		}

		return geheimTextString;

	}

	
	// Entschl�sselt den �bergebenen String mit Hilfe des geheimen Schl�ssels
	// und gibt den entschl�sselten Text als String zur�ck.
	public String decrypt(String geheimeMessage) {
		
		int[] klarMessage = new int[message.length()];
		String geheimTextString = "";

		for (int i = 0; i < message.length(); i++) {
			geheimeMessage[i] = key[i] ^ message.charAt(i);
			geheimTextString += (char) geheimeMessage[i];
		}

		return geheimTextString;

		
	}


}
