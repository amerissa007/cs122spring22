package assignment5;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueADT q = new LinkedQueue();
		System.out.println("\nEnqueuing chocolate, cake, pie, truffles: ");
		q.enqueue("chocolate");
		q.enqueue("cake");
		q.enqueue("pie");
		q.enqueue("truffles");

		System.out.println("\nHere is the queue: " + q);
		System.out.println("\nIt contains "+ q.size() + " items. ");

		System.out.println("Dequeuing two...");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		System.out.println("\nEnqueuing cookies, profiteroles, mousse, cheesecake, ice cream: ");
		q.enqueue("cookies");
		q.enqueue("profiteroles");
		q.enqueue("mousse");
		q.enqueue("cheesecake");
		q.enqueue("ice cream");

		System.out.println("\nHere is the queue again: " + q);
		System.out.println("\nNow it contains "+ q.size() + " items. ");

		System.out.println("\nDequeuing everything in the queue");
		while(!q.isEmpty()){
			System.out.println(q.dequeue());
		}

		System.out.println("\nNow it contains "+ q.size() + " items. ");

		if(q.isEmpty())
			System.out.println("\nQueue is empty.");
		else
			System.out.println("\nQueue is not empty -- why not?!!!");
	}

}