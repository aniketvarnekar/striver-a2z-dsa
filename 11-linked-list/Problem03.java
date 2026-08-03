public class Problem03 {

    /**
     * Searches for a target value in a
     * singly linked list.
     *
     * The list is traversed from head to tail
     * until the target is found or the end
     * of the list is reached.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static boolean search(Node head, int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }

            current = current.next;
        }

        return false;
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

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};

        Node head = arrayToLinkedList(arr);

        int target = 40;

        boolean result = search(head, target);

        System.out.println(result);
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}