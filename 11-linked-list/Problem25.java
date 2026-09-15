public class Problem25 {

    /**
     * Deletes the given node from a singly linked list.
     *
     * The previous node cannot be accessed, so the current
     * node cannot be directly disconnected from the list.
     *
     * Instead, copy the next node's value into the current node
     * and then skip the next node.
     *
     * The given node must not be the last node.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    private static void deleteNode(Node node) {
        // Copy the next node's value into the current node        
        node.data = node.next.data;

        // Skip the next node        
        node.next = node.next.next;
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

        deleteNode(head.next.next);

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