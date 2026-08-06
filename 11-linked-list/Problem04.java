public class Problem04 {

    /**
     * Deletes the head node of a
     * singly linked list.
     *
     * The second node becomes the new
     * head of the list.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    private static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
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

        head = deleteHead(head);
        
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