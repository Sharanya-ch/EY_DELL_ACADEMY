package EY1808;

import java.util.Scanner;

class LinkedListNode{
	
	int data;
	LinkedListNode next;
	
	LinkedListNode(int data){
		this.data = data;
		this.next = null; 
	}
}
	
public class LinkedList{
	LinkedListNode head;
		
	LinkedListNode  insertInBeginning(int key,LinkedListNode head) {
	LinkedListNode ttmp = new LinkedListNode(key);
			
			if(head == null) {
				head = ttmp;
			}else {
				ttmp.next = head;
				head = ttmp;
			}
			return head;
		}
		
		LinkedListNode insertInEnd(int key, LinkedListNode head) {
			LinkedListNode ttmp = new LinkedListNode(key);
			LinkedListNode ttmp1 = head;
			
			if(ttmp1 == null) {
				head = ttmp;
			}else {
				while((ttmp1.next != null))
					ttmp1.next= ttmp;
				head = ttmp;
			}
			return head;
		}
		
		LinkedListNode insertAtPos(int key,int pos,  LinkedListNode head) {
			LinkedListNode ttmp = new LinkedListNode(key);
			
			
			if(pos == 1) {
				ttmp.next = head;
				head = ttmp;
			}else {
				LinkedListNode ttmp1 = head;
				while((ttmp1.next != null))
					ttmp1.next= ttmp;
				head = ttmp;
			}
			return head;
		}
		
		
		LinkedListNode delete(int pos, LinkedListNode head) {
			LinkedListNode ttmp = head;
			if(pos == 1) 
				head = ttmp.next;
			else {
				for(int i = 1; ttmp !=null && i<pos -1; i++)
					ttmp = ttmp.next;
				ttmp.next = ttmp.next.next;
			}
			return head;
		}
		
		
		int length(LinkedListNode head) {
			LinkedListNode ttmp = head;
			int c= 0;
			if(ttmp == null)
				return 0;
			else {
				while(ttmp!=null) {
					ttmp= ttmp.next;
					c++;
				}
			}
			return c;
		
	}
		
		LinkedListNode reverse(LinkedListNode head) {
			LinkedListNode prevLNode =null, currNode = head, nextLNode = null;
			while(currNode !=null) {
				nextLNode = currNode.next;
				currNode.next = prevLNode;
				
				
				prevLNode = currNode;
				currNode = nextLNode;
			}
		
			head = prevLNode;
			return head;
			
		}
		
		void display(LinkedListNode head) {
			LinkedListNode ttmp = head;
			while(ttmp !=null) {
				System.out.println(ttmp.data + " ");
				ttmp = ttmp.next;
				
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList demo = new LinkedList();
		demo.head = null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n*******Menu Options ***********");
			System.out.println("\\n1. Insert in End");
			System.out.println("\\n2. Insert in Beg");
			System.out.println("\\n3. Insert in particular position");
			System.out.println("\\n4. Delete at a pos");
			System.out.println("\\n5. length");
			System.out.println("\\n6. Reverse");
			System.out.println("\\n7. Display");
			System.out.println("\\n8. Exit");
			System.out.println("\n Enter your choice:  ");

			int n = in.nextInt();
			switch(n) {
			case 1 : 
				System.out.println("Enter the value");
				demo.head = demo.insertInEnd(in.nextInt(), demo.head);
				break;
				
			case 2 : 
				System.out.println("Enter the value");
				demo.head = demo.insertInBeginning(in.nextInt(), demo.head);
				break;
				
			case 3 : 
				System.out.println("Enter the value");
				demo.head = demo.insertAtPos(in.nextInt(), in.nextInt(),demo.head);
				break;
			case 4 : 
				demo.head = demo.insertInEnd(in.nextInt(), demo.head);
				break;
			case 5 : 
				System.out.println(demo.length(demo.head));
				break;
			case 6 : 
				demo.head = demo.reverse(demo.head);
				break;
			case 7 : 
				demo.display(demo.head);
				break;
			case 8: 
				System.exit(0);
				break;
			default:
				System.out.println("\n Wrong Option!!");
				break;
				
				
			}
			System.out.println("/n  Do you want to continue...");
			
		}while(in.nextInt() == 1);
		

	}

}
