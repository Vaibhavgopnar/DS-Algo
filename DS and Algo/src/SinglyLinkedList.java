
class Node {
	int data;
	Node next;
	
	public static  Node newNode(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		return n;
	}
}

public class SinglyLinkedList {

	public Node addNode(int data, Node head) {
		Node temp = head;
		Node n = Node.newNode(data);
		if(head == null)
			return n;
		while(head.next != null) {
			head = head.next;
		}
		head.next = n;
		return temp;
	}
	
	public void printList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public Node addAtFront(Node node, Node head) {
		if(head == null) {
			return node;
		}
		node.next = head;
		return node;
	}
	
	public int size(Node head) {
		int size = 0;
		while(head != null) {
			size++;
			head = head.next;
		}
		return size;
	}
	
	public Node find(Node head, int data) {
		while(head != null) {
			if(head.data == data) {
				return head;
			}
			head = head.next;
		}
		return null;
	}
	
	public Node insertNodeAtPosition(Node head, int data, int position ) {
		Node temp = head;
		Node newNode = Node.newNode(data);
		if(size(head)<position) 
			System.out.println("Linked list is asmaller than the position");
		for(int i = 0; i<position-2 && head != null; i++) {
			head = head.next;
		}
		newNode.next = head.next;
		head.next = newNode;
		return temp;
	}
	
	public Node deleteNode(Node head, int position) {
		Node temp = head;
		Node nextNode;
		if(head == null) {
			return head;
		}
		if(position == 0) {
			temp = head.next;
			return temp;
		}
		if(size(head)< position) {
			System.out.println("Linked list is asmaller than the position");
			return head;
		}
		for(int i = 0; i<position-2 && head != null; i++) {
			head = head.next;
		}
		nextNode = head.next.next;
		head.next = nextNode;
		
		return temp;
	}
	
	public static void main(String[] args) {

		SinglyLinkedList ll = new SinglyLinkedList();
		Node head = null;
		head = ll.addNode(1, head);
		head = ll.addNode(2, head);
		head = ll.addNode(3, head);
		head = ll.addNode(4, head);
		Node newNode = Node.newNode(0);
		head = ll.addAtFront(newNode, head);
		head = ll.insertNodeAtPosition(head, 5, 6);
		head = ll.deleteNode(head, 2);
		ll.printList(head);
		System.out.println("Size is - "+ll.size(head));
		if(ll.find(head, 3) != null) {
			System.out.println("Data present in the linkedlist ");
		}
		else
			System.out.println("Data not present in the linkedlist ");
	}

}
