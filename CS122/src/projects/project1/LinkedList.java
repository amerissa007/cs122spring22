

package projects.project1;
public class LinkedList {
	private IntNode front; 
	private IntNode list;

	public LinkedList() {
		front = null;
		list = null;
	}

	public void add(int val) {
		IntNode node = new IntNode(val,null);
		if(this.list==null){
			this.list = node;
		} else {
			IntNode current = list;

			while(current.next != null)
				current = current.next;

			current.next = node;
		}
	}


	public void addToFront(int val) {
		front = new IntNode(val, front);

	}

	public void addToEnd(int val) {
		IntNode newnode = new IntNode(val, null);
		if (front == null)
			front = newnode;
		else {
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newnode;
		}
	}
	public void removeFirst() {
		if (front != null)
			front = front.next;
	}

	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}

	private class IntNode {
		public int val;
		public IntNode next;

		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		} 
	}

	public  int length1() {
		int count = 0;
		IntNode temp = front;
		while (temp != null) {
			count = count + 1;
			temp = temp.next;
		}
		return count;
	}
	public void clear() {
		front = null;	

	}


	public String toString() {

		String s = "";

		IntNode current = front;
		while(current != null)	
		{
			s += current.val + " -> ";
			current = current.next;
		}

		s+= "null";
		return s;
	}

	public void removeLast()
	{
		if (front != null)
		{
			IntNode current = front;
			IntNode previous = null;

			while (current.next != null)
			{
				previous = current;
				current = current.next;
			}

			if (previous == null)
			{
				front = null;
			}
			else
			{
				previous.next = null;
			}
		}
	}


}