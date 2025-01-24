package BinarySearchLog.BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] array = { -15, 1, 3, 5, 6, 7, 8, 25, 54, 75, 88 };
        int target = 54;
        int ans = BinarySearch(array, target);
        System.out.println(ans);

    }

    static int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
