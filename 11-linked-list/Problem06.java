public class Problem06 {

    /**
     * Deletes the k-th node (1-based index)
     * from a singly linked list.
     *
     * If k is greater than the length of the
     * list, the linked list remains unchanged.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node deleteKthNode(Node head, int k) {
        // Empty linked list        
        if (head == null) {
            return null;
        }

        // Delete the head node
        if (k == 1) {
            return head.next;
        }

        int count = 0;
        Node current = head;
        Node prev = null;

        while (current != null) {
            count++;

            // Delete the k-th node
            if (count == k) {
                prev.next = current.next;
                break;
            }

            prev = current;
            current = current.next;
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
        int k = 3;

        head = deleteKthNode(head, k);
        
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