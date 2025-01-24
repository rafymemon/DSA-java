// Find the number of digits that are even in th e given array

package LinearSearch;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = { 1, 28, 46, 653, 354, -6422, 834 };
        System.out.println(EvenSearch(nums));

        System.out.println(digits(452874)); // Number of digits present in the number
        System.out.println(digits2(452874)); // another way to find digits of the numbers
    }

    static int EvenSearch(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int NumberOfDigits = digits(num);
        if (NumberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    // 2nd method to find digits of the numbers
    static int digits2(int num){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}
