public class Problem15 {

    /**
     * Deletes the tail node of a doubly linked list.
     *
     * The previous node becomes the new tail.
     * The new tail's next pointer is set to null,
     * and the deleted node is disconnected from
     * the list.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node deleteTail(Node head) {
        // Empty list or single-node list        
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;

        // Traverse to the last node
        while (tail.next != null) {
            tail = tail.next;
        }

        // Get the node before the tail
        Node newTail = tail.prev;
        // Disconnect the new tail from the old tail        
        newTail.next = null;
        // Disconnect the old tail from the list        
        tail.prev = null;

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

        head = deleteTail(head);

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