package tree;

import node.Node;

public class Tree {
	private Node root;
	//constructor

	public Tree(){
		//this.root = new Node(null);
	}
	
	//GETTER
	public Node getRoot() {
		return this.root;
	}//METHOD
	public void insert(String word) {
		this.root = insert(word,this.root);
	}

	private Node insert(String word, Node root) {
		//System.out.println("insert");
		if (root == null) {
			//System.out.println("insert 1");
			Node newNode = new Node(word);
			return newNode;
		} 
		if (word.compareTo(root.getData()) < 0) {
			//System.out.println("insert 2");
			root.setLeftChild(insert(word, root.getLeftChild()));
		} else if (word.compareTo(root.getData()) == 0) {
			//System.out.println("insert 3");
			root.setNbrOccurence(root.getNbrOccurence() +1);
		}else {
			//System.out.println("insert 4");
			root.setRightChild(insert(word, root.getRightChild()));			
		}
		return root;
	}
	
	public void list() {
		list(this.root);
	}
	
	private void list(Node root) {
		//System.out.println("list");
		if (root != null) {
			list(root.getLeftChild());
			System.out.println(root.getData() + root.getNbrOccurence());
			list(root.getRightChild());
		}
	}
}
