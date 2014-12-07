
public class CharStack {
	
private char[] stack = new char[0];
	
	
	
	public void push(char wert){
		
		
		char[] puffer = new char[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				puffer[i] = stack[i];
				
		}
		
		puffer[puffer.length -1] = wert;
		stack = puffer;
		
		
	}
	
	public int pop(){
		
		char puffer;
		puffer = stack[stack.length -1];
		deleteLast();
		
		return puffer; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;
		
		
	}
	
	public void deleteLast(){
		char[] puffer = new char[stack.length -1];
		
		for (int i = 0; i<puffer.length; i++){
			puffer[i] = stack[i];
		}
		
		stack = puffer;
	}

}
