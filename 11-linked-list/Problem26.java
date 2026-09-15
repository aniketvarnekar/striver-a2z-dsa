public class Problem26 {

    /**
     * Finds and returns the middle node of a singly linked list.
     *
     * Two pointers are used:
     * - slow moves one node at a time
     * - fast moves two nodes at a time
     *
     * When fast reaches the end of the list, slow will be
     * pointing to the middle node.
     *
     * For an even-sized list, slow points to the second
     * of the two middle nodes.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        // Move slow by one node and fast by two nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow points to the middle node
        return slow;
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

        head = middleNode(head);

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