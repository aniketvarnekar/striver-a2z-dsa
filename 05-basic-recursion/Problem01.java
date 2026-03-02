public class Problem01 {

     /**
     * Prints the given name N times using recursion.
     *
     * The function prints the name and recursively calls itself
     * while incrementing the count until the base condition is met.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void printName(String name, int count, int n) {
        // Base Case - if count equals n, stop recursion
        if (count == n) {
            return;
        }

        // Print the name
        System.out.println(name);

        // Recursive call with incremented count
        printName(name, ++count, n);
    }

    public static void main(String[] args) {
        int n = 5;
        String name = "Aniket";
        
        printName(name, 0, n);
    }

}