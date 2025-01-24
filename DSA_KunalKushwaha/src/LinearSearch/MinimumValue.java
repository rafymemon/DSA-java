package LinearSearch;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = { 12, 33, -4, 5, 22, 4 };
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

        /*
         * int min = arr[0];
         * for (int i = 1; i < arr.length; i++) {
         * if (arr[i] < min) {
         * min = arr[i];
         * }
         * }
         * return ans;
         */
    }
}
