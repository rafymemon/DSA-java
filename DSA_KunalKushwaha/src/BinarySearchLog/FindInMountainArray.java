package BinarySearchLog;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,0,-1,-2,-4,-6};
        int target = 4;
        int ans = Find(arr, target, target, target);
        System.out.println(ans);
    }

    int search(int[] arr, int target) {
        int peak = peakInMountainSearch(arr);
        int firstTry = Find(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return Find(arr, target, peak + 1, arr.length - 1);

    }

    static int peakInMountainSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int Find(int[] arr, int target, int start, int end) {
        boolean checkDecending = arr[start] > arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (checkDecending) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
