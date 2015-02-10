package Subnetting;

public class IPAdresse {
	private int ipAdd;
	private String ipBin;	//contains binari String of ipAdd
	
	
	
	public IPAdresse(int ipAdd){				
		this.ipAdd=ipAdd;
		ipBin=Integer.toBinaryString(ipAdd);
		
		while(ipBin.length()<32){ 				//ipBin auf 32 Stellen auffüllen
			ipBin="0"+ipBin;
		}
	}

	public IPAdresse(int first, int second, int third, int fourth){
		this.ipAdd = dotToInt(first,second,third,fourth);
		ipBin=Integer.toBinaryString(ipAdd);
		while(ipBin.length()<32){
			ipBin="0"+ipBin;
		}
	
	}
	
	public IPAdresse(String dez){
		String[] bin = dez.split("\\.");
		this.ipAdd = dotToInt(Integer.parseInt(bin[0]),Integer.parseInt(bin[1]),Integer.parseInt(bin[2]),Integer.parseInt(bin[3]));
		ipBin=Integer.toBinaryString(ipAdd);
		while(ipBin.length()<32){
			ipBin="0"+ipBin;
		}
		
	}
	
	public int dotToInt(int first, int second, int third, int fourth){
		return first * 16777216 + second * 65536 + third * 256 + fourth;	//erwartet 4 integer, wandelt diese in eine Ganzzahl um
	}
	
	
	
	public String[] toBin(String dez){					//zZt. nicht genutzt, wandelt eine IP in der dot Schreibweise in ein Array[4] um (oktetts)
		
		String[] arrayD = dez.split("\\.");
		int[] arrayID = new int[4];
		
		
		String[] arrayB = new String[4];
		
		for(int i=0; i<=arrayD.length;i++){
			
			
			arrayID[i]=Integer.parseInt(arrayD[i]);	
			arrayB[i]=Integer.toBinaryString(arrayID[i]);
			while(arrayB[i].length()<8){
				arrayB[i] = 0+arrayB[i];
			}
		}
		
		return arrayB;
	}
	
	public String getIpBin(){
		return ipBin;
	}
	
	public int getOkt(int okt){				//liefert das entsprechende Oktett der IP zur basis 10 zurück (ausgehend vom Binärstring)
		
		switch(okt){
			
			case 1:
				return Integer.parseInt(ipBin.substring(0, 8),2);
			case 2:
				return Integer.parseInt(ipBin.substring(8, 16),2);
			case 3:
				return Integer.parseInt(ipBin.substring(16, 24),2);
			case 4:
				return Integer.parseInt(ipBin.substring(24),2);
			default:
				return -1;
				
		}
		
	}
	
	public String toString(){
		
		return "[IP:" + getOkt(1)+"."+ getOkt(2)+"."+ getOkt(3)+"."+getOkt(4)+"][Bin: "+ipBin+"]";
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