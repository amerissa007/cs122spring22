package assignment5;

import java.util.NoSuchElementException;

public class LinkedQueue implements QueueADT{

	private Node front, back;
	private int numElements;

	public LinkedQueue() {
		front = null;
		back = null;
		numElements = 0;
	}
	@Override
	public void enqueue(Object item) {
		Node node = new Node(item);
		if (back == null){
			front = node;
			back = node;
		}else{
			back.setNext(node);
			back = back.getNext();
		}
		numElements++ ;
	}

	@Override
	public Object dequeue() {
		if (isEmpty() )
			throw new NoSuchElementException("Underflow Exception");
		Node node = front;
		front = node.getNext();
		if (front == null)
			back = null;
		numElements-- ;
		return node.getElement();
	}

	@Override
	public boolean isEmpty() {
		if(front == null)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		return true;
	}

	@Override
	public int size() {
		return numElements;
	}

	public String toString(){
		String result = "\n";
		Node temp = front;
		while(temp != null){
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}

