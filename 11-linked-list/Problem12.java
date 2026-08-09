public class Problem12 {

    /**
     * Inserts a new node after the first
     * node containing the target value.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static Node insertAfterValue(Node head, int value, int target) {
        // Empty linked list        
        if (head == null) {
            return null;
        }

        Node current = head;

        // Traverse the linked list
        while (current != null) {
            // Find the first node containing
            // the target value            
            if (current.data == target) {
                // Create the new node                
                Node newNode = new Node(value);

                // Connect the new node to
                // the node after current                
                newNode.next = current.next;

                // Insert the new node after current
                current.next = newNode;

                // Insert only after the
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

        head = insertAfterValue(head, value, target);

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