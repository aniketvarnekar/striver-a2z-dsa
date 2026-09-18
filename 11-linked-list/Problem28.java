public class Problem28 {

    /**
     * Detects a cycle in a singly linked list and returns
     * the node where the cycle begins.
     *
     * The algorithm works in two phases:
     *
     * 1. Cycle Detection:
     *    Move slow by one node and fast by two nodes.
     *    If they meet, a cycle exists.
     *
     * 2. Cycle Start Detection:
     *    Move slow back to the head.
     *    Then move both pointers one node at a time.
     *    The node where they meet is the beginning of the cycle.
     *
     * If fast reaches null, there is no cycle.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Phase 1: Detect whether a cycle exists
        while (fast != null && fast.next != null) {
            // Move slow by one node            
            slow = slow.next;

            // Move fast by two nodes            
            fast = fast.next.next;

            // The pointers meet only if a cycle exists
            if (slow == fast) {
                // Phase 2: Find the beginning of the cycle                
                slow = head;

                // Move both pointers one node at a time
                // until they meet at the cycle's starting node
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the node where the cycle begins
                return slow;
            }
        }

        // No cycle exists
        return null;
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

        head = detectCycle(head);

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