public class Problem01 {

    /**
     * Converts an array into a singly
     * linked list.
     *
     * The first element becomes the head,
     * and every subsequent element is
     * appended to the end of the list.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static Node arrayToLinkedList(int[] arr) {
        // Empty array
        if (arr.length == 0) {
            return null;
        }

        // Create the head node
        Node head = new Node(arr[0]);
        Node current = head;

        // Append the remaining nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    /**
     * Prints all nodes of the linked list.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
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