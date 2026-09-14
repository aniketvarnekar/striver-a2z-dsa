public class Problem22 {

    /**
     * Inserts a new node containing the given value after
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
    private static Node insertAfterValue(Node head, int value, int target) {
        // Empty list        
        if (head == null) {
            return null;
        }

        Node current = head;

        // Traverse the list until the first matching node is found
        while (current != null) {
            if (current.data == target) {
                Node next = current.next;
                Node newNode = new Node(value);

                // Target is the last node
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
        
        int value = 35;

        int target = 30;

        head = insertAfterValue(head, value , target);

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