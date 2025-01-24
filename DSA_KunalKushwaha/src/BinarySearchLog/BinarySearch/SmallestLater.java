package BinarySearchLog.BinarySearch;

public class SmallestLater {
    public static void main(String[] args) {
    char [] letters = {'c', 'f', 'j'};
    char target = 'a';
    int ans = SmallLetter(letters, target);
    System.out.println(ans);
    }

    static char SmallLetter(char [] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + end - start / 2;
             if (target < letters[mid]) {
                end =  mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }

}
