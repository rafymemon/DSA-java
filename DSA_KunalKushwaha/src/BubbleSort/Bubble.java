package BubbleSort;
// Swapping the adjacent element in Bubble sort...!
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] Bubblearr = { -5, -2, -3, 6, 0, 34, 64, 644, 5, -5533 };
        BubbleSorting(Bubblearr);
        System.out.println(Arrays.toString(Bubblearr));
    }

    static void BubbleSorting(int[] Bubblearr) {
        boolean swapped;
        // Run the step (n-1) time
        for (int i = 0; i < Bubblearr.length; i++) {
            swapped = false;
            // For each step, maz item will come at the last respective index
            for (int j = 1; j < Bubblearr.length - i; j++) {
                // Swap if item is smaller than the previous one
                if (Bubblearr[j] < Bubblearr[j - 1]) {
                    // Swap
                    int temp = Bubblearr[j];
                    Bubblearr[j] = Bubblearr[j - 1];
                    Bubblearr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
