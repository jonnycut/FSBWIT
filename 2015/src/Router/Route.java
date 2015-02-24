package Router;

public class Route {
	
	private Netzwerk net;
	private int inTer;
	private IPAdresse gateway;
	
	
	
	
	public Route(Netzwerk net, int inTer, IPAdresse gateway) {
		
		this.net = net;
		this.inTer = inTer;
		this.gateway=gateway;
	}
	
	
	public Netzwerk getNet() {
		return net;
	}
	public void setNet(Netzwerk net) {
		this.net = net;
	}
	public int getInTer() {
		return inTer;
	}
	public void setInTer(int inTer) {
		this.inTer = inTer;
	}
	
	public String toString(){
		return net.getOkt(net.getNetID(),1)+"."+net.getOkt(net.getNetID(),2)+"."+net.getOkt(net.getNetID(),3)+"."+net.getOkt(net.getNetID(),4)+"\t/"+ (32-Integer.numberOfTrailingZeros(net.getMask().getIpAdd())+"\tGW: "+gateway +"\tInterface: "+ inTer);
	}
	
	
	
	
	
	

}
