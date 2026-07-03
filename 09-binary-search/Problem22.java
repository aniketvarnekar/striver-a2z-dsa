public class Problem22 {


    /**
     * Finds the minimum possible value of the maximum
     * pages assigned to any student.
     *
     * Each student receives contiguous books and every
     * student must receive at least one book.
     *
     * Returns -1 if allocation is impossible.
     *
     * Uses Binary Search on the answer space:
     * [maximum pages in a single book, total pages].
     *
     * Time Complexity: O(N * log S)
     * where S is the sum of all pages.
     *
     * Space Complexity: O(1)
     */
    private static int findPages(int[] arr, int m) {
        // More students than books
        if (m > arr.length) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Determine search space
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int low = max;
        int high = sum;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = calculateStudents(arr, mid);

            // Allocation is possible
            if (students <= m) {
                result = mid;
                high = mid - 1;
            } 
            // More pages are required            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Calculates the minimum number of students
     * required if each student can be assigned
     * at most 'pages' pages.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateStudents(int[] arr, int pages) {
        int students = 1;
        int studentPages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (studentPages + arr[i] > pages) {
                students++;
                studentPages = arr[i];
            } else {
                studentPages += arr[i];
            }
        }

        return students;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {12, 34, 67, 90};
        int m = 2;

        int result = findPages(arr, m);

        System.out.println(result);
    }

}