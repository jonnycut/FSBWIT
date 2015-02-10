package Subnetting;

public class IPAdresse {
	int ipAdd;
	
	
	

	public IPAdresse(int first, int second, int third, int fourth){
		this.ipAdd = dotToInt(first,second,third,fourth);
	}
	
	public IPAdresse(String dez){
		String[] bin = dez.split("\\.");
		this.ipAdd = dotToInt(Integer.parseInt(bin[0]),Integer.parseInt(bin[1]),Integer.parseInt(bin[2]),Integer.parseInt(bin[3]));
	}
	
	public int dotToInt(int first, int second, int third, int fourth){
		return first * 16777216 + second * 65536 + third * 256 + fourth;
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
	

}//end class



//public IPAdresse(long gZahl){
//	this.gZahl=gZahl;
//	
//	String[] bin=new String[4];
//	String puffer = Long.toBinaryString(gZahl);
//	int start=0;
//	int end=8;
//	int tmp=0;
//	String dez="";
//	
//	for(int i=0; i<4;i++){
//		bin[i]=puffer.substring(start,end);
//		tmp = Integer.parseInt(bin[i],2);
//		dez=dez+tmp+".";
//		start=end;
//		end = end +8;
//		
//	}
//	this.dez=dez;
//	this.bin=bin;
//	
//}