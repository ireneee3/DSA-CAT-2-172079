class LinkedList {
    // Inner class to define the structure of a node
  
   class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
           this.next = null;
       }
   }

   private Node head;

   // Insert a node at the beginning

   public void insertAtBeginning(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }

   // Insert a node at the end
   public void insertAtEnd(int data) {
       Node newNode = new Node(data);
       if (head == null) {
           head = newNode;
           return;
       }
       Node temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }
       temp.next = newNode;
   }

   // Delete a node from the beginning
   public void deleteFromBeginning() {
       if (head == null) {
           System.out.println("List is empty");
           return;
       }
       head = head.next;
   }

   // Display the linked list
   public void display() {
       Node temp = head;
       while (temp != null) {
           System.out.print(temp.data + " -> ");
           temp = temp.next;
       }
       System.out.println("null");
   }

   public static void main(String[] args) {
       LinkedList list = new LinkedList();   // Create new linked list

       // Insert nodes at the beginning
       list.insertAtBeginning(3);
       list.insertAtBeginning(2);
       list.insertAtBeginning(1);
       list.display(); // Expected: 1 -> 2 -> 3 -> null

       // Insert nodes at the end
       list.insertAtEnd(4);
       list.insertAtEnd(5);
       list.display(); // Expected: 1 -> 2 -> 3 -> 4 -> 5 -> null

       // Delete the first node
       list.deleteFromBeginning();
       list.display(); // Expected: 2 -> 3 -> 4 -> 5 -> null
   }
}