package BinarySearchLog;
 
public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 5, 10, 23, 44, 56, 76, 87, 99, 797, 6564 };
        int target = 44;
        System.out.println(ansOfInfi(array, target));
    }

    static int ansOfInfi(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (target > array[end]) {
            int temp = end + 1;
            // Double the value of box now
            // end = end + (end + size of box*2)
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return Binary(array, target, start, end);
    }

    static int Binary(int[] array, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
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