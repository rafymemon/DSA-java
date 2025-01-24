package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 23, 22, 55 },
                { 43, 44, 65, 26 },
                { 32, 66, 54, 86, 25 },
                { 20, 12 }
        };
        int target = 86;
        int[] ans = search(array, target);
        System.out.println(Arrays.toString(ans));
        System.out.println();
    }

    static int[] search(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int coloumn = 0; coloumn < array[row].length; coloumn++) {
                if (array[row][coloumn] == target) {
                    return new int[] { row, coloumn };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
