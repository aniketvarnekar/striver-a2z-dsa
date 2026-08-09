public class Problem10 {

    /**
     * Inserts a new node at the k-th position
     * of a singly linked list.
     *
     * The position is 1-based.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertKthNode(Node head, int value, int k) {
        // If inserting at the first position,
        // the new node becomes the new head.        
        if (k == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        int count = 0;

        // Traverse until the (k - 1)-th node
        while (current != null) {
            count++;

            if (count == k - 1) {
                // Create the new node                
                Node newNode = new Node(value);
                
                // Connect the new node to
                // the current k-th node                
                newNode.next = current.next;

                // Connect the previous node
                // to the new node                
                current.next = newNode;
                break;
            }

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
        int value = 60;
        int k = 3;

        head = insertKthNode(head, value, k);

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