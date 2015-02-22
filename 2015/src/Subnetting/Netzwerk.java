package Subnetting;

public class Netzwerk {
	private IPAdresse ip;
	private int netID;
	//private int mask;
	private IPAdresse mask;
	
	
	public Netzwerk(IPAdresse ip){
		
		this.ip = ip;
		if(ip.getOkt(1)>=192){							//class C
			mask = new IPAdresse(-256);
		}else if(ip.getOkt(2)>=128){					//class B
			mask = new IPAdresse(-65536);
		}else{
			mask = new IPAdresse(-16777216);			//class A
		}
		
		this.netID=(ip.getIpAdd()&mask.getIpAdd());
	}
	
	public Netzwerk(IPAdresse ip, IPAdresse mask){
		this.ip =ip;
		this.mask = mask;
		this.netID=(ip.getIpAdd()&mask.getIpAdd());
		
	}
	
//-------------------------------------------möglichkeit, die Maske nicht als IPAdresse() zu behandeln------------------------------------------------------
	
//	public Netzwerk(IPAdresse ip,String mask){
//		this.ip=ip;
//		if (mask.length()>2){
//			String[] maskArray = mask.split("\\.");
//			this.mask=dotToInt(Integer.parseInt(maskArray[0]),Integer.parseInt(maskArray[1]),Integer.parseInt(maskArray[2]),Integer.parseInt(maskArray[3]));
//			
//		}else{
//			String slashMask ="";
//			for(int i=0; i!=32;i++){
//				
//				if (i>=Integer.parseInt(mask)){
//					slashMask = slashMask+"0";
//				}else{
//					slashMask +=1;
//				}
//			}
//			
//			this.mask = dotToInt(Integer.parseInt(slashMask.substring(0, 8), 2),Integer.parseInt(slashMask.substring(8, 16), 2),Integer.parseInt(slashMask.substring(16, 24), 2),Integer.parseInt(slashMask.substring(24), 2));
//		}
//		this.netID=(ip.getIpAdd()&this.mask);
//	}
	
//	public Netzwerk(IPAdresse ip, int mask){
//		this.ip=ip;
//		this.mask=mask;
//		
//	}
	
	public int dotToInt(int first, int second, int third, int fourth){
		return first * 16777216 + second * 65536 + third * 256 + fourth;	//erwartet 4 integer, wandelt diese in eine Ganzzahl um
	}
	
	public IPAdresse getIp() {
		return ip;
	}
	public void setIp(IPAdresse ip) {
		this.ip = ip;
	}
	public IPAdresse getMask() {
		return mask;
	}
	public void setMask(IPAdresse mask) {
		this.mask = mask;
	}
	
	public int getNetID(){
		return netID;
	}
	public int getOkt(int zahl,int okt){				//liefert das entsprechende Oktett der Mask zur basis 10 zurück
		return ((zahl>>(4-okt)*8)&255);
	}
	public int getMaxHosts(){
		return ~mask.getIpAdd()-1;
	}
	public String getBC(){
		return getOkt(ip.getIpAdd()|~mask.getIpAdd(),1)+"."+getOkt(ip.getIpAdd()|~mask.getIpAdd(),2)+"."+getOkt(ip.getIpAdd()|~mask.getIpAdd(),3)+"."+getOkt(ip.getIpAdd()|~mask.getIpAdd(),4);
	}
	public int getBCInt(){
		return (ip.getIpAdd()|~mask.getIpAdd());
	}
	public int maskToSlash(){
		String puffer = Integer.toBinaryString(mask.getIpAdd());
		int x=0;
		for(int i=0;i<puffer.length();i++){
			if(puffer.charAt(i)=='1') x++;
		}
		return x;
	}
	
	public String toString(){
		return "[Net: "+ getOkt(netID,1)+"."+getOkt(netID,2)+"."+getOkt(netID,3)+"."+getOkt(netID,4)+"] [BC: "+ getBC()+"] [Mask: "+getOkt(mask.getIpAdd(),1)+"."+getOkt(mask.getIpAdd(),2)+"."+getOkt(mask.getIpAdd(),3)+"."+getOkt(mask.getIpAdd(),4)+"] [Hosts: "+getMaxHosts()+"]";
	}
	
	

}
