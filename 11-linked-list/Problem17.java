public class Problem17 {

    /**
     * Deletes the first node containing the given value
     * from a doubly linked list.
     *
     * The method handles the following cases:
     * - Empty linked list
     * - Deleting the only node
     * - Deleting the head node
     * - Deleting the last node
     * - Deleting a node from the middle
     * - Value not present in the list
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */    
    private static Node deleteNode(Node head, int value) {
        // Empty list        
        if (head == null) {
            return null;
        }

        Node current = head;

        // Traverse the list until the first matching node is found
        while (current != null) {
            if (current.data == value) {
                Node prev = current.prev;
                Node next = current.next;

                // The list contains only one node
                if (prev == null && next == null) {
                    return null;
                }

                // Deleting the head node
                if (prev == null) {
                    next.prev = null;
                    current.next = null;
                    return next;
                }

                // Deleting the last node
                if (next == null) {
                    prev.next = null;
                    current.prev = null;
                    return head;
                }

                // Deleting a node from the middle
                prev.next = next;
                next.prev = prev;

                // Disconnect the deleted node from the list
                current.prev = null;
                current.next = null;

                // Only the first matching node is deleted
                return head;
            }

            current = current.next;
        }

        // Value is not present in the list
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
        
        int value = 30;

        head = deleteNode(head, value);

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