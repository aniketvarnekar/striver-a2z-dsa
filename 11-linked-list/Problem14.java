public class Problem14 {

    /**
     * Deletes the head node of a doubly linked list.
     *
     * The second node becomes the new head.
     * The new head's prev pointer is set to null,
     * and the deleted node is disconnected from
     * the remaining list.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    private static Node deleteHead(Node head) {
        // Empty list or single-node list        
        if (head == null || head.next == null) {
            return null;
        }

        Node oldHead = head;
        
        // Move the head to the next node        
        head = head.next;
        // The new head has no previous node        
        head.prev = null;
        // Disconnect the old head from the list        
        oldHead.next = null;

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

        head = deleteHead(head);

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