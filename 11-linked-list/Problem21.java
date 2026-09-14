public class Problem21 {

    /**
     * Inserts a new node containing the given value before
     * the first node whose data matches the target value.
     *
     * The method handles the following cases:
     * - Empty linked list
     * - Target is the head node
     * - Target is a middle node
     * - Target is the last node
     * - Target is not present
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertBeforeValue(Node head, int value, int target) {
        // Empty list       
        if (head == null) {
            return null;
        }

        // Target is the head node
        if (head.data == target) {
            Node newNode = new Node(value);

            // Link the new node before the current head            
            newNode.next = head;
            head.prev = newNode;

            // Return the new node as the new head            
            return newNode;
        }

        Node current = head;

        // Traverse the list and check the next node
        // for the target value
        while (current.next != null) {
            if (current.next.data == target) {
                Node next = current.next;
                Node newNode = new Node(value);

                // Link the new node between current and next
                newNode.prev = current;
                newNode.next = next;

                // Update the surrounding nodes
                current.next = newNode;
                next.prev = newNode;

                // Only the first matching target is considered
                return head;
            }

            current = current.next;
        }

        // Target value is not present in the list
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

        int target = 30;

        head = insertBeforeValue(head, value , target);

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