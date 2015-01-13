
public class ObjectStack {

	private Object[] stack = {null,null};
	
	private ObjectStack(Object a){
		stack[0] = a;
	}


	public void push(Object a){
		
		Object puffer;
		puffer = stack[0];
		stack[0] = a;
		stack[1] = new ObjectStack(puffer);
	} //end push
		
	public Object pop(){
		
		Object tmp = null;
			
			int spot = 0;
			
			if(stack[spot+1] == null ){
				tmp = stack[spot];
				stack[spot] = null;
			} //end if
					
		return tmp;
	} //end pop
	
	public boolean isEmpty(){
		return (boolean) (stack[0] = null);
		
	}
	
	
	
	
}//end class
