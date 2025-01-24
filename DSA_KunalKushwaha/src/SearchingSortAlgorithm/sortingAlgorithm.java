package SearchingSortAlgorithm;

public class sortingAlgorithm {
    public static void main(String[] args) {
int [] arr = {4,3,53,52,6};
        sort(arr);
       for(int i=0; i< arr.length; i++)
           System.out.println(arr[i]);

    }
    public static void sort(int []arr){
        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}
