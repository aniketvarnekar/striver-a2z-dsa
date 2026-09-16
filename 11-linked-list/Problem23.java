public class Problem23 {

    /**
     * Reverses a singly linked list recursively.
     *
     * The recursion reaches the last node, which becomes the
     * new head. During the return phase, each node is attached
     * after its next node to reverse the links.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     * 
     * Space is O(N) because of the recursive call stack.
     */
    private static Node reverseLinkedListRecursive(Node head) {
        // Base case:
        // An empty list or a single-node list is already reversed        
        if (head == null || head.next == null) {
            return head;
        }

        // Store the next node before making the recursive call
        Node next = head.next;

        // Recursively reverse the remaining list
        Node newHead = reverseLinkedListRecursive(next);

        // Make the next node point back to the current node
        next.next = head;

        // The current node becomes the last node of the
        // reversed portion, so its next pointer must be null        
        head.next = null;

        // Return the head of the completely reversed list
        return newHead;
    }

    /**
     * Reverses a singly linked list iteratively.
     *
     * Three pointers are used:
     * - prev: points to the previous node
     * - current: points to the node currently being processed
     * - next: temporarily stores the next node before changing
     *         the current node's next pointer
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node reverseLinkedList(Node head) {
        // Empty list or single-node list is already reversed        
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;

        // Reverse the next pointer of each node
        while (current != null) {
            // Store the next node before changing the pointer            
            Node next = current.next;

            // Reverse the current node's next pointer
            current.next = prev;

            // Move prev and current one step forward
            prev = current;
            current = next;
        }

        // prev points to the new head of the reversed list
        return prev;
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

        head = reverseLinkedList(head);

        printLinkedList(head);

        head = reverseLinkedListRecursive(head);

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