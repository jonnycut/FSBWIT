package BinaryTrees;

public class TreeTest {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(1);
		BinaryTree<Integer> b = new BinaryTree<>(3);
		BinaryTree<Integer> c = new BinaryTree<>(2,a,b);
		
		BinaryTree<Integer> d = new BinaryTree<>(5);
		BinaryTree<Integer> e = new BinaryTree<>(7);
		BinaryTree<Integer> f = new BinaryTree<>(6, d,e);
		
		BinaryTree<Integer> g = new BinaryTree<>(4,c,f);
		
		System.out.println(g);
		

	}

}
