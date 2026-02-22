/**
 * Pattern 22: Print a square where each cell is (size - min distance to nearest edge); values decrease toward center.
 */
public class Pattern22 {

    private static void printPattern(int size) {
        for (int i = 0; i < (2 * size) - 1; i++) {
            for (int j = 0; j < (2 * size) - 1; j++) {
                int top = i;
                int bottom = 2 * (size - 1) - i;
                int left = j;
                int right = 2 * (size - 1) - j;

                int value = size - Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}