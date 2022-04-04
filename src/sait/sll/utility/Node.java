package sait.sll.utility;

import java.io.Serializable;

public class Node implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3693462533497555947L;
	private Object element;
	private Node nextNode;
	
	
	//Constructs a node with element o and successor n
	public Node(Object o, Node n) {
		this.element = o;
		this.nextNode = n;
	}
	
	// Constructs a tail Node
	public Node(Object o) {
		this.element = o;
		this.nextNode = null;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	 
}