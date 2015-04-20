package BinaryTrees;

public class BinaryTree<T> {
	
	private Node root;
	
	public BinaryTree(T value, Node left, Node right){
		root = new Node(value, left, right);
	}
	
	
	
	
	
	
	private class Node{
		private T value;
		private Node left;
		private Node right;
		
		private Node(T value, Node left, Node right){
			this.value = value;
			this.left = left;
			this.right=right;
			
			
		}
		
		
	}

}
