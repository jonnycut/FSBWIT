package Router;

public class IPAdresse {
	private int ipAdd;
	
	
	
	public IPAdresse(int ipAdd){				
		this.ipAdd=ipAdd;

	}

	public IPAdresse(int first, int second, int third, int fourth){
		this.ipAdd = dotToInt(first,second,third,fourth);
	
	}
	
	public IPAdresse(int[] ipArray){
		this.ipAdd =dotToInt(ipArray[0],ipArray[1],ipArray[2],ipArray[3]);
	}
	
	public IPAdresse(String dez){
		if(dez.contains(".")){
			String[] bin = dez.split("\\.");
			this.ipAdd = dotToInt(Integer.parseInt(bin[0]),Integer.parseInt(bin[1]),Integer.parseInt(bin[2]),Integer.parseInt(bin[3]));

		}else{
			int slashmask = -1;							//CIDR Schreibweise verarbeiten, wenn IP eine Maske ist
			int register = 32 -Integer.parseInt(dez);
			slashmask = slashmask << register;
			this.ipAdd = slashmask;
			
//			String slashMask ="";
//			for(int i=0; i!=32;i++){
//				
//				if (i>=Integer.parseInt(dez)){
//					slashMask = slashMask+"0";
//				}else{
//					slashMask +=1;
//				}
//			}
//			
//			this.ipAdd = dotToInt(Integer.parseInt(slashMask.substring(0, 8), 2),Integer.parseInt(slashMask.substring(8, 16), 2),Integer.parseInt(slashMask.substring(16, 24), 2),Integer.parseInt(slashMask.substring(24), 2));
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


