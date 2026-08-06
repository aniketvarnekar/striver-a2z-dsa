public class Problem05 {

    /**
     * Deletes the tail node of a
     * singly linked list.
     *
     * The list is traversed until the
     * second-last node, whose next pointer
     * is then set to null.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node deleteTail(Node head) {
        // Empty list or single-node list        
        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;

        // Reach the second-last node
        while (current.next.next != null) {
            current = current.next;
        }
        
        // Remove the last node        
        current.next = null;

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

        head = deleteTail(head);
        
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