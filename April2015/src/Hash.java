
public class Hash {

	public static void main(String[] args) {
		Integer i = new Integer(122);
		
		System.out.println(i.hashCode());
		String test = "BB";
		
		System.out.println(test.hashCode());
		
		System.out.println(hash(test));

	}
	
	
	public static int hash(String s){
		int ret=0;
		
		for(int i=0; i<s.length();i++){
			ret = ret + (int) (s.charAt(i)*(int)Math.pow(31, (s.length()-i-1)));
		}
		
		
		return ret;
	}

}
