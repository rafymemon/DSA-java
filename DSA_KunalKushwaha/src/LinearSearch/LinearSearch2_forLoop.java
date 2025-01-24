package LinearSearch;

public class LinearSearch2_forLoop {
   
    static int search(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run for a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // line will execute and if no return value above are executed 
        //hence the value doesn't found
        return -1;
       
    }
     public static void main(String[] args) {
        int[] num = { 1, 33, 44, 55, 23, 77, 88 };
        int target = 88;
        int ans = search(num, target);
        System.out.println(ans);
    }

}
