public class Problem13 {

    /**
     * Converts an array into a doubly linked list.
     *
     * Each node maintains a reference to both
     * the previous and the next node.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static Node arrayToLinkedList(int[] arr) {
        // Empty array        
        if (arr.length == 0) {
            return null;
        }

        // Create the first node.
        // Its prev pointer remains null because
        // it is the first node in the list.
        Node head = new Node(arr[0]);
        Node current = head;

        // Create the remaining nodes
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            
            // Connect the new node to
            // the current node in the backward direction            
            newNode.prev = current;

            // Connect the current node to
            // the new node in the forward direction            
            current.next = newNode;

            // Move current to the newly created node
            current = newNode;
        }

        return head;
    }

    /**
     * Prints all nodes of the linked list.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
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