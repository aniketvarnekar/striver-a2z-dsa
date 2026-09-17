public class Problem27 {

    /**
     * Determines whether the linked list contains a cycle.
     *
     * Two pointers are used:
     * - slow moves one node at a time
     * - fast moves two nodes at a time
     *
     * If a cycle exists, the fast pointer will eventually
     * meet the slow pointer inside the cycle.
     *
     * If fast reaches null or fast.next reaches null,
     * the linked list does not contain a cycle.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Move slow by one node and fast by two nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Both pointers are at the same node,
            // which means a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end of the list,
        // so no cycle exists
        return false;
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

        boolean result = hasCycle(head);

        System.out.println(result);
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}