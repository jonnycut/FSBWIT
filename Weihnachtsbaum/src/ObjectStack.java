
public class ObjectStack {

private Object[] stack = new Object[0];
	
	
	
	public void push(Object wert){
		
		
		Object[] puffer = new Object[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				puffer[i] = stack[i];
				
		}
		
		puffer[puffer.length -1] = wert;
		stack = puffer;
		
		
	}
	
	public Object pop(){
		
		Object puffer;
		puffer = stack[stack.length -1];
		deleteLast();
		
		return puffer; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;		
		
	}
	
	public void deleteLast(){
		Object[] puffer = new Object[stack.length -1];
		
		for (int i = 0; i<puffer.length; i++){
			puffer[i] = stack[i];
		}
		
		stack = puffer;
	}
}
