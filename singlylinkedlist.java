class Node {
	int value; // Data inside the node
	Node next; // Reference to next node
	
	public Node(int value){
		this.value = value; // references to class variable 'value'
		this.next = null; // Since we're making a single node, we know that the next node in the link will be null
		
	}
} // end of class Node

public class SinglyLinkedList { // Insert function and all other functions related to length list will gon into this class
	
	Node start; // this node will be the start of the singly linked list
	
	public void insert(int value){
		// value we need to insert
		Node current = start; // making node current and setting it equal to start
		
		while(current.next != null){ //Keeps looping until null is found in the next current
			current = current.next; // Keeps moving to the next node 'current'
			// Keep on changing the value of current until null is reached
			
		}
		
		Node newNode = new Node(value); // Creating a new node and sending in the value
		// the object of class Node is made and constructor is called on the value
		
		current.next = newNode; //null is removed and newNodewill be attached from current.next
		
	}
	
	// Print the values
	public void printValues(){
		
		Node current = start; // Start printing at the first node
		
		while(current != null){ // Loops until it reaches null
			System.out.println(current.value); // Print the value of 'current'
			current = current.next; // prints the next node
		}
	}
	
	// Delete function
	public void deleteNode(int value){ // int value is the value we want to delete
		
		// Delete the starting value
		if (value == start.value){ // if the value in the argument is equal to the start value (5)
			start = start.next; // changing start value (5) to the next one (6)
			return;
		}
		
		// Delete the middle value
		Node current = start;
		while (current .next.value != value){ // We use current.next because it will make the first value the starting value
			current = current.next; // moves current to the next
			
		}
		current.next = current.next.next; // sets the next value's next to it's next (making 6 skip 7 and point at 8)
		
		
	}
	
	// Search Function
	public void  search(int value){ // value we want to search
		
		// Move thru every element of linked list to find searched value
		Node current = start;
		
		while (current != null){
			
			if (current.value == value){ // tells us value is in list
				System.out.println("Value is in linked list");
				return;
			}
			
			current = current.next; // keeps moving onto the next current until our searched value (or null) is reached
		}
		
		System.out.println("Value not found"); // if selected value is not in linked list, print this
	}

	public static void main(String[] args) {
		
		// Make an object of class SinglyLinkedList
		SinglyLinkedList linkedList = new SinglyLinkedList(); // Empty object
		// Make start node
		linkedList.start = new Node(5); // Making the start variable of SinglyLinkedList to the new node which equals 5
		// Write insert function
		linkedList.insert(6);
		linkedList.insert(7);
		linkedList.insert(8);
		linkedList.insert(9);
		/* These insert functions will make our linked list look like this:
		5 -> 6 -> 7 -> 8 -> 9 -> null
		*/
		
		// Test the print function
//		linkedList.printValues();
		
		// Delete values from linkedList
		linkedList.deleteNode(7);
//		linkedList.deleteNode(5);
		linkedList.printValues(); // see which node was successfully deleted
		
		// Search for value
		linkedList.search(8);
		linkedList.search(13);
		
		
	}
	
}
