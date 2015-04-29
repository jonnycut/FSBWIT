package BinaryTrees;

public class BinaryTreeOpa {
	private Node root;

	public BinaryTreeOpa() {

	}

	public BinaryTreeOpa(double value) {
		this.root = new Node(null, value, null);
	}

	public BinaryTreeOpa(BinaryTreeOpa left, double value, BinaryTreeOpa right) {
		Node leftNode = left != null ? left.root : null;
		Node rightNode = right != null ? right.root : null;

		this.root = new Node(leftNode, value, rightNode);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public BinaryTreeOpa getLeft() {
		if (!isEmpty()) {
			BinaryTreeOpa leftTree = new BinaryTreeOpa();
			leftTree.root = root.left;
			return leftTree;
		}
		return null;
	}

	public BinaryTreeOpa getRight() {
		if (!isEmpty()) {
			BinaryTreeOpa rightTree = new BinaryTreeOpa();
			rightTree.root = root.right;
			return rightTree;
		}
		return null;
	}

	public Double getRootData() {
		return root.value;
	}

	public String toString() {
		if (isEmpty()) {
			return "";
		}
		return getLeft().toString() + " " + getRootData() + " "
				+ getRight().toString();
	}

	public boolean contains(double value) {
		if (isEmpty()) {
			return false;
		}
		if (value == getRootData()) {
			return true;
		}
		if (value < getRootData()) {
			return getLeft().contains(value);
		} else
			return getRight().contains(value);
	}

	public int getDeep() {
		if (isEmpty()) {
			return 0;
		}
		int leftDeep = 1 + getLeft().getDeep();
		int rightDeep = 1 + getRight().getDeep();

		if (leftDeep >= rightDeep) {
			return leftDeep;
		} else {
			return rightDeep;
		}

	}

	public int getSize() {
		if (isEmpty()) {
			return 0;
		}
		return getLeft().getSize() + 1 + getRight().getSize();

	}

	private class Node {
		private double value;
		private Node left;
		private Node right;

		public Node(Node left, double value, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
}
