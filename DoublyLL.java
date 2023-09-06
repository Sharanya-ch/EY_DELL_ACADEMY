package EY2508;

public class DoublyLL {
	
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	Node head,tail = null;
	public void addItem(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			head.previous= null;
			tail.next = null;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
		
	}
	//will print all nodes of the list
	public  void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while(current !=null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
	}
	
	public static void main(String[] args) {
		DoublyLL obj = new DoublyLL();
		obj.addItem(10);obj.addItem(15);obj.addItem(10);obj.addItem(10);obj.addItem(20);
		obj.display();
	}

}