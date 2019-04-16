package node;

public class Node {
	private String data;
	private int nbrOccurence =1;
	private Node rightChild, leftChild;
	
	//CONSTRUCTOR
	public Node(String data) {
		this.data = data;
	}
	//GETTER
	public String getData(){
		return this.data;
	}
	public Node getRightChild(){
		return this.rightChild;
	}
	public Node getLeftChild(){
		return this.leftChild;
	}
	public int getNbrOccurence(){
		return this.nbrOccurence;
	}
	//SETTER
	public void setData(String data) {
		this.data = data;
	}
	public void setRightChild(Node rc) {
		this.rightChild = rc;
	}
	public void setLeftChild(Node lc) {
		this.leftChild = lc;
	}
	public void setNbrOccurence(int nbOcc) {
		this.nbrOccurence = nbOcc;
	}

	
}
