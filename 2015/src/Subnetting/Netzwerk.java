package Subnetting;

public class Netzwerk {
	private IPAdresse ip;
	private int netID;
	private int mask;
	
	
	public Netzwerk(IPAdresse ip){
		
		this.ip = ip;
		if(ip.getOkt(1)>=192){			//class C
			mask =-256;
		}else if(ip.getOkt(2)>=128){	//class B
			mask = -65536;
		}else{
			mask = -16777216;			//class A
		}
		
		this.netID=(ip.getIpAdd()&mask);
	}
	
	public Netzwerk(IPAdresse ip,String mask){
		this.ip=ip;
		if (mask.length()>2){
			String[] maskArray = mask.split("\\.");
			this.mask=dotToInt(Integer.parseInt(maskArray[0]),Integer.parseInt(maskArray[1]),Integer.parseInt(maskArray[2]),Integer.parseInt(maskArray[3]));
			
		}else{
			String slashMask ="";
			for(int i=0; i!=32;i++){
				
				if (i>=Integer.parseInt(mask)){
					slashMask = slashMask+"0";
				}else{
					slashMask +=1;
				}
			}
			
			this.mask = dotToInt(Integer.parseInt(slashMask.substring(0, 8), 2),Integer.parseInt(slashMask.substring(8, 16), 2),Integer.parseInt(slashMask.substring(16, 24), 2),Integer.parseInt(slashMask.substring(24), 2));
		}
		this.netID=(ip.getIpAdd()&this.mask);
	}
	
	public int dotToInt(int first, int second, int third, int fourth){
		return first * 16777216 + second * 65536 + third * 256 + fourth;	//erwartet 4 integer, wandelt diese in eine Ganzzahl um
	}
	
	public IPAdresse getIp() {
		return ip;
	}
	public void setIp(IPAdresse ip) {
		this.ip = ip;
	}
	public int getMask() {
		return mask;
	}
	public void setMask(int mask) {
		this.mask = mask;
	}
	
	public int getOkt(int zahl,int okt){				//liefert das entsprechende Oktett der Mask zur basis 10 zurück
		return ((zahl>>(4-okt)*8)&255);
	}
	public int getHosts(){
		return ~mask-1;
	}
	public String getBC(){
		return getOkt(ip.getIpAdd()|~mask,1)+"."+getOkt(ip.getIpAdd()|~mask,2)+"."+getOkt(ip.getIpAdd()|~mask,3)+"."+getOkt(ip.getIpAdd()|~mask,4);
	}
	
	public String toString(){
		return "[Net: "+ getOkt(netID,1)+"."+getOkt(netID,2)+"."+getOkt(netID,3)+"."+getOkt(netID,4)+"] [Mask: "+getOkt(mask,1)+"."+getOkt(mask,2)+"."+getOkt(mask,3)+"."+getOkt(mask,4)+"] [Hosts: "+getHosts()+"]";
	}
	
	

}
