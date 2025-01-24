package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumValue {
    public static void main(String[] args) {
        int[][] array = {
                { 12, 34, 22, 65, 77 },
                { 23, 43, 53, 35, 26 },
                { 87, 35, 5, 88, 89 },
                { 55, 99, 67, 23, 54 }
        };
     System.out.println(MaximumValueSearch(array));
    }
    static int MaximumValueSearch(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }
}
