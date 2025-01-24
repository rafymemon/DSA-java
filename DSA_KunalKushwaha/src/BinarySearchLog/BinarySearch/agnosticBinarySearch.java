package BinarySearchLog.BinarySearch;

public class agnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = { 99, 87, 32, 22, 11, 10, 4, 3, 2, -5, -8 };
        int target = 87;
        int ans = AGS(array, target);
        System.out.println(ans);
    }

    static int AGS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAccending = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (isAccending) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
