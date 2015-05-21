package Sportfest;

public class Simpson implements Comparable<Simpson> {
	
	private String name;
	
	public Simpson(String name){
		
		this.name = name;
		
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Simpson s1) {
		
		return this.compareTo(s1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Simpson other = (Simpson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String toString(){
		return name;
	}
	
	
	

}
