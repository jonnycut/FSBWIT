package Router;

import java.util.ArrayList;

public class Router {
	private IPAdresse destIP;
	private ArrayList<Route> table = new ArrayList<Route>();
	
	
	public String longestPrefMatch(IPAdresse destIP){
		Route longestPref = table.get(0);
		for(int i=0;i<table.size();i++){
			Route current=table.get(i);
			if(longestPref.getNet().getMaskLength()<current.getNet().getMaskLength()){
				longestPref=current;
			}
		}
		if(longestPref.getNet().ipMatch(destIP)==-1)
			return "No Route to host";
		
		return "Route \t"+longestPref;
	
//	public Route logestPrefMatch(IPAdresse destIP){
//		Route longestPref=table.get(0);
//		
//		for(int i=0; i<table.size();i++){
//			if(i+1>table.size()-1 && table.get(i).getNet().ipMatch(destIP)&&table.get(i).getNet().getMaskLength()>longestPref.getNet().getMaskLength()){
//				return table.get(i);
//			}
//				
//			if(table.get(i).getNet().ipMatch(destIP) && table.get(i).getNet().getMaskLength()>longestPref.getNet().getMaskLength())
//				longestPref=table.get(i);
//			
//		}
		
		
		
	}
	public void routeAdd(Route route){
		table.add(route);
	}
	
	public void routePrint(){
		for(Route current: table){
			System.out.println(current);
		}
	}

}
