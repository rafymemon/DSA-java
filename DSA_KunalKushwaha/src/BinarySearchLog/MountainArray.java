package BinarySearchLog;

public class MountainArray {
    public static void main(String[] args) {
    int [] array  = {1,2,3,4,5,6,5,4,3,2,1};
    int ans  = MountainCheck(array);
    System.out.println(ans);
    }

    static int MountainCheck(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < array[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        // In the end, start == end pointing out the largest number because of the above
        // start and end points are always trying to check the maximum value in above
        // hence, when they are pointing to just one element, that is the maximum one
        // because that is what the above says
        // More eleboration : at every point of time for start and end, they have the
        // best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible answer
        return start; // or you can return end (bcz both are equal...!)
    }

}
