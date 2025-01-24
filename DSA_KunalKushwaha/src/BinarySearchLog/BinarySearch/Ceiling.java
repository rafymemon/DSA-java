package BinarySearchLog.BinarySearch;

public class Ceiling {
    // Ceiling : Smallest of the greatest number than target
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 55, 65, 67 , 87, 99, 132, 234 };
        int target = 75;
        int ans = Ceil(arr, target);
        System.out.println("The Ceiling element of the target number is on the index :"+ans);
    }

    static int Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target > arr[end]) {
                return -1;
            }
        }
        return start;
    
}
}
