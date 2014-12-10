import java.util.Scanner;



public class TestStackMachine {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String  eingabe = new String();
		Stack intStack = new Stack();
		int puffer1 = 0;
		int puffer2 = 0;
		
		System.out.println("String eingabe:");
		eingabe = s.next();
		for (int i = 0; i < eingabe.length(); i++){
			
			char debug = eingabe.charAt(i);
			
			switch (eingabe.charAt(i)){
			
				case '+':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					puffer2 = intStack.pop();
					intStack.deleteLast();
					intStack.push(puffer1+puffer2);
					break;
					
				case '-':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					puffer2 = intStack.pop();
					intStack.deleteLast();
					intStack.push(puffer1-puffer2);
					break;
				case '*':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					puffer2 = intStack.pop();
					intStack.deleteLast();
					intStack.push(puffer1*puffer2);
					break;
					
				case '.':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					System.out.println((char) (puffer1));
					break;
					
				case 'w':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					System.out.println(puffer1);
				    break;
				
				case 'r':
					System.out.println();
					System.out.println("Bitte Int Wet eingeben: ");
					//Scanner s2= new Scanner(System.in);
					int temp = s.nextInt();
					intStack.push(temp);
					break;
					
				case 'p':
					String tempStr = eingabe.substring(i+1, i+5);
					puffer1 = Integer.parseInt(tempStr, 16);
					intStack.push(puffer1);
					break;
					
				case 'd':
					intStack.deleteLast();
					break;
					
				case 'c':
					puffer1 = intStack.pop();
					intStack.push(puffer1);
					break;
				
				case 's':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					puffer2 = intStack.pop();
					intStack.deleteLast();
					intStack.push(puffer1);
					intStack.push(puffer2);
					break;
					
				case 'j':
					puffer1 = intStack.pop();
					intStack.deleteLast();
					puffer2 = intStack.pop();
					intStack.deleteLast();
					if (puffer2 !=0) i = puffer1 - 1;
					
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
