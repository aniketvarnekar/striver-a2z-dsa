public class Problem09 {

    /**
     * Inserts a new node at the end
     * of a singly linked list.
     *
     * The list is traversed until the last
     * node is reached, and the new node is
     * attached to its next pointer.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertTail(Node head, int value) {
        // Create the new node        
        Node newNode = new Node(value);

        // If the list is empty,
        // the new node becomes the head
        if (head == null) {
            return newNode;
        }

        Node current = head;

        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Attach the new node at the tail
        current.next = newNode;

        return head;
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

        head = insertTail(head, value);

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