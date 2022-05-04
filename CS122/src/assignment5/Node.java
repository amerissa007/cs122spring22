package assignment5;

public class Node {
	private Node next;
	private Object element;

	public Node(){
		next = null;
		element = null;
	}

	public Node(Object element){
		next = null;
		this.element = element;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}

}