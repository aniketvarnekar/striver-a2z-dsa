public class Problem18 {

    /**
     * Inserts a new node at the beginning of a doubly linked list.
     *
     * The new node becomes the new head of the list.
     * If the list is not empty, the new node is connected
     * to the existing head using the next and prev pointers.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    private static Node insertHead(Node head, int value) {
        // Create the new node        
        Node newNode = new Node(value);
        
        // If the list is empty, the new node becomes the head        
        if (head == null) {
            return newNode;
        }
        
        // Link the new node to the existing head        
        newNode.next = head;
        head.prev = newNode;

        // Return the new node as the new head        
        return newNode;
    }

    private static Node arrayToLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            
            newNode.prev = current;

            current.next = newNode;

            current = newNode;
        }

        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};

        Node head = arrayToLinkedList(arr);
        
        int value = 5;

        head = insertHead(head, value);

        printLinkedList(head);
    }

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}