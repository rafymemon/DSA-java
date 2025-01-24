package BinarySearchLog.BinarySearch;

public class Floor {
    //Floor : Greatest of the smallest number than the target
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 55, 65, 67 , 87, 99, 132, 234};
        int target = 433;
        int ans = FloorSearch(arr, target);
        System.out.println("Floor element of the target element is at the index : "+ans);
    }
    static int FloorSearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
            // if (target > arr[end]) {
            //     return -1;
            // }
        }
        return end;
    }
}
