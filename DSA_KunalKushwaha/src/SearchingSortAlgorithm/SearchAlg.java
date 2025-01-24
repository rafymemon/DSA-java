package SearchingSortAlgorithm;

import java.util.Arrays;

public class SearchAlg {
    public static void main(String[] args) {
int [] arr = {23,43,45,33,233,534,9,0,59,8,-3,-4,-43,-433};
Search(arr);
System.out.println(Arrays.toString(arr));
    }

    static void Search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapping(arr, maxIndex, last);
        }
    }

    static void swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}