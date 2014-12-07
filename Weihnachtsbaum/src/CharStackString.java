
public class CharStackString {
	
	private String stack = "";

	
	public boolean isEmpty(){
		
		return stack.length()== 0;
		
	}
	
	public void push (char wert){
		stack = stack + wert;
		
		
	}
	
	public char pop(){
		
		
		char puffer = stack.charAt(stack.length() -1);
		stack = stack.substring(0, stack.length() -1);
		return puffer;
		
	}
	
}
	

