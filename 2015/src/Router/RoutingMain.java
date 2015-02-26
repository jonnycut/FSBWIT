package Router;

public class RoutingMain {

	public static void main(String[] args) {
		Netzwerk net = new Netzwerk(new IPAdresse("192.168.0.0"),new IPAdresse("255.0.0.0"));
		Router router = new Router();
		
		router.routeAdd(new Route(new Netzwerk(new IPAdresse("192.168.0.200"),new IPAdresse("26")),1,new IPAdresse("190.2.2.1")));
		router.routeAdd(new Route(new Netzwerk(new IPAdresse("192.168.0.0"),new IPAdresse("25")),2,new IPAdresse("180.1.1.1")));
		router.routeAdd(new Route(new Netzwerk(new IPAdresse("192.168.0.0"),new IPAdresse("8")),3,new IPAdresse("121.20.20.1")));
		router.routeAdd(new Route(new Netzwerk(new IPAdresse("192.168.0.0"),new IPAdresse("24")),4,new IPAdresse("100.5.5.1")));
		router.routePrint();
		System.out.println();
		System.out.println("Route:");
		System.out.println(router.longestPrefMatch((new IPAdresse("192.168.0.128"))));
		System.out.println(net.ipMatch(new IPAdresse("192.168.0.200")));
		
	}

}
