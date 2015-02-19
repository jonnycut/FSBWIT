package Subnetting;

public class IPAdresse {
	private int ipAdd;
	private String ipBin;	//contains binary String of ipAdd
	
	
	
	public IPAdresse(int ipAdd){				
		this.ipAdd=ipAdd;
		ipBin=Integer.toBinaryString(ipAdd);
		
		while(ipBin.length()<32){ 				//ipBin auf 32 Stellen auff�llen
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
	
	public int getOkt(int okt){				//liefert das entsprechende Oktett der IP zur basis 10 zurück (ausgehend vom Bin�rstring)
		return ((ipAdd>>(4-okt)*8)&255);
	}
	
	public String toString(){
		
		return "[IP:" + getOkt(1)+"."+ getOkt(2)+"."+ getOkt(3)+"."+getOkt(4)+"]";
	}

	public int getIpAdd() {
		return ipAdd;
	}

	public void setIpAdd(int ipAdd) {
		this.ipAdd = ipAdd;
	}
	

}//end class


