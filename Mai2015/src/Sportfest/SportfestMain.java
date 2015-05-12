package Sportfest;

public class SportfestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String einlesen(){
		
		char c;
		String ret = "";
		
		try{
			while((c=(char)System.in.read()) != (char)13)
					ret +=c;
		} catch(Exception e) {}
		
		return ret.trim();
	}

}
