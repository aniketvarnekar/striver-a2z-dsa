public class Problem20 {

    /**
     * Inserts a new node at the kth position of a doubly
     * linked list.
     *
     * The method handles the following cases:
     * - Inserting at the head
     * - Inserting in the middle
     * - Inserting at the tail
     * - k greater than the valid insertion position
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertKthNode(Node head, int value, int k) {
        // Inserting at the first position        
        if (k == 1) {
            Node newNode = new Node(value);
            
            // Link the new node to the existing head            
            newNode.next = head;
            
            // Update the prev pointer of the existing head            
            if (head != null) {
                head.prev = newNode;
            }
            
            // Return the new node as the new head            
            return newNode;
        }

        Node current = head;
        int count = 0;

        // Traverse the list to reach the node before position k
        while (current != null) {
            count++;

            if (count == k - 1) {
                Node next = current.next;
                Node newNode = new Node(value);

                // Inserting at the end of the list
                if (next == null) {
                    newNode.prev = current;
                    current.next = newNode;
                    return head;
                }

                // Link the new node between current and next
                newNode.prev = current;
                newNode.next = next;

                // Update the surrounding nodes
                current.next = newNode;
                next.prev = newNode;

                return head;
            }

            current = current.next;
        }

        // k is beyond the valid insertion range
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
        
        int value = 25;

        int k = 3;

        head = insertKthNode(head, value , k);

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