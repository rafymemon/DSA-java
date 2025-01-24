package LinearSearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 , 6},
                { 2 , 5 , 4 , 1},
                {4 , 5 , 3 , 2}
        };
        System.out.println(Wealth(array));

    }

    static int Wealth(int[][] array) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < array.length; person++) {
            int sum = 0;
            for (int account = 0; account < array[person].length; account++) {
                sum += array[person][account];
            }


            if (sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
