
public class Text {
			
		private String eingabe = new String("Hallo, ich bin der vorgegebene Text.");
		private int wordBegin = 0;
		private int wordEnd = 0;
		private int start = 0;
		private int end = 0;
		private int endSub = 0;
		private char leer = ' ';
		private int i = 0;
		private int a;
		private String ausgabe;
		
		

		
		
		public void subString() {
			
		
			
			
			end = eingabe.length();
			
			
			for (a = 0; a <= end ; a++) {
			
				
			
			wordEnd = eingabe.indexOf(leer, wordEnd+1);
			if (wordEnd ==-1) {
				wordEnd = end;
				
			}
			
			
			
			String ausgabe = eingabe.substring(wordBegin, wordEnd);
			
			
				endSub = ausgabe.length();
				for (i = endSub - 1; i >= 0; i--) {
					System.out.print(ausgabe.charAt(i));
					if (i ==0){
						System.out.print(" ");
					}
					
				}
				wordBegin = wordEnd +1;
				if (wordBegin > end){
					break;
				}
				
				
				
			}
				
			
		
			
			
		}
		
		//public void subStringOut() {
			
			//subString().
			//System.out.println(ausgabe);
		//}
		
			
		
		

	}



