public class Problem24 {

    /**
     * Reverses a doubly linked list iteratively.
     *
     * For each node, the prev and next pointers are swapped.
     * After swapping, the old next node becomes the previous
     * node to process.
     *
     * The current node is assigned to head during traversal,
     * so the last processed node becomes the new head.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node reverseLinkedList(Node head) {
        // Empty list or single-node list is already reversed       
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        // Traverse the list and swap prev and next pointers
        while (current != null) {
            // Store the original previous node            
            Node prev = current.prev;

            // Swap the prev and next pointers
            current.prev = current.next;
            current.next = prev;

            // Current node becomes the new head
            head = current;

            // Move to the next node in the original list
            // which is now stored in current.prev
            current = current.prev;
        }

        return head;
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

        head = reverseLinkedList(head);

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