public class Problem11 {

    /**
     * Inserts a new node before the first
     * node containing the target value.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertBeforeValue(Node head, int value, int target) {
        // Empty linked list        
        if (head == null) {
            return null;
        }

        // If the head contains the target,
        // the new node becomes the new head.
        if (head.data == target) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        // Check the next node because
        // insertion needs to happen before it.
        while (current.next != null) {
            if (current.next.data == target) {
                // Create the new node                
                Node newNode = new Node(value);
                
                // Connect the new node to
                // the target node                
                newNode.next = current.next;

                // Connect the previous node
                // to the new node                
                current.next = newNode;

                // Insert only before the
                // first occurrence                
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
        int target = 30;

        head = insertBeforeValue(head, value, target);

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