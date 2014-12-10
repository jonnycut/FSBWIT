
public class Stack {
	 
	private int[] stack = new int[0];
	
	
	
	public void push(int wert){
		
		
		int[] puffer = new int[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				puffer[i] = stack[i];
				
		}
		
		puffer[puffer.length -1] = wert;
		stack = puffer;
		
		
	}
	
	public int pop(){

		int puffer;
		puffer = stack[stack.length -1];
		//deleteLast();
		
		return puffer; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;
		
		
	}
	
	public void deleteLast(){
		int[] puffer = new int[stack.length -1];
		
		for (int i = 0; i<puffer.length; i++){
			puffer[i] = stack[i];
		}
		
		stack = puffer;
	}

}
