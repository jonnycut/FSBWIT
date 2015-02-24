package Router;

import java.util.ArrayList;

public class Router {
	private IPAdresse destIP;
	private ArrayList<Route> table = new ArrayList<Route>();
	
		
	
	public Route logestPrefMatch(IPAdresse destIP){
		Route longestPref=table.get(0);
		
		for(int i=0; i<table.size();i++){
			if(i+1>table.size()-1 && table.get(i).getNet().ipMatch(destIP)) return longestPref;
			if(table.get(i).getNet().ipMatch(destIP) && table.get(i).getNet().getMaskLength()>longestPref.getNet().getMaskLength())
				longestPref=table.get(i);
			
		}
		
		
		return longestPref;
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
