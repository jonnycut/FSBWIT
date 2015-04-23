package BinaryTrees;

public class BinaryTree<T extends Comparable<T>> {
	
	private Node root;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(T value){
		root = new Node(value,null,null);
	}
	
	public BinaryTree(T value, Node left, Node right){
		root = new Node(value, left, right);
	}
	
	public BinaryTree(T value, BinaryTree<T> left, BinaryTree<T> right){
		Node leftNode = left !=null? left.root:null;
		Node rightNode;
		
		if (right != null)
			rightNode = right.root;
		else
			rightNode = null;
		
		root = new Node(value, leftNode, rightNode);
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public BinaryTree getLeft(){
		if(!isEmpty()){
			BinaryTree left = new BinaryTree();
			left.root= this.root.left;
			
			return left;
			
		}else
			return null;
	}
	
	public BinaryTree getRight(){
		if(!isEmpty()){
			BinaryTree right = new BinaryTree();
			right.root= this.root.right;
			
			return right;
			 
		}else
			return null;
	}
	
	public String toString(){
		
		if(isEmpty())		
			return "";
		
	
		return getLeft().toString() + " " + getRootData() + " "+getRight().toString();
		
	
	}
	
	public T getRootData(){
		return this.root.value;
	}
	
	public int getDeep(){
		if(isEmpty()){
			return 0;
		}
		
		int leftDeep = 1+getLeft().getDeep();
		int rightDeep = 1+getRight().getDeep();
		
		if(leftDeep >= rightDeep){
			return leftDeep;
		}else{
			return rightDeep;
		}
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
