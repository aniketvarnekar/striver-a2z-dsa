public class Problem08 {

    /**
     * Inserts a new node at the beginning
     * of a singly linked list.
     *
     * The new node points to the current head
     * and then becomes the new head.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    private static Node insertHead(Node head, int value) {
        // Create the new node        
        Node newNode = new Node(value);

        // Point the new node to the current head        
        newNode.next = head;

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
            current.next = new Node(arr[i]);
            current = current.next;
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
        int value = 60;

        head = insertHead(head, value);

        printLinkedList(head);
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}