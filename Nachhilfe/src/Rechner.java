
public class Rechner {
	private int teiler;
	
	
	public int getTeiler() {
		return teiler;
	}

	public void setTeiler(int teiler) {
		this.teiler = teiler;
	}

	public int quadrieren(int ex){
		
		int ergebnis = ex * ex;
		
		return ergebnis;
		
	}
	
	public double teilen(int d){
		
		double ergebnis = d / (double) teiler;
		return ergebnis;
	}
	
	public int[][] array(int zeile, int spalte){
		
		int[][] array = new int[zeile][spalte];
		
		
		for (int x = 0; x <array.length; x++){
			
			
		
			for (int i =0; i< array[x].length;i++){
				
				array[x][i]= (int)(Math.random()*10);
			}
		}	
		return array;
		
		
		
	}
	
	public String arrayToString(int[][] array){
		
		String  string= new String();
	
		for (int x=0; x<array[0].length; x++){
			for (int i=0; i < array.length; i++){
				string += array[x][i];
			}
			if (x < string.length()-1) string +="|";
		}
		
		
		return string;
	}
	

}
