package Subnetting;

public class IPAdresse {
	String[] bin;
	String dez;
	long gZahl;
	
	
	public IPAdresse(String dez){
		if (dez.length()>15) return; //ToDo: Fehleranzeige
		this.dez = dez;
		this.bin=toBin(dez);
	}
	
	public IPAdresse(long gZahl){
		this.gZahl=gZahl;
		
		String[] bin=new String[4];
		String puffer = Long.toBinaryString(gZahl);
		int start=0;
		int end=8;
		int tmp=0;
		String dez="";
		
		for(int i=0; i<4;i++){
			bin[i]=puffer.substring(start,end);
			tmp = Integer.parseInt(bin[i],2);
			dez=dez+tmp+".";
			start=end;
			end = end +8;
			
		}
		this.dez=dez;
		this.bin=bin;
		
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
		return "[IP: "+dez+"][Bin: "+bin[0]+"."+bin[1]+"."+bin[2]+"."+bin[3]+ "]";
	}
	

}
