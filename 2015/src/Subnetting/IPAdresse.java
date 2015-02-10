package Subnetting;

public class IPAdresse {
	String[] bin;
	String dez;
	String mask;
	char netclass;
	
	public IPAdresse(String dez){
		if (dez.length()>15) return; //ToDo: Fehleranzeige
		this.dez = dez;
		this.bin=toBin(dez);
	}
	
	public String[] toBin(String dez){
		
		String[] arrayD = dez.split("\\.");
		
		
		
		String[] arrayB = new String[4];
		
		for(int i=0; i<=3;i++){
			int[] arrayID = new int[4];
			arrayID[i]=Integer.parseInt(arrayD[i]);	
			arrayB[i]=Integer.toBinaryString(arrayID[i]);
			while(arrayB[i].length()<8){
				arrayB[i] = 0+arrayB[i];
			}
		}
		
		return arrayB;
	}
	
	public String toString(){
		return "[IP: "+dez+"][Bin: "+bin[0]+"."+bin[1]+"."+bin[2]+"."+bin[3]+ "][Mask: "+mask+"][Class: "+netclass+"]";
	}
	

}
