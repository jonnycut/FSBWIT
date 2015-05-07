
public class TreeMap <K extends Comparable<K>, V extends Comparable<V>>{
	
	private Node root;
	
	
	
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public TreeMap<K, V> getLeft(){
		
		if(!isEmpty()){
			TreeMap<K, V> left = new TreeMap<>();
			left.root=root.left;
			return left;
		}
		
		return null;
			
	}
	
	public TreeMap<K,V> getRight(){
		
		if(!isEmpty()){
			TreeMap<K, V> right = new TreeMap<>();
			right.root=root.right;
			return right;
		}
		
		return null;
	}
	
	public V put(K key, V value){
		if(isEmpty()){
			root = new Node(null,key,value,null);
		}else if (key.compareTo(root.key)<0){
			if(root.left==null)
				root.left = new Node(null, key, value, null);
			else
				getLeft().put(key, value);
		} else if (key.compareTo(root.key)>0){
			if (root.right == null)
				root.right = new Node(null,key,value,null);
			else
				getRight().put(key, value);
		}else
			root.value=value;
		
		return value;
	}
	
	public V get(K key){
		if(isEmpty())
			return null;
		else if(key.compareTo(root.key)<0){
			return getLeft().get(key);
		}else if (key.compareTo(root.key)>0)
			return getRight().get(key);
		else
			return root.value;
		
	}
	
	@SuppressWarnings("unchecked")
	public K getReverse(V value){
		if(isEmpty())
			return null;
		else if(value.compareTo(root.value)<0){
			return getLeft().getReverse(value);
		}else if (value.compareTo(root.value)>0)
			return getRight().getReverse(value);
		else
			return root.key;
		
	}
	
	
	private class Node{
		private K key;
		private V value;
		private Node left;
		private Node right;
		
		private Node(Node left, K key, V value, Node right){
			this.left=left;
			this.right=right;
			this.key=key;
			this.value=value;
		}
	}

}
