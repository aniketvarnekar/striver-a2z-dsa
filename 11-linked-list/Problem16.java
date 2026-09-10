public class Problem16 {

    /**
     * Deletes the kth node from a doubly linked list.
     *
     * The position k is 1-based, meaning the first node
     * is considered to be at position 1.
     *
     * The method handles the following cases:
     * - Empty linked list
     * - Deleting the only node
     * - Deleting the head node
     * - Deleting the last node
     * - Deleting a node from the middle
     * - k greater than the length of the list
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node deleteKthNode(Node head, int k) {
        // Empty list        
        if (head == null) {
            return null;
        }

        Node current = head;
        int count = 0;

        // Traverse the list until the kth node is found
        while (current != null) {
            count++;

            if (count == k) {
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
                current.next = null;
                current.prev = null;
                
                return head;
            }

            current = current.next;
        }

        // k is greater than the length of the list
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
        
        int k = 3;

        head = deleteKthNode(head, k);

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