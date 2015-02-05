package doubleChainedList05022015;

public class DCLMain {

	public static void main(String[] args) {
		String[] daten1 ={"true","false","false","true","true",};
		String[] daten2={"grün","schwarz","lila","rot","gelb"};
		DCList list = new DCList();
		
		for(int i=0;i<daten1.length;i++){
			list.add(new Falk(daten1[i],daten2[i]));
			
		}
		
		System.out.println(list);
		System.out.println();
		System.out.println();
		System.out.println(list.toStringRev());
	}

}
