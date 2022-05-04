package assignment5;

public interface QueueADT {

	public void enqueue(Object item);
	public Object dequeue();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}


