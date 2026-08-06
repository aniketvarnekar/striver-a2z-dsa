public class Problem07 {

    /**
     * Deletes the first node containing
     * the specified value from a singly
     * linked list.
     *
     * If the value is not found, the
     * original linked list is returned.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node deleteNode(Node head, int value) {
        // Empty linked list        
        if (head == null) {
            return null;
        }

        // Delete the head node
        if (head.data == value) {
            return head.next;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            // Delete the matching node            
            if (current.data == value) {
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
        int value = 30;

        head = deleteNode(head, value);
        
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